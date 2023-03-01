import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3052_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[42];

        for (int i = 0; i < 10; i++) { // boolean 배열의 default 값은 false
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }
        br.close();

        int count = 0;
        for (boolean bi : arr) {
            if (bi) { // bi가 true 라면
                count++;
            }
        }

        System.out.println(count);

    }
}