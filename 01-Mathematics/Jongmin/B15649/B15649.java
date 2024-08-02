import java.io.*;
import java.util.*;

public class B15649 {

    // 문제: N과 M (1)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // n 숫자까지
        int m = Integer.parseInt(st.nextToken()); // m 개를 보여달라.

        int i = 1;
        while (i <= m) {
            System.out.println("i = " + i);

            i++;

//            for (int i = 1; i <= n; i++) {
//
//            }

        }

/*
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
            System.out.println();
        }
*/
    }

}