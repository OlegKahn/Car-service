package web.Service;

import web.entity.Car;
import java.util.ArrayList;
import java.util.List;

public abstract class CarService {

    private static final List<Car> cars = new ArrayList<>();

    public static List<Car> returnSomeCars(int i) {
        List<Car> carsReturn = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            carsReturn.add(cars.get(j));
        }
        return carsReturn;
    }

    public static List<Car> getCars() {
        if (cars.isEmpty()){
            cars.add(new Car("Hyundai", "silver", 122));
            cars.add(new Car("BMW", "black", 465));
            cars.add(new Car("Porsche", "yellow", 346));
            cars.add(new Car("Nissan", "blue", 564));
            cars.add(new Car("Toyota", "white", 515));
        }
        return cars;
    }
}
