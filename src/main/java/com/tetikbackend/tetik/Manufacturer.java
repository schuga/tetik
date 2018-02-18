package com.tetikbackend.tetik;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by suior on 16.02.2018.
 */
@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;


    public Manufacturer(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }




}