import java.util.Scanner;
public class _11720_숫자의_합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 숫자 입력
        String a = scan.next(); // 숫자 N개 문자열 입력

        int sum = 0; // 숫자 더할 sum 변수 0으로 초기화

        for(int i = 0; i < N; i++) {
            sum += a.charAt(i)-'0'; // charAt() 은 해당 문자의 아스키코드 값을 반환
            // 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있음
        }
        System.out.print(sum);
    }
}