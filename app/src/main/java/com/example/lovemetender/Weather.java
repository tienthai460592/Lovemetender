package com.example.lovemetender;

class Weather {

    private int degree;
    private String weatherDesc;


    public Weather(int degree, String weatherDesc) {

        this.degree = degree;
        this.weatherDesc = weatherDesc;

    }

    public int getDegree() {

        return degree;

    }

    public void setDegree(int degree) {

        this.degree = degree;

    }

    public String getWeatherDesc() {

        return weatherDesc;

    }

    public void setWeatherDesc(String weatherDesc) {

        this.weatherDesc = weatherDesc;

    }
}
