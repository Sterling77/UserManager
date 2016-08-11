package springBootApp.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Letricia on 8/9/16.
 */

@Entity
@Table(name = "users")
public class User {

    // An auto-generated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   //this auto populates ID
    private long id;

    @NotNull
    private String email;

    @NotNull
    private String name;

//    @NotNull
//    private int age;
//
//    @NotNull
//    private double salary;

    // Public methods

    public User() {
    }

    public User(long id) {
        this.id = id;
    }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }
//        this.id = id;
//        this.age = age;
//        this.salary = salary;

        public long getId() {
            return id;
        }public void setId(long id) {
            this.id = id;
        }public String getEmail() {
            return email;
        }public void setEmail(String email) {
            this.email = email;
        }public String getName() {
            return name;
        }public void setName(String name) {
            this.name = name;
        }
}

