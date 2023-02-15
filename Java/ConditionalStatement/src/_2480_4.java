import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2480_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 변수가 모두 다른 경우
        if (a != b && a != c && b != c) {
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
        // 3개의 변수가 모두 같은 경우
        else if (a == b && a ==c) {
            System.out.println(10000 + a * 1000);
        }
        // a가 b혹은 c와 같은 경우
        else if (a == b || a ==c) {
            System.out.println(1000 + a * 100);
        }
        // b와 c랑 같은 경우
        else {
        System.out.println(1000 + b * 100);
        }
    }
}
