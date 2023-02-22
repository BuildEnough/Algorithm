import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10952_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (1>0) {
            String str = br.readLine();
            int A = str.charAt(0)-'0';
            // int A = str.charAt(0) - 48;
            // int A = str.charAt(0) - 48;

            int B = str.charAt(2)-'0';
            // int B = str.charAt(2) - 48;

            if (A==0 && B==0)
                break;
            else
                sb.append(A+B).append('\n');
        }
        br.close();
        System.out.println(sb);
    }
}
