// 평점에 따라 장학금 대상자 여부 결정
import java.util.Scanner;
public class Scholarship {
    public static void main(String[] args) {
        double gpa; // 평점

        // Scanner 객체를 생성하고 scan이 가리키게 함
        Scanner scan = new Scanner(System.in);

        // 평점을 입력 받음
        System.out.print("평점 입력: ");
        gpa = scan.nextDouble();

        System.out.println("평점: " + gpa);

        // 평점에 따라 장학금 대상자 여부 결정
        if (gpa >= 4.0)
            System.out.println("장학금 대상자입니다");
    }
}