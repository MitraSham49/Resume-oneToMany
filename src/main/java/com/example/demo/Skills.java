package com.example.demo;

import javax.persistence.*;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String skill;
    private String perficiency;
    @ManyToOne()
    private  Person LeadPerson;

    public Skills(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getPerficiency() {
        return perficiency;
    }

    public void setPerficiency(String perficiency) {
        this.perficiency = perficiency;
    }

    public Person getLeadPerson() {
        return LeadPerson;
    }

    public void setLeadPerson(Person leadPerson) {
        LeadPerson = leadPerson;
    }
}
