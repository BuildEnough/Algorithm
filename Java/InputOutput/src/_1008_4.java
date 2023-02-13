import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1008_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        double A = Double.parseDouble(str[0]);
        double B = Double.parseDouble(str[1]);

        System.out.println(A/B);
    }
}
