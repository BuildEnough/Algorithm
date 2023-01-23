import java.util.Scanner;
public class _8958_OX퀴즈 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String arr[] = new String[scan.nextInt()]; // 배열 만들어 줌

        for (int i = 0; i < arr.length; i++) { // 배열의 크기만큼 반복문 돌림
            arr[i] = scan.next(); // 각 배열에 OX문자 입력
        }

        for (int i = 0; i < arr.length; i++) {

            int count = 0;	// 연속적으로 O가 나올 때 카운트
            int sum = 0;	// 연속적으로 나올때 더해주는 변수 생성

            for (int j = 0; j < arr[i].length(); j++) { // 각 배열의 길이에 따른 반복문

                if (arr[i].charAt(j) == 'O') { // charAt을 통해 0이면
                    count++; // count에 1을 더해줌
                }
                else {
                    count = 0; // 아니라면 count를 초기화 시켜줌
                }
                sum += count; // count값을 sum에 더해줌
            }

            System.out.println(sum);
        }
    }
}