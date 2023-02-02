// 사용자로부터 유요한 시험 점수를 입력받는다
import java.util.Scanner;
public class GetScore {
    public static void main(String[] args) {
        int score; // 시험 점수

        // Scanner 객체를 생성하고 scan이 가리키게 함
        Scanner scan = new Scanner(System.in);

        // 시험 점수를 읽어 들임
        System.out.print("시험 점수(0과 100사이의 정수)를 입력: ");
        score = scan.nextInt();

        // 사용자가 유효한 시험 점수를 입력할 때까지 계속 점수 입력 요청
        while (score < 0 || score > 100){
            System.out.println("범위를 벗어난 시험 점수가 입력됨");
            System.out.print("시험 점수(0과 100 사이의 정수)를 입력: ");
            score = scan.nextInt();
        }

        // 시험 점수 출력
        System.out.println("시험 점수: " + score);
    }
}