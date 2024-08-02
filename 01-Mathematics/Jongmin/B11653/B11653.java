import java.io.*;
import java.util.*;


public class B11653 {

    // 문제: 소인수 분해
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        /**
         * 소인수 분해에서 한 번 특정 소수로 나눈 뒤에 다시 그 소수로 나눌 필요는 없다.
         * 소인수 분해는 주어진 수를 소수들의 곱으로 나누는 과정으로, 이 과정에서 각 소수는 일정한 횟수만큼만 등장합니다.
         * int[] sosu = {2, 3, 5, 7};
         */
        for (int i=2; i<=number; i++) {
            while (number % i == 0) {
                number /= i;
                System.out.println("i = " + i);
            }
        }

    }
}