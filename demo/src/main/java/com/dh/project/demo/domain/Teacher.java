package com.dh.project.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Transient;


/**
 * Created by Cristhian on 19/05/2017.
 * POJO
 * //averiguar sobre esto
 */
@Document
public class Teacher {
    @Id
    //@Transient
    private String id;
    private String name;

    public Teacher(){}

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
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
}
