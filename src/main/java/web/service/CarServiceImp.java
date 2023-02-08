package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarsDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService{

    private final CarsDAO carsDAO;

    @Autowired
    public CarServiceImp(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return carsDAO.getCarsByCount(count);
    }
}
