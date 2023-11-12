package racingcar;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class CarGroup {
    private final LinkedHashMap<Car,Integer> carList = new LinkedHashMap<>();
    private int maxScore =0;

    CarGroup(String[] carList){

        for (String s:carList){
            Car car = new Car(s);
            this.carList.put(car,maxScore);
        }
    }

    public int countCar(){
        return this.getCarList().size();
    }

    public int getMaxScore(){
        for (Car car:getCarList().keySet()){
            int i = car.getScore();
            if(maxScore<i) maxScore=i;
        }
        return maxScore;
    }

    public int countWinCar() {
        int result = 0;
        for (Car car : getCarList().keySet()) {
            if (car.getScore().equals(maxScore)) result++;
        }
        return result;
    }

    public LinkedHashMap<Car,Integer> getCarList(){
        return carList;
    }


}
