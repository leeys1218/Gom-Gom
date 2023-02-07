package testServer_han.demo.runPython;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Diary_python {
    public Vector<String> predictEmo(String diary) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("python3", "predict/predict_emo.py", diary);
        Process p = pb.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), "euc-kr"));
        Vector<String> res = new Vector<String>();
        try {
            String line = "";
            while ((line = br.readLine()) != null) {
                res.add(line);
                System.out.println(line);
            }
        } finally { try {if (br != null) { br.close(); }} catch(Exception e) { e.printStackTrace(); }}
        return res;
    }

    public List<String> recommendation(String diary, String recom) throws Exception {
        if (recom.equals("movie")) { recom = "Recom_movie/recom_movie.py"; }
        if (recom.equals("song")) { recom = "Recom_song/recom_song.py"; }
        ProcessBuilder pb = new ProcessBuilder("python", recom, diary);
        Process p = pb.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), "euc-kr")); // 서브 프로세스가 출력하는 내용을 받기 위해

        List<String> res= new ArrayList<>();
        try {
            String line = "";
            while ((line = br.readLine()) != null) {
                res.add(line);
            }
            System.out.println(res);
        } finally { try { if (br != null) { br.close(); }}  catch(Exception e) { e.printStackTrace();} }
        return res;
    }
}
