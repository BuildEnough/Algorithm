import java.util.Arrays;
import java.util.Scanner;
public class _1546_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]/arr[arr.length-1] * 100;
        }
        System.out.println(sum/ arr.length);
    }
}