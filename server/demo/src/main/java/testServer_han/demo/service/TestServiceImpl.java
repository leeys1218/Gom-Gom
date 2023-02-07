package testServer_han.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import testServer_han.demo.mapper.*;
import testServer_han.demo.model.*;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    @Override
    public Diary getDiary(String user_id, int date) {
        return testMapper.getDiary(user_id, date);
    }

    @Override
    public List<HashMap<String, String>> getCalender(String user_id) {
        return testMapper.getCalender(user_id);
    }

    @Override
    public String predictEmo(String user_id, String title, String content, int date, int emotionIdx) {
        return testMapper.predictEmo(user_id, title, content, date, emotionIdx);
    }

    @Override
    public HashMap getRecomData(String user_id, int date) {
        return testMapper.getRecomData(user_id, date);
    }

    @Override
    public String getWord(String user_id, int date) { return testMapper.getWord(user_id, date); };
}
