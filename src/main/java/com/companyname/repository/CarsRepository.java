package com.companyname.repository;

import com.companyname.entity.Brand;
import com.companyname.entity.Car;
import com.companyname.entity.CarModel;

import java.util.*;

public class CarsRepository {
    private List<Car> cars;

    public CarsRepository(Car car, Car... cars) {
        this.cars = new ArrayList<>();
        this.cars.add(car);
        this.cars.addAll(Arrays.asList(cars));
    }

    public CarsRepository(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findByBrand(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().toString().equalsIgnoreCase(Brand.valueOf(brand.toUpperCase()).toString())) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findByModel(String brand, String model) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().toString().equalsIgnoreCase(Brand.valueOf(brand.toUpperCase()).toString())
                    && car.getModel().equalsIgnoreCase(model)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findByYear(Integer year) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear().equals(year)) {
                result.add(car);
            }
        }
        return result;
    }


}
