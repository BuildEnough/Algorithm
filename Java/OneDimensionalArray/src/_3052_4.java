import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _3052_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> namugi = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            namugi.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();
        System.out.println(namugi.size());
    }
}