import java.util.Scanner;
public class FlowEx17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("*를 출력할 라인의 수를 입력하세요: ");
        String tmp = sc.nextLine();
        num = Integer.parseInt(tmp);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
