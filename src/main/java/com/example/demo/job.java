package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=4)
    private String titleOne;
    @NotNull
    @Size(min=3)
    private String employerOne;
    @NotNull
    @Size(min=10)
    private String descriptionOne;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitleOne() {
        return titleOne;
    }

    public void setTitleOne(String titleOne) {
        this.titleOne = titleOne;
    }

    public String getEmployerOne() {
        return employerOne;
    }

    public void setEmployerOne(String employerOne) {
        this.employerOne = employerOne;
    }

    public String getDescriptionOne() {
        return descriptionOne;
    }

    public void setDescriptionOne(String descriptionOne) {
        this.descriptionOne = descriptionOne;
    }
}