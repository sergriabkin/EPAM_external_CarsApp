package com.companyname.entity;

public class Car extends CarModel {
//    id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
    private final Long id;
    private final Integer year;
    private final CarColor color;
    private Integer price;
    private String registrationNumber;

    private static Long counter = 1L;

    public Car(Brand brand, String model, Integer year, CarColor color, Integer price, String registrationNumber) {
        super(brand, model);
        counter = counter + 10 + (int)(Math.random()*10);
        this.id = counter;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public Car(Brand brand, String model, Integer year, CarColor color) {
        this( brand, model, year, color, null, null);
    }

    public Car(Brand brand, String model, Integer year, CarColor color, Integer price) {
        this( brand, model, year, color, price, null);
    }

    public Car(Brand brand, String model, Integer year, CarColor color, String registrationNumber) {
        this( brand, model, year, color, null, registrationNumber);
    }

    public Car(Brand brand, Integer year, CarColor color, Integer price, String registrationNumber) {
        super(brand);
        counter = counter + 10 + (int)(Math.random()*10);
        this.id = counter;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public Car(Brand brand, Integer year, CarColor color) {
        this(brand, year, color, null, null);
    }

    public Car(Brand brand, Integer year, CarColor color, Integer price) {
        this(brand,  year, color, price, null);
    }

    public Car(Brand brand, Integer year, CarColor color, String registrationNumber) {
        this(brand, year, color, null, registrationNumber);
    }


    public Integer getYear() {
        return year;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", year=" + year +
                ", color=" + color +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                "} " + super.toString();
    }
}
