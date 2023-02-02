// 1부터 100 사이의 모든 정수들의 합을 계산
public class CalculateSum {
    public static void main(String[] args) {
        int i; // 반복 제어 변수
        int sum = 0; // 합계 초기화

        for (i = 1; i <= 100; i++)
            sum += i;

        System.out.println("합계: " + sum);
    }
}