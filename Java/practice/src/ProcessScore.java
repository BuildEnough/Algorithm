// 점수들의 최고 점수, 최저 점수와 평균 점수를 계산
import java.util.Scanner;
public class ProcessScore {
    public static void main(String[] args) {
        int jumsu;
        int count = 0;
        int max = -1;
        int min = 101;
        int sum  = 0;
        double aver;

        Scanner scan = new Scanner(System.in);

        System.out.print("점수(더 이상 점수가 없다면 -99 입력) 입력: ");
        jumsu = scan.nextInt();

        // 점수가 -99가 아닌 동안 반복
        while (jumsu != -99) {
            count++;
            sum += jumsu;

            if (jumsu > max)
                max = jumsu;

            if (jumsu < min)
                min = jumsu;

            System.out.print("점수(더 이상 점수가 없다면 -99 입력) 입력: ");
            jumsu = scan.nextInt();
        }

        aver = (double) sum / count;

        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);
        System.out.println("평균 점수: " + aver);
    }
}
