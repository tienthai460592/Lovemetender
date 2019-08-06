package com.example.lovemetender;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private Weather weather;
    private List<Destination> destinations;

    public Location(String name, Weather weather) {
        this.name = name;
        this.weather = weather;
        destinations = new ArrayList<>();
    }

    public Location(String name) {
        this.name = name;
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

    public List<Destination> getDestinations() {
        return destinations;
    }
}
