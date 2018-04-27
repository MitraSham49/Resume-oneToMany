package com.example.demo;

import javax.persistence.*;

@Entity
public class Work {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String jobTitle;
    private String organization;
    @ManyToOne()
    private  Person LeadPerson;

    public Work(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Person getLeadPerson() {
        return LeadPerson;
    }

    public void setLeadPerson(Person leadPerson) {
        LeadPerson = leadPerson;
    }
}
