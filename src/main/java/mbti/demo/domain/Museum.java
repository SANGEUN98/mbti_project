package mbti.demo.domain;
import lombok.Data;

@Data
public class Museum {
    private String museum;
    private String x;
    private String y;
    private byte[] picture;

    @Override
    public String toString() {
        return "Drama{" +
                "numb=" + museum +
                ", title1='" + x + '\'' +
                ", startDay='" + y + '\'' +
                ", endDay='" + picture + '\'' +
                '}';
    }
}

