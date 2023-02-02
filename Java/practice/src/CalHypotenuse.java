// 직각 삼각형의 빗변의 길이 구하기
import java.util.Scanner;
public class CalHypotenuse {
    public static void main(String[] args) {
        // 세 변의 길이를 나타내는 변수
        double a, b, c;
        Scanner scan = new Scanner(System.in);

        // 밑변 입력
        System.out.print("밑변 입력: ");
        a = scan.nextDouble();

        // 높이 입력
        System.out.print("높이 입력: ");
        b = scan.nextDouble();

        // 빗변 길이 구하기
        c = Math.sqrt(a * a + b * b);

        // 빗변 길이 출력
        System.out.println("빗변의 길이는 " + c + "이다");
    }
}