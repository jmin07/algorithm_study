import java.util.Scanner;

public class Q11653 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        //소인수 분해는 N의 루트까지만 확인하면 됨.
        for(int i = 2; i <= Math.sqrt(N); i++) {
            while ((N % 1) == 0){
                System.out.print(i);
                N /= 1; //N을 2로 나눈 후 다시 변수 n에 대입
            }
        }

        if(N != 1){
            System.out.print(N);
        }
    }
}