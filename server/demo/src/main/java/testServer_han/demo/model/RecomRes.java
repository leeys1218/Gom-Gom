package testServer_han.demo.model;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class RecomRes {
    private HashMap<String, String> movie;
    private HashMap<String, String> song;

    public RecomRes() {
        movie = new HashMap<String, String>();
        song = new HashMap<String, String>();
    }

    public void putMovie(String title, String thumnail) {
        movie.put(title, thumnail);
    }

    public void putSong(String title, String thumnail) {
        song.put(title, thumnail);
    }
}