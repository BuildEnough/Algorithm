import java.util.Scanner;

public class _2562_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = 0;
        int count = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            count++;
            if (arr[i] > max) {
                max = arr[i];
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
