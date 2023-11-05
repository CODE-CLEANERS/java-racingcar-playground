package racingcar;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CarNameView {
    CarGroup carGroup;
    private static final Scanner sc = new Scanner(System.in);
    public CarNameView(){

    }

    public void go() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).\n");

        String names = sc.nextLine();
        String[] carNames = names.split(",");

        carGroup = new CarGroup(carNames);

        System.out.println(carGroup.countCar());
    }
    public CarGroup getCarGroup(){
        return this.carGroup;
    }
}
