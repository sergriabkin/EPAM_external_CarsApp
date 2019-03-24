package com.companyname.ui;

import com.companyname.entity.Car;
import com.companyname.service.CarsService;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

    private CarsService service;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleUI(CarsService service) {
        this.service = service;
    }

    public void run() {
        int option = 0;
        boolean isSelected = false;

        while (!isSelected) {
            System.out.println("Please choose the option:");
            System.out.println("1 - to select cars by brand");
            System.out.println("2 - to select cars by model and older some years");
            System.out.println("3 - to select cars by year and more expensive than some value");

            option = scanner.nextInt();

            if (option > 0) isSelected = true;
        }

        switch (option) {
            case 1: carsByBrand();
                break;
            case 2: carsByModelAndYears();
                break;
            case 3: carsByYearAndPrice();
                break;
            default:
                System.out.println("Not supported option.");
        }


        System.out.println("\nWish to continue?");
        System.out.println("YES / NO");
        if (scanner.next().equalsIgnoreCase("YES")) run();
        System.out.println("Bye!");
        scanner.close();
    }

    //Utility methods:

    private void carsByBrand(){
        System.out.println("Enter the brand below:");
        print(service.findByBrand(scanner.next()));
    }

    private void carsByModelAndYears(){
        System.out.println("Enter the brand below:");
        String brand = scanner.next();
        System.out.println("Enter the model below:");
        String model = scanner.next();
        System.out.println("Enter minimum years in use below:");
        int years = scanner.nextInt();
        print(service.findByModelAndYearsInUse(brand, model, years));
    }

    private void carsByYearAndPrice(){
        System.out.println("Enter the year of cars below:");
        int year = scanner.nextInt();
        System.out.println("Enter minimum price below:");
        int price = scanner.nextInt();
        print(service.findByYearAndPrice(year, price));
    }

    private void print(List<Car> list) {
        System.out.println("\nSelected cars:\n");
        list.forEach(System.out::println);
    }

}
