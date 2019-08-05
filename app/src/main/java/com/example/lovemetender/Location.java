package com.example.lovemetender;

public class Location {
    private String name;
    private Weather weather;

    public Location(String name, Weather weather) {
        this.name = name;
        this.weather = weather;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
