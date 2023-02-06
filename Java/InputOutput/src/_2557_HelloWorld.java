import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class _2557_HelloWorld {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello World!");
        bw.flush();
        bw.close();
    }
}