package racingcar;

import java.io.*;

public class RaceResultView {
    CarNameView carNameView;
    public RaceResultView(){

    }
    public void go() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("실행 결과\n");

        StringBuilder sb = new StringBuilder();
        CarGroup carGroup = carNameView.getCarGroup();
        for (Car car : carGroup.getCarList()) {
            sb.append(car.getCarName());
            sb.append(" : ");
            int score = car.getScore();
            //score 를 dash로 변환
            sb.append(car.scoreToDash(score));
            bw.write(sb.toString());
            bw.write("\n");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
