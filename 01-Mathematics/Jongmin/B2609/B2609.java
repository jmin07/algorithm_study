import java.io.*;
import java.util.*;

public class B2609 {

    // 문제: 최대공약수와 최소공배수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        int GCD = getGCD(n, m);
        int LCM = (n * m) / GCD; // 최소 공배수 = 두 자연수의 곱 / 최대공약수
        
        System.out.println(LCM + " " + GCD);

    }

    /**
     *  최대공약수
     *  조건: n > m
     */
    private static int getGCD(int a, int b) {
        while (b > 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }


}