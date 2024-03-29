import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10811_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int N = str.charAt(0)-'0';
        int M = str.charAt(2)-'0';

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1; // 배열은 0부터 시작하기 때문에 arr[0]에 1을 넣기 위해 1을 더해줌
        }

        for (int i = 0; i < M; i++) { // M개의 줄
            str = br.readLine();
            int left = str.charAt(0)-49; // 배열 0부터 시작
            int right = str.charAt(2)-49; // 배열 0부터 시작

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        br.close();

        for (int baguni:arr)
            System.out.print(baguni + " ");
    }
}
