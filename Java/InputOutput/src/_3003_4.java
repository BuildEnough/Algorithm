import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3003_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k=1, q=1, l=2, b=2, n=2, p=8;

        String[] str = br.readLine().split(" ");

        k -= Integer.parseInt(str[0]);
        q -= Integer.parseInt(str[1]);
        l -= Integer.parseInt(str[2]);
        b -= Integer.parseInt(str[3]);
        n -= Integer.parseInt(str[4]);
        p -= Integer.parseInt(str[5]);

        System.out.printf("%d %d %d %d %d %d", k, q, l, b, n, p);
    }
}
