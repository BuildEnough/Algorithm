import java.util.Scanner;
public class _3052_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;
        boolean bi;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        sc.close();

        for (int i = 0; i < 10; i++) {
            bi = false;
            for (int j = i+1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    bi = true;
                    break;
                }
            }
            if (bi == false)
                count++;
        }
        System.out.println(count);
    }
}
