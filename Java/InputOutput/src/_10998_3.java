import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10998_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); // st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A*B);
    }
}
