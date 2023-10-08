package view;

import domain.Car;
import enums.ResultEnum;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ResultView {
    private BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

    public void printWinner(String winners){
        System.out.println(winners + ResultEnum.WINNER.getResultMassage());
    }

    public void race(Car car){
        System.out.println(car.getName() + " : " + car.getPosition());

    }
}
