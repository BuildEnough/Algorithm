import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (1 == 1) {

            int A = scan.nextInt();
            int B = scan.nextInt();

            if (A == 0 && B == 0){
                break;
            }
            System.out.println(A+B);
        }
    }
}