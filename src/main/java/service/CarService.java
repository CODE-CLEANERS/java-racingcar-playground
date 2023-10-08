package service;

import common.ValidationUtils;
import domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarService {

    List<Car> cars;
    Random random = new Random();

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> createCar(String inputName) {
        inputName.replace(" ","");
        String[] carsSplit = inputName.split(",");
        for (String carName: carsSplit) {
            //car 객체 생성
            cars.add(new Car(carName,0));
        }
        return cars;
    }

    public void generateForwardCondition(Car car){
        int forwardCondition = random.nextInt(10);
        car.updateForwardCondition(forwardCondition);
    }

    public void isCheckForwardCondition(Car car){
        if(car.getForwardCondition()>4){
            car.updatePosition();
        }
    }

}
