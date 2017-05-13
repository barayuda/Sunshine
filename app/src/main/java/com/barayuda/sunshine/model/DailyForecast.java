package com.barayuda.sunshine.model;

import java.util.List;

/**
 * Created by barayuda on 5/13/17.
 */

public class DailyForecast {
    private City city;
    private List<WeatherItem> list;

    @Override
    public String toString() {
        return "DailyForecast{" +
                "city=" + city +
                ", list=" + list +
                '}';
    }
}
