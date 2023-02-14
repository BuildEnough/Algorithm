import java.util.Scanner;

public class _1330_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        String str = (A > B) ? ">" : ((A < B) ? "<" : "==");

        System.out.println(str);

    }
}
