import java.util.Scanner; // Scanner 클래스 이용
public class ComputeArea {
    public static void main(String[] args) {
        // 상수, 변수 선언
        final double PI = 3.14159; // 원주율
        double radius; // 반지름
        double area; // 면적

        Scanner scan = new Scanner(System.in); // Scanner 객체를 만들어 객체의 nextDouble 메소드 호출

        System.out.print("원의 반지름 입력하세요: ");
        radius = scan.nextDouble();

        area = PI * radius * radius;

        System.out.println("원의 면적은 " + area + "입니다.");
    }
}
