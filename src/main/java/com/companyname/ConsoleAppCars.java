package com.companyname;

import com.companyname.entity.Brand;
import com.companyname.entity.Car;
import com.companyname.entity.CarColor;
import com.companyname.repository.CarsRepository;
import com.companyname.service.CarsService;
import com.companyname.ui.ConsoleUI;

public class ConsoleAppCars {

    public static void main(String[] args) {
        Car car1 = new Car(Brand.BMW, "X5",2015,  CarColor.RED, 15000, "AA5566BB");
        Car car2 = new Car(Brand.BMW,2010,  CarColor.RED, 10000);
        Car car3 = new Car(Brand.BMW,2012,  CarColor.RED, 12000, "AA9922BB");
        Car car4 = new Car(Brand.FORD, "Mustang",2015,  CarColor.RED, 25000);
        Car car5 = new Car(Brand.FORD, "Focus" ,2012,  CarColor.RED, 12000);
        Car car6 = new Car(Brand.FORD,2010,  CarColor.RED, 10000);
        Car car7 = new Car(Brand.MAZDA, "3", 2018,  CarColor.RED, 30000, "AA7788BB");
        Car car8 = new Car(Brand.MAZDA,2008,  CarColor.RED, 13000);
        Car car9 = new Car(Brand.HONDA,"Civic", 2015,  CarColor.RED, 15000);
        Car car10 = new Car(Brand.HONDA,2016,  CarColor.RED);

        CarsRepository repository = new CarsRepository(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);
        CarsService service = new CarsService(repository);
        ConsoleUI ui = new ConsoleUI(service);

        ui.run();
    }

}
