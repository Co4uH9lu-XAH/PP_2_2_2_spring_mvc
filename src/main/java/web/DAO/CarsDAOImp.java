package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAOImp implements CarsDAO{

    private List<Car> cars;
    private int id;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++id, "BMW", "325"));
        cars.add(new Car(++id, "AUDI", "80"));
        cars.add(new Car(++id, "Opel", "Blitz"));
        cars.add(new Car(++id, "WV", "Beetle"));
        cars.add(new Car(++id, "Ford", "T"));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return cars.stream().limit(count).toList();
    }

    @Override
    public String toString() {
        return "CarsDAOImp{" +
                "cars=" + cars +
                ", id=" + id +
                '}';
    }
}
