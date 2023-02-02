// 시험 점수와 면접 점수에 따라 합격인지 불합격인지 결정
import java.util.Scanner;
public class Admission {
    public static void main(String[] args) {
        int testScore; // 시험 점수
        int interviewScore; // 면접 점수

        // Scanner 객체를 생성하고 Scan이 가리키게 함
        Scanner scan = new Scanner(System.in);

        // 시험 점수 입력
        System.out.print("시험 점수 입력: ");
        testScore = scan.nextInt();

        // 면접 점수 입력
        System.out.print("면접 점수 입력: ");
        interviewScore = scan.nextInt();

        // 시험 점수와 면접 점수에 따라 합격인지 불합격인지 결정
        if (testScore >= 80 && interviewScore >= 60)
            System.out.println("합격");
        else
            System.out.println("불합격");
    }
}