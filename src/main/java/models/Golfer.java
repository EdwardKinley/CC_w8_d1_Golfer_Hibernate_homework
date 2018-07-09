package models;

import javax.persistence.*;

@Entity
@Table(name="golfers")
public class Golfer {

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Golfer(){}

    public Golfer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    @Column(name = "first_name")
    public String getFirstName() { return firstName; }

    public void setFirstName(String newFirstName) { this.firstName = newFirstName; }

    @Column(name = "last_name")
    public String getLastName() { return lastName; }

    public void setLastName(String newLastName) { this.lastName = newLastName; }

    @Column(name = "age")
    public int getAge() { return age; }

    public void setAge(int newAge) { this.age = newAge; }

    public String prettyName() { return firstName + " " + lastName; }

}
