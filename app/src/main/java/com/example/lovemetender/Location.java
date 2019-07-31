package com.example.lovemetender;

public class Location {
    private String imageSrc;
    private String name;
    private String introduction;
    private String type;
    private String openingHours;
    private boolean tenderService;

    public Location(String imageSrc, String name, String introduction, String type, String openingHours, boolean tenderService) {
        this.imageSrc = imageSrc;
        this.name = name;
        this.introduction = introduction;
        this.type = type;
        this.openingHours = openingHours;
        this.tenderService = tenderService;
    }

    public Location(String name, String introduction, String type, String openingHours) {
        this.name = name;
        this.introduction = introduction;
        this.type = type;
        this.openingHours = openingHours;
    }

    public Location() {
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public boolean isTenderService() {
        return tenderService;
    }

    public void setTenderService(boolean tenderService) {
        this.tenderService = tenderService;
    }
}
