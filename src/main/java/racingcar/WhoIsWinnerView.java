package racingcar;

import java.io.*;
import java.util.LinkedHashMap;

public class WhoIsWinnerView {
    private final CarNameView carNameView;
    private final RaceResultView raceResultView;

    public WhoIsWinnerView(CarNameView carNameView, RaceResultView raceResultView){
        this.carNameView = carNameView;
        this.raceResultView = raceResultView;
    }
    public void go() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        LinkedHashMap<Car,Integer> carList = carNameView.getCarGroup().getCarList();

        String s = carList.toString();
        s = removeParentheses(s);
        sb.append(s);
        sb.append("가 최종 우승했습니다.");
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private String removeParentheses(String s){
        s = s.replace("[","");
        s = s.replace("]", "");
        return s;
    }

}
