package testServer_han.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class YoutubeDto {
    private HashMap<Integer, String> movie;
    private HashMap<Integer, String> song;

    public YoutubeDto() {
        movie = new HashMap<Integer, String>();
        song = new HashMap<Integer, String>();
    }
}
