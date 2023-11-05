package racingcar;

import java.util.StringTokenizer;

public class Car {
    //필드
    String carName;
    int score;
    boolean win;
    private final int randomNum = 4;

    //생성자
    Car(String carName){
        if(carName.length()>5)throw new IllegalArgumentException("차 이름은 5자를 초과할 수 없습니다.");
        carName = carName.replaceAll(" ","");
        this.carName = carName;
        this.score = 0;
        this.win = false;
    }

    public Integer getScore() {
        return score;
    }
    public String scoreToDash(int score){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<score;i++){
            sb.append("-");
        }
        String dash = sb.toString();
        return dash;
    }

    private void addScore(){
        int score = getScore();
        this.score = score++;
    }

    private void drive(){
        double r = Math.random();
        int t = Math.toIntExact(Math.round(r * 10));
        int s = getScore();
        if(t>=randomNum) addScore();
    }

    public boolean isWin(){
        return win;
    }

    public String getCarName(){
        return this.carName;
    }
}
