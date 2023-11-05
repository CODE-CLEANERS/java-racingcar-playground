package racingcar;

import java.util.Scanner;

public class RaceResultView {
    CarNameView carNameView;
    RaceTryView raceTryView;
    public RaceResultView(){

    }
    public void go() {
        Scanner sc = new Scanner(System.in);
        System.out.println("실행 결과\n");

        CarGroup carGroup = carNameView.getCarGroup();
        int tryNum = raceTryView.getTryNum();
        for (int i =0;i<tryNum;i++){
            for (Car car : carGroup.getCarList()) {
                int score = car.getScore();
                System.out.println(
                    car.getCarName()
                        + " : "
                        + car.scoreToDash(score)
                        + "\n"
                );
            }
            System.out.println("\n");
        }
        System.out.println("result view 완료");
    }
}
