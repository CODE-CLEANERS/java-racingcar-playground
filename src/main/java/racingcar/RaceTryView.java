package racingcar;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RaceTryView {
    int tryNum;

    public RaceTryView(){

    }

    public void go() throws IOException {
        System.out.println("시도할 횟수는 몇 회인가요?\n");

        Scanner sc = new Scanner(System.in);
        this.tryNum = sc.nextInt();
        System.out.println(tryNum);
    }

    public int getTryNum(){
        return this.tryNum;
    }
}
