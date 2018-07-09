import db.DBGolfer;
import models.Golfer;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Donald", "Trump", 72);
        DBGolfer.save(golfer1);
    }

}
