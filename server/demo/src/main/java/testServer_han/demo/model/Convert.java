package testServer_han.demo.model;

public class Convert {
    public static int emoToIdx(String emo) {
        int idx = 0;
        if(emo.equals("행복")) { idx = 0; }
        if(emo.equals("슬픔")) { idx = 1; }
        if(emo.equals("화남")) { idx = 2; }
        if(emo.equals("중립")) { idx = 3; }
        if(emo.equals("불안")) { idx = 4; }
        return idx;
    }
}
