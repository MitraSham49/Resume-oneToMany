package com.example.demo;

import javax.persistence.*;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String degree;
    private String institution;
    @ManyToOne()
    private Person leadPerson;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }


    public Person getLeadPerson() {
        return leadPerson;
    }

    public void setLeadPerson(Person leadPerson) {
        this.leadPerson = leadPerson;
    }
}
