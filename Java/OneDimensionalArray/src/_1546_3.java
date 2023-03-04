import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1546_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] arr = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1; // -1: 입력받을 값이 0보다 큼
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            int value = Integer.parseInt(st.nextToken());

            if(value > max) {
                max = value;
            }
            sum += value;
        }

        System.out.println(((sum / max) * 100.0) / arr.length);
    }
}