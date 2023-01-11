import java.io.*;
public class BufferedReaderEX1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("BufferedReader.java");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for (int i = 0; (line = br.readLine()) != null; i++) {
                // "/"를 포함한 라인을 출력
                if (line.indexOf(";") !=- 1)
                    System.out.println(i + ":" + line);

            }
            br.close();
        } catch (IOException e) {}
    }
}
