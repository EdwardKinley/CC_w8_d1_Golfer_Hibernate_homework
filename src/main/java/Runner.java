import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Donald", "Trump", 72);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Samuel L", "Jackson", 69);
        DBGolfer.save(golfer2);

        Golfer golfer3 = new Golfer("Robert", "Carlyle", 57);
        DBGolfer.save(golfer3);

        List<Golfer> golfers = DBGolfer.getAll();

        System.out.println(DBGolfer.findById(2).prettyName());
        System.out.println(DBGolfer.findByFirstName("Robert").prettyName());
        System.out.println(DBGolfer.findByLastName("Jackson").prettyName());
        System.out.println(DBGolfer.findByAge(57).prettyName());
        System.out.println(DBGolfer.findOlderThan(60));


        System.exit(0);
    }

}