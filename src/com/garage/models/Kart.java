package com.garage.models;

import com.garage.models.factory.FactoryId;

public class Kart {

    private String id;
    private String name;
    private String registrationNumber;
    private Boolean withGoPro;

    public Kart(String name, String registrationNumber, Boolean withGoPro) {
        this.id = "10";
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.withGoPro = withGoPro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Boolean getWithGoPro() {
        return withGoPro;
    }

    public void setWithGoPro(Boolean withGoPro) {
        this.withGoPro = withGoPro;
    }

    @Override
    public String toString() {
        return "Kart{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", withGoPro=" + withGoPro +
                '}';
    }

}
