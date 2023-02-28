import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];

        for (int i = 1; i <= 28; i++) {
            int check = Integer.parseInt(br.readLine());
            arr[check] = 1;

        }

        for (int i = 1; i <= 30; i++) {
            if (arr[i] != 1)
                System.out.println(i);
        }
    }
}
