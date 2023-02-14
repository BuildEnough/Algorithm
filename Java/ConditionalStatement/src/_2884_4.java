import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2884_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int H = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        M -= 45;

        if (M < 0){
            H --;
            M+=60;
        if (H < 0)
            H += 24;
        }
        System.out.printf("%d %d", H, M);

    }
}
