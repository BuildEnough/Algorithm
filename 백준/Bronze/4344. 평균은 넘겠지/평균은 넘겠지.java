import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt(); // 테스트 케이스 입력
        for(int i = 0 ; i < T ; i++) {
            int N = scan.nextInt();	// 학생 수
            int arr[] = new int[N]; // 학생 점수 배열 생성

            double sum = 0;	// 성적의 합 실수형으로 초기화

            for(int j = 0 ; j < N ; j++) {
                int score = scan.nextInt();	// 성적 입력
                arr[j] = score; // 반복문으로 arr 배열에 score 성적 입력
                sum += score;	// sum 변수에 score 성적 누적 입력
            }

            double avg = (sum / N); // avg 실수형 변수에 sum 성적의 누적합을 N 학생 수로 나눔

            double count = 0; // avg 평균이 넘는 학생의 수 count
            for(int j = 0 ; j < N ; j++) {
                if(arr[j] > avg) { // arr에 있는 입력된 점수가 avg 평균보다 크다면
                    count++; // count에 1을 더해줌
                }
            }
            double result = (count / N) * 100; // 평균이 넘는 학생의 수 / 총 학생의 수 * 100
            System.out.println(String.format("%.3f", result) + "%"); // 소수점 3번째 자리까지 출력
        }
    }
}