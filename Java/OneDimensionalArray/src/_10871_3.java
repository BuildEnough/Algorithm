import java.util.Scanner;

public class _10871_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int bi = sc.nextInt();
            if (bi < X)
                sb.append(bi + " ");
        }
        sc.close();
        System.out.println(sb);

    }
}
