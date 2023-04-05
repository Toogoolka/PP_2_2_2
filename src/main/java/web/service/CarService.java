package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    public List<Car> getListOfRange(Long count);

    public Car show(Long id);

    public List<Car> showAll();
}
