import domain.Car;
import play.RacingGame;
import service.CarService;
import view.InputView;
import view.ResultView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

       InputView inputView = new InputView();
       ResultView resultView = new ResultView();
       List<Car> cars = new ArrayList<>();
       CarService carService = new CarService(cars);

        RacingGame racingGame = new RacingGame(inputView,resultView,cars,carService);
        racingGame.startRacingGame();

    }
}
