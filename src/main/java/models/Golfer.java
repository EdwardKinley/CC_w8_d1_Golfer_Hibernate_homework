package models;

import javax.persistence.*;

@Entity
@Table(name="golfers")

public class Golfer {

    private String firstName;
    private String lastName;
    private int age;

    public Golfer() {}

    public Golfer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



}
