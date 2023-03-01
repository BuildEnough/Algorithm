import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int namugi[] = new int[10];
        int count = 1;
        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            namugi[i] = arr[i] % 42;
        }
        sc.close();
        
        Arrays.sort(namugi);

        for (int j = 0; j < 10 - 1; j++)
            if (namugi[j] != namugi[j + 1])
                count++;
        
        System.out.println(count);
    }
}