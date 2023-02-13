import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int boolgi = Integer.parseInt(str);
        int sugi = 543;

        System.out.println(boolgi - sugi);
    }
}
