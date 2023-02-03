// 1부터 주어진 정수사이의 모든 정수들의 합을 구함
public class Calculatesum2 {

    // 1부터 N 사이의 모든 정수들의 합을 구함
    // 매개변수
    // N: 양의 정수
    // 반환 값: 1부터 N 사이의 모든 정수들의 합
    public static int findSum(int N){
        // 합을 저장하는 변수
        int sum;

        // N이 1이면 합은 1이고
        if (N == 1)
            sum = 1;
        else // N이 1이 아니라면 1부터 (N-1) 까지의 합에 N을 더한 값
        sum = findSum(N-1) + N;

        // 합 반환
        return sum;
    }

    public static void main(String[] args) {
        int number = 100;
        System.out.println("1부터 " + number + "사이의 모든 정수들의 합은 " + findSum(number) + "이다");
    }
}