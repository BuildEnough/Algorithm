import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2439_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N-i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}