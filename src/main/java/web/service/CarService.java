package web.service;

import web.model.Car;

import java.util.List;
import java.util.Objects;

public interface CarService {
    List<Car> getCountCar(Integer count);
}
