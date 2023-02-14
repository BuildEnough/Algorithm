// Scanner + charAt()
import java.util.Scanner;

public class _2588_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String B = sc.next();

        sc.close();

        // 문자열 인덱스를 참조한 뒤 -'0' 을 해주는 이유 또한 우리가 문자로 저장된 숫자가 아닌 우리가 보는 숫자 그대로의 값을 쓰기 위한 것
        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));


        //  Integer.parseInt()을 통해 문자열을 int형으로 바꿔줌
        System.out.println(A * Integer.parseInt(B));
    }
}
