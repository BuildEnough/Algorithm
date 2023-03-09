import java.util.Scanner;

public class _27866_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int num = sc.nextInt();
        sc.close();

        System.out.println(word.charAt(num-1));
    }
}
