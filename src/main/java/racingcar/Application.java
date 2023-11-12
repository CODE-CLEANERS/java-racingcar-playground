package racingcar;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException{
        CarController carController = new CarController();
        carController.go();
    }
}
