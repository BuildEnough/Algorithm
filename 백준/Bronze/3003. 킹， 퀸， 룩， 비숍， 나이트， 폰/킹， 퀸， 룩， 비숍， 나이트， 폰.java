import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k=1, q=1, l=2, b=2, n=2, p=8;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        k -= Integer.parseInt(st.nextToken());
        q -= Integer.parseInt(st.nextToken());
        l -= Integer.parseInt(st.nextToken());
        b -= Integer.parseInt(st.nextToken());
        n -= Integer.parseInt(st.nextToken());
        p -= Integer.parseInt(st.nextToken());

        System.out.printf("%d %d %d %d %d %d", k, q, l, b, n, p);
    }
}
