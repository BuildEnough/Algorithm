import java.util.Scanner;
public class _10950_AplusBminus3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loop = scan.nextInt();

        for (int i = 0; i < loop; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();

            System.out.println(A+B);
        }
    }
}