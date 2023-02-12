import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer; // StringTokenizer 클래스를 이용하여 분리
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); // readLine() 은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리함
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken()); // st.nextToken() 은 문자열을 반환 -> Integer.parseInt()로 int 형으로 변환

        System.out.println(A-B);
    }
}