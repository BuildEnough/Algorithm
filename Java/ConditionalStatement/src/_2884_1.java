import java.util.Scanner;
public class _2884_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        sc.close();

        M -= 45;

        if (M < 0){
             //H -= 1;
            H --;
            M+=60;

        if (H < 0)
            H += 24;
        }
        System.out.printf("%d %d", H, M);

    }
}
