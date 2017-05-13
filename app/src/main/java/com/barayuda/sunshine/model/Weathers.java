package com.barayuda.sunshine.model;

/**
 * Created by barayuda on 5/13/17.
 */

public class Weathers {
    private int id;
    private String main;
    private String description;

    @Override
    public String toString() {
        return "Weathers{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
