package racingcar;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CarNameView {
    CarGroup carGroup;
    public CarNameView(){

    }

    public void go() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        sb.append("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).\n");
        bw.write(String.valueOf(sb));
        bw.flush();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String names = st.nextToken();
        String[] carNames= names.split(",");

        carGroup = new CarGroup(carNames);
        bw.close();
        br.close();
        System.out.println(carGroup.countCar());
    }
    public CarGroup getCarGroup(){
        return this.carGroup;
    }
}
