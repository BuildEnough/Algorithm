// 구매한 상품 가격드르이 합계
import java.util.Scanner;
public class ComputeSum {
    public static void main(String[] args) {
        int price; // 상품 가격
        int total; // 합계

        // Scanner 객체를 생성하고 scan이 가리키게 함
        Scanner scan = new Scanner(System.in);

        // 합계 0으로 초기화
        total = 0;

        // 구매한 상품 가격들의 합계가 100000을 초과할 때까지 반복
        do {
            System.out.print("구매한 상품의 가격을 입력: ");
            price = scan.nextInt();

            total = total + price;
        } while (total <= 100000);

        System.out.println("총 구매 가격: " + total);
    }
}