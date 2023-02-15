import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < 10; i++) {
            sb.append(N).append(' ').append('*').append(' ').append(i);
            sb.append(' ').append('=').append(' ').append(N*i).append('\n');
        }
        System.out.println(sb);
    }
}
