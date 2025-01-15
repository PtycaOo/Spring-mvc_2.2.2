package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car(1,"BMV",5));
        carList.add(new Car(2,"Mercedes",111));
        carList.add(new Car(3,"Lada",1705));
        carList.add(new Car(4,"VAZ",2105));
        carList.add(new Car(5,"Volvo",4));
    }

    public List<Car> getCountCar(Integer count) {
        if (count == 0 || count > 5) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}
