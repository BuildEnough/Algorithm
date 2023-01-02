import java.util.Scanner;
public class _14681_사분면_고르기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A*B > 0 && A > 0)
            System.out.println("1");
        else if (A*B <0 && A < 0)
            System.out.println("2");
        else if (A*B <0 && A > 0)
            System.out.println("4");
        else
            System.out.println("3");
    }
}