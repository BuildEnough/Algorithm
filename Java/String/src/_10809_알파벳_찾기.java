import java.util.Scanner;
public class _10809_알파벳_찾기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[26]; // 알파벳은 총 26개

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1; // -1로 초기화, 없는경우 -1로 나와야하기 때문
        }

        String S = scan.nextLine(); // S 입력

        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i); // charAt() 메소드 사용 문자추출 후 ch 변수에 저장

            if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr) {	// 배열 출력
            System.out.print(val + " ");
        }
    }
}

