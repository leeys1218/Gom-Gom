package testServer_han.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class Calender {
    HashMap<String, String> calender;

    public Calender() {
        calender = new HashMap<String, String>();
    }
    public void convert(List<HashMap<String, String>> dbData) {
        for (HashMap<String, String> data : dbData){
            calender.put(String.valueOf(data.get("date")), String.valueOf(data.get("emotion_name")));
        }
    }
}
