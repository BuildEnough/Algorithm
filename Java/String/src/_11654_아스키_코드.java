import java.util.Scanner;
public class _11654_아스키_코드 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int code = scan.next().charAt(0); // 문자열 입력 후 charAt()을 통해 문자로 잘라줌, 문자열 -> 문자

        System.out.println(code);
    }
}