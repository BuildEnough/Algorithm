import java.util.Scanner;
public class _5597_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[31];

        for (int i = 1; i <= 28; i++) {
            int check = sc.nextInt();
            arr[check] = 1;

        }

        for (int i = 1; i <= 30; i++) {
            if (arr[i] != 1)
                System.out.println(i);
        }
    }
}
