import java.util.*;
import java.io.*;

public class B2346 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 명령 개수.
        int count = Integer.parseInt(br.readLine());

        List<Integer> answer = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            if ("push".equals(command)) {
                // 정수 X를 큐에 넣는 연산
                int number = Integer.parseInt(st.nextToken());
                answer.add(number);
                bw.write(number + "\n");
            } else if ("pop".equals(command)) {
                // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력
                // 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
                if (answer.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(answer.get(0) + "\n");
                    answer.remove(0);
                }
            } else if ("size".equals(command)) {
                bw.write(answer.size() + "\n");
            } else if ("empty".equals(command)) {
                if (answer.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if ("front".equals(command)) {
                if (answer.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(answer.get(0) + "\n");
                }
            } else if ("back".equals(command)) {
                if (answer.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(answer.get(answer.size() -1) + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}