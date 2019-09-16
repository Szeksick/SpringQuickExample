package pl.kgdev.simplerest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarManager {
    private List<Car> carlist;

    public CarManager() {
        this.carlist = new ArrayList<Car>();
        this.carlist.add(new Car("Ford", "Focus"));
        this.carlist.add(new Car("Toyota", "Corolla"));
        this.carlist.add(new Car("Nissan", "Skyline"));
        this.carlist.add(new Car("Ford", "Mustang"));
    }

    public List<Car> getCarlist(){
        return carlist;
    }

    public boolean addCar(Car car){
        return carlist.add(car);
    }
}