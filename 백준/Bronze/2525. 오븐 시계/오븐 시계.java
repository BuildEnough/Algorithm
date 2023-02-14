import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(br.readLine());

        int min = A * 60 + B;
        min += C;

        A = (min / 60) % 24;
        B = min % 60;


        System.out.printf("%d %d", A, B);
    }
}
