package com.example.springjpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "springjpa_person")
public class Person implements Serializable {
    private static final long serialVersionUID = 3297423984732894L;
    
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private Integer age;

    public Person() {
        firstName = "";
        lastName = "";
        age = null;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}