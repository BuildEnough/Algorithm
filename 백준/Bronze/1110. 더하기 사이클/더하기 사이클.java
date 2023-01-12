import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int count = 0;
        int NN = N;

        while (true) {
            // ((N % 10) * 10) NN의 십의 자리수
            // (N / 10) + (N % 10) NN의 일의 자리수
            // (((N / 10) + (N % 10)) % 10) NN의 두 자리 수 일떄 일의 자리수
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            count++;

            if (NN == N) {
                break;
            }
        }
        System.out.println(count);
    }
}