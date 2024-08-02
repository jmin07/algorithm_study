import java.io.*;
import java.util.*;

public class B2747 {

    // 문제: 피보나치
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int returnNumber = fibonacci(number);

        bw.write(returnNumber + "\n");
        bw.flush();
        bw.close();
    }

    // 시간초과 (다이나믹 프로그래밍(동적 계획법)을 할때는 메모제이션 적용해야됨)
    private static int fibonacci(int number) {
        if (number == 0) return 0;
        else if (number == 1) return 1;
        else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}