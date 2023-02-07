package testServer_han.demo.model;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

@Getter
@Setter
public class PredictRes {
    String firstEmo;
    String word;
    HashMap<String, Integer> emotions;

    public PredictRes() {
        emotions = new HashMap<String, Integer>();
    }

    public void test() {
        emotions.put("행복", 0);
        emotions.put("슬픔", 5);
        emotions.put("화남", 5);
        emotions.put("중립", 0);
        emotions.put("불안", 0);
        firstEmo = "슬픔";
    }
    public void convert(Vector<String> emoIdxs) {
        int happy = 0; int sad = 0; int angry = 0; int natural = 0; int fear = 0;
        for(int i = 0; i < emoIdxs.size(); i++) {
            if(emoIdxs.get(i).equals("0")) { happy++; }
            if(emoIdxs.get(i).equals("1")) { sad++; }
            if(emoIdxs.get(i).equals("2")) { angry++; }
            if(emoIdxs.get(i).equals("3")) { natural++; }
            if(emoIdxs.get(i).equals("4")) { fear++; }
        }
        emotions.put("행복", happy);
        emotions.put("슬픔", sad);
        emotions.put("화남", angry);
        emotions.put("중립", natural);
        emotions.put("불안", fear);
        firstEmo = emotions.entrySet().stream().max((m1, m2) -> m1.getValue() > m2.getValue() ? 1 : -1).get().getKey();
    }
}
