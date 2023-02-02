// 두 정수의 최솟값을 구함
public class FindMinimum {
    // 두 정수의 최솟값 구함
    // 매개 변수
    // number1: 정수 1
    // number2: 정수 2
    // 반환 값: 최솟값
    public static int findMin(int number1, int number2){
        // 두 정수들 중 작은 값을 반환
        if (number1 < number2)
            return number1;
        else
            return number2;
    }

    // 두 정수의 최솟값을 구한 후 출력
    public static void main(String[] args) {
        int value1 = 65;
        int value2 = 82;
        int minvalue;

        // 주어진 두 정수의 최솟값을 findMin 메소드를 호출하여 구함
        minvalue = findMin(value1, value2);

        // 두 정수와 최솟값 출력
        System.out.println("첫 번째 정수: " + value1);
        System.out.println("두 번째 정수: " + value2);
        System.out.println("최솟값: " + minvalue);

    }
}