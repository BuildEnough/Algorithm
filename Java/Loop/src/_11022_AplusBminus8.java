import java.util.Scanner;
public class _11022_AplusBminus8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 1; i < t+1; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
        }
    }
}