package com.barayuda.sunshine.model;

import java.util.List;

/**
 * Created by barayuda on 5/13/17.
 */

public class DailyForecast {
    private City city;
    private List<WeatherItem> list;

    public List<WeatherItem> getList() {
        return list;
    }

    public void setList(List<WeatherItem> list) {
        this.list = list;
    }

    public DailyForecast(City city) {

        this.city = city;
    }

    public City getCity() {

        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "DailyForecast{" +
                "city=" + city +
                ", list=" + list +
                '}';
    }
}
