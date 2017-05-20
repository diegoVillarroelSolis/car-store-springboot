package com.dh.project.demo.domain;

import java.util.Date;

/**
 * Created by Cristhian on 19/05/2017.
 */
public class Assignment {
    private long id;
    private String name;
    private String className;

    public Assignment(long id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
