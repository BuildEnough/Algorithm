// 점수에 따라 학점 부여
import java.util.Scanner;
public class Grader {
    public static void main(String[] args) {
        int score; // 점수
        char grade; // 학점

        // Scanner 객체 생성하고 scan이 가리키게 함
        Scanner scan = new Scanner(System.in);

        // 점수 입력 받음
        System.out.print("점수 입력: ");
        score = scan.nextInt();

        // 점수에 따라 학점 결정
        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else if (score >= 0)
            grade = 'D';
        else
            grade = 'F';

        // 점수와 학점 출력
        System.out.println("점수: " + score);
        System.out.println("학점: " + grade);
    }
}
