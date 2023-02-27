import java.util.Scanner;
public class _2562_1 {
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

        for (int bi : arr) {
            count++;
            if (bi > max) {
                max = bi;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
