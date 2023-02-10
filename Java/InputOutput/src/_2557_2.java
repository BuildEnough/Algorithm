import java.io.BufferedWriter; // 데이터를 하나씩 읽어오는 것이 아닌 임시 공간(버퍼)에 저장해두었다가 한 번에 출력 또는 데이터를 보내는 방식
import java.io.OutputStreamWriter;
import java.io.IOException;
public class _2557_2 {
    public static void main(String[] args) throws IOException{
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    bw.write("Hello World!");
    bw.flush();
    bw.close();
    }
}
