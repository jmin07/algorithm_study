import java.io.*;
import java.util.*;

public class B7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine()); // total 변수 정의

        Map<Integer, int[]> infoMap = new HashMap<>();
        for (int i = 0; i < total; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] info = {w, k}; // 세미콜론 추가
            infoMap.put(i, info); // add 대신 put 사용
        }

        int[] answer = new int[total]; // 배열 크기를 total로 설정
        for (int i = 0; i < total; i++) {
            int[] infoA = infoMap.get(i);

            int weightA = infoA[0];
            int tallA = infoA[1];

            int count = 0;
            for (int j = 0; j < total; j++) {

                if (i == j) continue;
                int[] infoB = infoMap.get(j); // i -> j로 수정
                int weightB = infoB[0];
                int tallB = infoB[1];

                if (weightA > weightB && tallA > tallB) count++;

            }
            answer[i] = count;
        }

        System.out.println(Arrays.toString(answer)); // 배열 출력
    }
}
