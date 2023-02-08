package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarsDAO {

    public List<Car> getCarsByCount (int count);

}
