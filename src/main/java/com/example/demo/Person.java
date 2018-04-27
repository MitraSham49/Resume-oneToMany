package com.example.demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private long id;


    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    @OneToMany(mappedBy = "leadPerson")
    private Set<Skills> mySkills;
    @OneToMany(mappedBy = "leadPerson")
    private Set<Work> myWorks;
    @OneToMany(mappedBy = "leadPerson")
    private Set<Education> myEducations;
    public  Person(){
        mySkills = new HashSet<>();
        myWorks =  new HashSet<>();
        myEducations = new HashSet<>();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Skills> getMySkills() {
        return mySkills;
    }

    public void setMySkills(Set<Skills> mySkills) {
        this.mySkills = mySkills;
    }

    public Set<Work> getMyWorks() {
        return myWorks;
    }

    public void setMyWorks(Set<Work> myWorks) {
        this.myWorks = myWorks;
    }

    public Set<Education> getMyEducations() {
        return myEducations;
    }

    public void setMyEducations(Set<Education> myEducations) {
        this.myEducations = myEducations;
    }

    public Person(String lastName) {
        this.lastName = lastName;
        mySkills = new HashSet<>();
        myWorks =  new HashSet<>();
        myEducations = new HashSet<>();

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mySkills=" + mySkills +
                ", myWorks=" + myWorks +
                ", myEducations=" + myEducations +
                '}';
    }
}
