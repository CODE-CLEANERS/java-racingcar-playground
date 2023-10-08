package play;

import domain.Car;
import enums.InputMassage;
import service.CarService;
import view.InputView;
import view.ResultView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private InputView inputView;
    private ResultView resultView;
    private List<Car> cars;
    private CarService carService;

    public RacingGame(InputView inputView, ResultView resultView, List<Car> cars, CarService carService) {
        this.inputView = inputView;
        this.resultView = resultView;
        this.cars = cars;
        this.carService = carService;
    }

    public void startRacingGame() throws IOException {
        String inputCarName = inputView.inputCarName();
        int inputGameRounds = inputView.inputGameRounds();

        //게임 실행
        List<Car> cars = carService.createCar(inputCarName);
        List<Car> raceIsDone = StartRace(cars,inputGameRounds);

        //우승자 선정
        ArrayList<String> findWinner = findWinner(raceIsDone);

        //우승자 수 체크
        String winner = checkWinnerCount(findWinner);
        resultView.printWinner(winner);


    }

    private List<Car> StartRace(List<Car> cars,int inputGameRounds) {
        while (inputGameRounds > 0){
            updateCarPositions(cars);
            System.out.println();
            inputGameRounds--;
        }
        
        return cars;
    }

    private void updateCarPositions(List<Car> cars) {
        for (Car car: cars) {
            carService.generateForwardCondition(car);
            carService.isCheckForwardCondition(car);
            resultView.race(car);

        }
    }

    private ArrayList<String> findWinner(List<Car> cars){
        int max = Integer.MIN_VALUE;
        ArrayList<String> winnerNames = new ArrayList<>();

        for (Car car: cars) {
            if(car.getPosition().length() > max){
                max = car.getPosition().length();
                winnerNames.clear();
            }
            if(car.getPosition().length() == max){
                winnerNames.add(car.getName());
            }
        }

        return winnerNames;

    }

    private String checkWinnerCount(ArrayList<String> findWinners){
        String winnerNames= "";
        // 우승자 인원이 2보다 크면 쉼표 넣고, 마지막만 쉼표 넣지 않기
        if(findWinners.size()>1){
            for (int i = 0; i < findWinners.size()-1; i++) {
                winnerNames+=findWinners.get(i)+",";
            }
        }



        return winnerNames += findWinners.get(findWinners.size()-1);
    }


}
