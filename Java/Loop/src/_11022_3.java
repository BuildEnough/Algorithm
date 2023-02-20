import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11022_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            System.out.printf("Case #%d: %d + %d = %d%n", i, A, B, A+B);
        }
        br.close();
    }
}
