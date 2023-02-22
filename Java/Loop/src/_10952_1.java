import java.util.Scanner;
public class _10952_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (1>0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A==0 && B==0)
                break;
            else
                System.out.println(A+B);
        }
        sc.close();
    }
}
