package pl.kgdev.simplerest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kgdev.simplerest.Car;
import pl.kgdev.simplerest.CarManager;

import java.util.List;

@RestController
public class CarApi {

    private CarManager carManager;

    @Autowired
    public CarApi(CarManager carManager) {
        this.carManager = carManager;
    }


    @GetMapping("/getCars")
    private List<Car> getCars(){
        return carManager.getCarlist();
    }
    @GetMapping("/")
    public String home(){
        return "HWDP";
    }

    @PostMapping("/addCar")
    public void addCar(@RequestBody Car car){
        carManager.addCar(car);
    }
}
