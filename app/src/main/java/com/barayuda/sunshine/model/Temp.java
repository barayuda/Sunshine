package com.barayuda.sunshine.model;

/**
 * Created by barayuda on 5/13/17.
 */

public class Temp {
    private Double min;
    private Double max;

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getMin() {

        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }

    public String getResolvedTemp(double temp) {
        int result = (int) temp;
        return result+"\u00b0";
    }
}
