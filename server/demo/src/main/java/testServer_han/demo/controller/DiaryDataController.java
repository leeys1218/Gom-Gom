package testServer_han.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import testServer_han.demo.model.*;
import testServer_han.demo.runPython.Diary_python;
import testServer_han.demo.service.TestService;
import testServer_han.demo.service.YoutubeService;

import java.util.HashMap;
import java.util.List;


@Controller
@RequiredArgsConstructor
public class DiaryDataController {
    private final TestService testService;

    @GetMapping("loadDiary")
    @ResponseBody
    public Diary getDiary(@RequestParam("user_id") String user_id, @RequestParam("date") int date) {
        //get diary data from DB
        Diary diary = new Diary();
        diary = testService.getDiary(user_id, date);
        return diary;
    }

    @GetMapping("loadCalender")
    @ResponseBody
    public Calender getCalender(@RequestParam("user_id") String user_id) {
        //get Calender data from DB
        List<HashMap<String, String>> dbData = testService.getCalender(user_id);
        Calender calender = new Calender();
        calender.convert(dbData);
        return calender;
    }

    @PostMapping("predictEmo")
    @ResponseBody
    public PredictRes predictEmo(@RequestBody PredictReq predictReq) throws Exception {
        Diary_python diary_python = new Diary_python();
        PredictRes predictRes = new PredictRes();
        System.out.println(predictReq.getContent());
        //predictRes.convert(diary_python.predictEmo(predictReq.getContent()));
        predictRes.test();
        System.out.println("complete python");
        testService.predictEmo(
                predictReq.getUser_id(), predictReq.getTitle(), predictReq.getContent(),
                predictReq.getDate(), 1);
        predictRes.setWord(testService.getWord(predictReq.getUser_id(), predictReq.getDate()));
        System.out.println("complete server");
        return predictRes;
    }

    @GetMapping("recommend")
    @ResponseBody
    public RecomRes recommend(@RequestParam("user_id") String user_id, @RequestParam("date") int date) throws Exception {
        HashMap<String, String> recomData = testService.getRecomData(user_id, date);
        Diary_python diary_python = new Diary_python();
        RecomRes recomRes = new RecomRes();
        List<String> movieList = diary_python.recommendation(recomData.get("content"), "movie");
        List<String> songList = diary_python.recommendation(recomData.get("emotion_name"), "song");
        for(int i = 0; i < 3; i++) {
            recomRes.putMovie(movieList.get(i), YoutubeService.getThumbnail(movieList.get(i), "movie"));
        }
        for(int i = 0; i < 3; i++) {
            recomRes.putSong(songList.get(i), YoutubeService.getThumbnail(songList.get(i), "song"));
        }
        return recomRes;
    }
}
