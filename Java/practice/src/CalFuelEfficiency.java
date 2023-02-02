// 자동차 연비 계산
import java.util.Scanner;
public class CalFuelEfficiency {
    public static void main(String[] args) {
        double driveDistance; // 주행거리
        double fuels; // 사용한 휘발유 양
        double fuelEfficiency; // 연비

        Scanner scan = new Scanner(System.in);
        System.out.println("주행거리 입력하세요: ");
        driveDistance = scan.nextDouble();
        System.out.println("사용한 휘발유 양을 입력하세요: ");
        fuels = scan.nextDouble();
        fuelEfficiency = driveDistance / fuels;
        System.out.println("연비: " + fuelEfficiency);
    }
}
