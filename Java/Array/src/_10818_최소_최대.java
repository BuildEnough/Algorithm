import java.util.Scanner;
import java.util.Arrays; // Arrays 불러오기
public class _10818_최소_최대 {
    // 최소 최대 구할때 정렬을 사용해서 제일 앞에 가장 작은 값 뒤에 가장 큰 값으로 만들어 놓고 출력
    // 메소드 사용 Arrays.sort()
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // N개의 정수 입력

        int[] arr = new int[N]; // 크기가 N인 arr이라는 배열

        int max = 0;
        int min = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt(); // arr 배열에 값 입력
        }

        Arrays.sort(arr); // 메소드를 활용한 정렬
        System.out.println(arr[0] + " " + arr[N-1]); // N-1을 통해 제일 뒤에 값 가져오기
    }
}