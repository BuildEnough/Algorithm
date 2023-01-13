import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 정수 개수 입력

        int[] arr = new int[N]; // 배열 만들기
        int sycle = 0; // 사이클 횟수

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        int v = scan.nextInt(); // 찾으려고 하는 정수

        for (int i = 0; i < arr.length; i++) {
            if (v == arr[i])
                sycle += 1;
        }
        System.out.println(sycle);
    }
}