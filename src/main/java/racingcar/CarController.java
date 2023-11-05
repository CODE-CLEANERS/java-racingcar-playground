package racingcar;

import java.io.IOException;
import java.util.Arrays;

public class CarController {
    private static final CarNameView carNameView = new CarNameView();
    private static final RaceTryView raceTryView = new RaceTryView();
    private static final RaceResultView raceResultView = new RaceResultView();
    private static final WhoIsWinnerView whoIsWinnerView = new WhoIsWinnerView();

    public CarController(){
    }

    public void go() throws IOException {
        carNameView.go();
        raceTryView.go();
        raceResultView.go();
//        whoIsWinnerView.go();
    }
}

