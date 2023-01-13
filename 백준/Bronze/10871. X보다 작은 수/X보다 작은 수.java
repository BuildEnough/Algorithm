import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 배열의 수
        int X = scan.nextInt(); // X보다 작은 정수를 구해야함

        int arr[] = new int[N]; // N개 크기의 배열

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt(); // N개 크기의 배열에 입력
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < X) // 배열의 각 값이 X보다 작을 때
                System.out.print(arr[i] + " ");
        }

    }
}