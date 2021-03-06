package com.dh.project.demo.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Cristhian on 26/05/2017.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long ci;
    private Long codsis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCi() {
        return ci;
    }

    public void setCi(Long ci) {
        this.ci = ci;
    }

    public long getCodsis() {
        return codsis;
    }

    public void setCodsis(Long codsis) {
        this.codsis = codsis;
    }
}
