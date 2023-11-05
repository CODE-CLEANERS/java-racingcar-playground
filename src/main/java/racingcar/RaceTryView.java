package racingcar;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RaceTryView {
    int tryNum;

    public RaceTryView(){

    }

    public void go() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        sb.append("시도할 횟수는 몇 회인가요?\n");
        bw.write(sb.toString());
        bw.flush();

//        StringTokenizer st = new StringTokenizer(
//            br.readLine()
//        );
        Scanner sc = new Scanner(System.in);
//        String numString = st.nextToken();
//        int num = Integer.parseInt(numString);
        int num = sc.nextInt();
        this.tryNum = num;
        bw.close();
        br.close();
        System.out.println(tryNum);
    }

    public int getTryNum(){
        return this.tryNum;
    }
}
