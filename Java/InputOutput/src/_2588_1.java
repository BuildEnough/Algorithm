// Scanner + 수학연산
// 나머지와 나눗셈 연산을 통해 각 자릿수를 구하는 방법
import java.util.Scanner;
public class _2588_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        System.out.println(A*(B%10));
        System.out.println(A*((B%100)/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
    }
}
