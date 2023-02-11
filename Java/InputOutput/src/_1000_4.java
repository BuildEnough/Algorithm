import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// br.readline()를 통해 읽어온 것을 split("")하여 공백 단위로 나누어 준 뒤 String 배열에 각각 저장
public class _1000_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        System.out.println(A+B);


    }
}
