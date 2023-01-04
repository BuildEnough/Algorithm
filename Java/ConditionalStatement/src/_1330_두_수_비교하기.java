import java.util.Scanner;
public class _1330_두_수_비교하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        System.out.println((A > B) ? ">" : ((A < B) ? "<" : "=="));
    }
}
