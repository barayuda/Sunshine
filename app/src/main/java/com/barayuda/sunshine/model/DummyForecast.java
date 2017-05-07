package com.barayuda.sunshine.model;

/**
 * Created by barayuda on 5/7/17.
 */

public class DummyForecast {
    private String day;
    private String weather;
    private int maxTemp;
    private int minTemp;
    private int weatherID;

    public DummyForecast(String day, String weather, int maxTemp, int minTemp, int weatherID) {
        this.day = day;
        this.weather = weather;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.weatherID = weatherID;
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWeather() {
        return this.weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getMaxTemp() {
        return this.maxTemp + "\u00b0";
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getMinTemp() {
        return this.minTemp + "\u00b0";
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public int getWeatherID() {
        return this.weatherID;
    }

    public void setWeatherID(int weatherID) {
        this.weatherID = weatherID;
    }

    @Override
    public String toString() {
        return "DummyForecast{" +
                "day='" + day + '\'' +
                ", weather='" + weather + '\'' +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", weatherID=" + weatherID +
                '}';
    }


}
