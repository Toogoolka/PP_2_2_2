package web.DAO;

import web.models.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> getListOfRange(Long count);

    public Car show(Long id);

    public List<Car> showAll();
}
