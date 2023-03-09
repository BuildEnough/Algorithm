import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27866_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int num = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(word.charAt(num-1));
    }
}
