package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forcast")
    public List<Forecast> forecastList = new ArrayList<>();
}
