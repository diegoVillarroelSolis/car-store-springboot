package com.dh.project.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Cristhian on 25/05/2017.
 */
@Document
public class Room {
    @Id
    private String id;
    private String name;

    public Room(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Room() {}
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
