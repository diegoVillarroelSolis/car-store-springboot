package com.dh.project.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Cristhian on 19/05/2017.
 */
@Document
public class Student {
    @Id
    private String id;
    private String name;
    private long ci;
    private long codsis;

    public Student(){}

    public Student(String id, String name, long ci, long codsis) {
        this.id = id;
        this.name = name;
        this.ci = ci;
        this.codsis = codsis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public long getCodsis() {
        return codsis;
    }

    public void setCodsis(long codsis) {
        this.codsis = codsis;
    }
}
