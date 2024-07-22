import java.util.Scanner;

public class Q7568 {
    public static void main(String[] args) {

        //01. 입력받기(사람 수, 2차원 배열로 키와 몸무게)
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            arr[i][0] = in.nextInt();	// [i][0] : 몸무게
            arr[i][1] = in.nextInt();	// [i][1] : 키
        }

        //02. for문을 통해 사람 한 명씩 비교하기
        for(int i = 0; i < N; i++) {
            int rank = 1;

            for(int j = 0; j < N; j++) {
                //만약 비교하는 i와 j가 같은 사람이면 뛰어넘기
                if(i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }

            //03. 순위 출력하기
            System.out.print(rank + " ");
        }

    }
}
