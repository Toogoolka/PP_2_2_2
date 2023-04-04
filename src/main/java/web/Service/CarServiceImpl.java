package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarDAOImpl;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private CarDAOImpl implDAO;

    @Autowired
    public CarServiceImpl(CarDAOImpl implDAO) {
        this.implDAO = implDAO;
    }

    @Override
    public List<Car> getListOfRange(Long count) {
        return implDAO.getListOfRange(count);
    }

    @Override
    public Car show(Long id) {
        return implDAO.show(id);
    }

    @Override
    public List<Car> showAll() {
        return implDAO.showAll();
    }
}
