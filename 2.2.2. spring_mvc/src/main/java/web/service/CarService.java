package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarService {

    public List<Car> getListCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 111, "white"));
        cars.add(new Car("car2", 222, "red"));
        cars.add(new Car("car3", 333, "green"));
        return cars;

    }
}
