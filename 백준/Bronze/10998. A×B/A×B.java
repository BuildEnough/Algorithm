import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken()); // st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A*B);
    }
}
