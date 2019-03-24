package com.companyname.entity;

public abstract class CarModel {

    private final Brand brand;
    private final String model;

    public CarModel(Brand brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public CarModel(Brand brand) {
        this.brand = brand;
        this.model = chooseDefaultModel(brand);
    }

    private String chooseDefaultModel(Brand brand){
        switch (brand){
            case BMW: return "X5";
            case FORD: return  "Focus";
            case HONDA: return "Civic";
            case MAZDA: return "3";
            default: throw new IllegalArgumentException("UNKNOWN CAR");
        }
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                '}';
    }
}
