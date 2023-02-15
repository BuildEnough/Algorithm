import java.util.Scanner;
public class _2480_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 변수가 모두 다른 경우
        if (a != b && a != c && b != c) {
            int max;
            // a > b
            if (a > b) {
                // c > a > b
                if (c > a) {
                    max = c;
                }
                // a > b, c
                else {
                    max = a;
                }
            }
            // b > a
            else {
                // c > b > a
                if (c > b) {
                    max = c;
                }
                // b > a, c
                else {
                    max = b;
                }
            }
            System.out.println(max * 100);
        }

        // 적어도 한 쌍 이상의 서로 같은 변수 존재
        else {
            // 3개의 변수가 같음
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            }
            else {
                // a가 b 혹은 c와 같은 경우
                if (a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }
                // b가 c랑 다른 경우
                else {
                    System.out.println(1000 + b * 100);
                }
            }
        }
    }
}