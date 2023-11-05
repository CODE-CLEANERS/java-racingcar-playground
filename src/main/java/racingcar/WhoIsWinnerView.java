package racingcar;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class WhoIsWinnerView {
    private CarGroup carGroup;

    public WhoIsWinnerView(){

    }
    public void go() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        List<Car> carList = carGroup.getCarList();
        String s = Arrays.toString(carList.toArray());
        s = removeParentheses(s);
        sb.append(s);
        sb.append("가 최종 우승했습니다.");
        bw.write(sb.toString());
        bw. flush();
        bw.close();

    }

    private String removeParentheses(String s){
        s = s.replace("[","");
        s = s.replace("]", "");
        return s;
    }

}
