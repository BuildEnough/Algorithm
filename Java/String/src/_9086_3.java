import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9086_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            sb.append(str.charAt(0)).append(str.charAt(str.length()-1) + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
