package testServer_han.demo.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PredictReq {
    String user_id;
    String title;
    String content;
    int date;
}
