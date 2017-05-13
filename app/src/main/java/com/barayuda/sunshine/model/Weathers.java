package com.barayuda.sunshine.model;

/**
 * Created by barayuda on 5/13/17.
 */

public class Weathers {
    private int id;
    private String main;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMain() {

        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public Weathers(int id) {

        this.id = id;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Weathers{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
