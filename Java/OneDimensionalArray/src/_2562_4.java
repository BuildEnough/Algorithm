import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int NN = Integer.parseInt(br.readLine());

            if (NN > max){
                max = NN;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
