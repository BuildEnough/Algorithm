import java.util.Scanner;
public class _11021_AplusBminus7 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for (int i = 1; i < t+1; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println("Case #" + i + ": " + (a+b));
        }
        scan.close();
    }
}