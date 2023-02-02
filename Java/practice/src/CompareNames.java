// 이름들이 서로 같은지 비교
import java.util.Scanner;
public class CompareNames {
    public static void main(String[] args) {
        String name1; // 이름 1
        String name2; // 이름 2

        // Scanner 객체를 생성하고 scan이 가리키게 함
        Scanner scan = new Scanner(System.in);

        System.out.print("첫 번째 이름 입력: ");
        name1 = scan.next();

        System.out.print("두 번째 이름 입력: ");
        name2 = scan.next();

        // 두 이름들이 서로 같은지 비교
        if (name1.equals(name2))
            System.out.println("이름 같음");
        else
            System.out.println("이름 다름");
    }
}