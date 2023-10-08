package view;

import common.ValidationUtils;
import domain.Car;
import enums.ErrorMassage;
import enums.InputMassage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

public class InputView {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));



    //throws IOException <- 인풋 아웃풋 에러...
    public String inputCarName() throws IOException {
        //인풋 이넘을 활용해서 "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)." 이거 뜨게 한다.
        try{
//            wr.write(InputMassage.START_GAME.getInputMassage());
            System.out.println(InputMassage.START_GAME.getInputMassage());
            String carNames = br.readLine().replace(" ", "");
            return carNames;
        }catch (IOException e){
            throw new IOException(ErrorMassage.INPUT_ERROR.getErrorMessage());
        }

    }

    public int inputGameRounds()throws IOException{
//        wr.write(InputMassage.GENERATE_GAME_ROUND.getInputMassage());
        System.out.println(InputMassage.GENERATE_GAME_ROUND.getInputMassage());
        String gameRound = br.readLine();
        ValidationUtils.validateInteger(gameRound);
        return Integer.parseInt(gameRound);

    }




}
