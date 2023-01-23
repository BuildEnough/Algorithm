import java.util.Scanner;
public class _3052_나머지 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[10];
        
        boolean bi; // n번째와 n+1번째 비교하기 위한 변수
        int count = 0; // 나머지가 다를 경우 갯수 카운트

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt() % 42; // 선언한 배열에 42를 나눈 나머지를 입력해줌
        }

        for (int i = 0; i < arr.length; i++) {
            bi = false; // 기본값 false

            for (int j = i+1; j < arr.length; j++) { // i+1 번쨰부터 시작
                if (arr[i] == arr[j]) {
                    bi = true; // 같다면 bi true, true면 값이 같기 때문에 count에 1을 안 더해줘도 됨
                    break; // 1번만 비교해야하기때문에 break문 사용
                }
            }
            if (bi == false) { // 값이 같지 않다면
                count += 1; // count 1 증가
            }
        }
        System.out.println(count);
    }
}
