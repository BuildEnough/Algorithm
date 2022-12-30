import java.util.Scanner;
public class _3003_킹_퀸_룩_비숍_나이트_폰 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int K = 1;
        int Q = 1;
        int L = 2;
        int B = 2;
        int N = 2;
        int P = 8;

        K -= scan.nextInt();
        Q -= scan.nextInt();
        L -= scan.nextInt();
        B -= scan.nextInt();
        N -= scan.nextInt();
        P -= scan.nextInt();

        System.out.print(K + " ");
        System.out.print(Q + " ");
        System.out.print(L + " ");
        System.out.print(B + " ");
        System.out.print(N + " ");
        System.out.print(P + " ");
    }
}
