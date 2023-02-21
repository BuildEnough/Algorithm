import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2439_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N-i; j++) {
                sb.append(' ');
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
