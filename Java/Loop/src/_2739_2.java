import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2739_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();
        
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d%n", N, i, N*i);
        }
    }
}