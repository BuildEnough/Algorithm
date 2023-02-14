import java.util.Scanner;
public class _2525_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close();

        int min = A * 60 + B;
        min += C;

        A = (min / 60) % 24;
        B = min % 60;


        System.out.printf("%d %d", A, B);
    }
}
