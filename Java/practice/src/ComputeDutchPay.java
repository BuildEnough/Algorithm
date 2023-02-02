// 일인당 부담해야 할 금액 계산
import java.sql.SQLOutput;
import java.util.Scanner;
public class ComputeDutchPay {
    // 일인당 부담해야 할 금액을 계산하여 출력
    // 매개 변수
    // totalAmount: 총 금액
    // count: 사람들의 수
    // 반환 값: 없음
    public static void dutchpay(int totalAmount, int count){
        int dutchpayAmount; // 일인당 부담 금액

        // 일인당 부담해야 할 금액을 계산한 후 출력
        if (count == 0){
            System.out.println("사람들의 수가 0");
            return;
        }
        else {
            dutchpayAmount = totalAmount / count;
            System.out.println("일인당 부담 금액: " + dutchpayAmount);
        }
    }



    public static void main(String[] args) {
        int charage; // 총 금액
        int number; // 사람들의 수

        Scanner scan = new Scanner(System.in);

        // 총 금액을 입력받음
        System.out.print("총 금액 입력: ");
        charage = scan.nextInt();

        // 사람들의 수 입력
        System.out.print("사람들의 수 입력: ");
        number = scan.nextInt();

        // 일인당 부담해야 할 금액을 계산하여 출력
        dutchpay(charage, number);
    }
}