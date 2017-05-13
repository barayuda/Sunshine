package com.barayuda.sunshine.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by barayuda on 5/13/17.
 */

public class WeatherItem {
    private long dt;
    private Temp temp;
    private List<Weathers> weather;

    public WeatherItem(long dt) {
        this.dt = dt;
    }

    public List<Weathers> getWeather() {
        return weather;
    }

    public void setWeather(List<Weathers> weather) {
        this.weather = weather;
    }

    public Temp getTemp() {

        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public long getDt() {


        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "WeatherItem{" +
                "dt=" + dt +
                ", temp=" + temp +
                ", weather=" + weather +
                '}';
    }

    public String getReadableTime(long dt) {
        Date date = new Date(this.dt * 1000L);
        DateFormat dateFormat = new SimpleDateFormat("EEEE");
        return dateFormat.format(date);
    }
}
