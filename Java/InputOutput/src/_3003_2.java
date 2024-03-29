import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3003_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k=1, q=1, l=2, b=2, n=2, p=8;

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        k -= Integer.parseInt(st.nextToken());
        q -= Integer.parseInt(st.nextToken());
        l -= Integer.parseInt(st.nextToken());
        b -= Integer.parseInt(st.nextToken());
        n -= Integer.parseInt(st.nextToken());
        p -= Integer.parseInt(st.nextToken());

        System.out.printf("%d %d %d %d %d %d", k, q, l, b, n, p);
    }
}
