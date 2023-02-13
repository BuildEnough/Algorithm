import java.util.Scanner;
public class _3003_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=1, q=1, l=2, b=2, n=2, p=8;

        k -= sc.nextInt();
        q -= sc.nextInt();
        l -= sc.nextInt();
        b -= sc.nextInt();
        n -= sc.nextInt();
        p -= sc.nextInt();

        System.out.printf("%d %d %d %d %d %d", k, q, l, b, n, p);
    }
}
