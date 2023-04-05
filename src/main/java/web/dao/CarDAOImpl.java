package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDAO {
    private static Long id;
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        id = 0L;

        carsList.add(new Car(++id, "BMW", "business", "A001TA"));
        carsList.add(new Car(++id, "Mercedess", "business", "Q002BC"));
        carsList.add(new Car(++id, "Porche", "business", "R003PO"));
        carsList.add(new Car(++id, "Audi", "sport", "U004SA"));
        carsList.add(new Car(++id, "Ferrari", "sport", "A005XV"));
    }

    public List<Car> showAll() {
        return carsList;
    }

    public List<Car> getListOfRange(Long count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }

    public Car show(Long id) {
        return carsList.stream()
                .filter(car -> car.getId() == id)
                .findAny().orElse(null);
    }
}
