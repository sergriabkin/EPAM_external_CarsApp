package com.companyname.service;

import com.companyname.entity.Brand;
import com.companyname.entity.Car;
import com.companyname.repository.CarsRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class CarsService {
    private CarsRepository repository;

    public CarsService(CarsRepository repository) {
        this.repository = repository;
    }

    public List<Car> findByBrand(String brand) {

        return repository.findByBrand(brand);
    }

    private List<Car> findByModel(String brand, String model) {
        return repository.findByModel(brand, model);
    }

    public List<Car> findByModelAndYearsInUse(String brand, String model, int yearsInUse) {
        int year = LocalDateTime.now().getYear() - yearsInUse;
        return findByModel(brand, model).stream()
                .filter(car -> car.getYear() <= year)
                .collect(Collectors.toList());
    }

    private List<Car> findByYear(Integer year) {
        return repository.findByYear(year);
    }

    public List<Car> findByYearAndPrice(Integer year, Integer priceMoreThan) {
        return findByYear(year).stream()
                .filter(car -> car.getPrice() > priceMoreThan)
                .collect(Collectors.toList());
    }


}
