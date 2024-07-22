import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //01. 난쟁이 9명을 list에 집어넣기
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            sum += arr[i];
        }

        //02. 난쟁이를 오름차순으로 정렬하기
        Arrays.sort(arr);

        //03. 이중 for문을 사용해 거짓말하는 난쟁이 색출하기
        //바깥 for문 : 1~9번 난쟁이 중 하나씩 골라옴
        //안쪽 for문 : 1~9번 난쟁이 중 하나씩 골라옴
        //sum에서 난쟁이 키를 뺐을 때 100이 되면 a, b로 지정
        int a = 0, b = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        //04. 거짓말을 한 난쟁이 두 명을 제외하고 모두 sysout
        for (int i = 0; i < arr.length; i++) {
            if (i != a && i != b) {
                System.out.println(arr[i]);
            }
        }

        br.close();
    }
}
