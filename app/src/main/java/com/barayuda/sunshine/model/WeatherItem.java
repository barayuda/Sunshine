package com.barayuda.sunshine.model;

import java.util.List;

/**
 * Created by barayuda on 5/13/17.
 */

public class WeatherItem {
    private long dt;
    private Temp temp;
    private List<Weathers> weather;

    @Override
    public String toString() {
        return "WeatherItem{" +
                "dt=" + dt +
                ", temp=" + temp +
                ", weather=" + weather +
                '}';
    }
}
