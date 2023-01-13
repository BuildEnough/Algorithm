import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[9]; // 9인 배열
        int max = 0; // 초기화
        int index = 0; // 초기화

        for (int i = 0; i < 9; i++) {
            arr[i] = scan.nextInt(); // 배열에 숫자 입력
            if (arr[i] > max){ // 배열에 들어온 숫자가 max보다 크면
                max = arr[i]; // max에 들어온 숫자 저장하면 max 값 갱신
                index = i; // 들어온 값이 max 값일 경우 해당 배열의 순서를 index에 넣어줌
            }
        }
        System.out.println(max);
        System.out.println(index + 1); // 배열의 번호는 0부터 시작하기 때문에 1을 더해줘야함
    }
}