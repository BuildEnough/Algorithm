import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] stu = new int[31]; // 배열 입력, 출석을 1부터 세기 때문에 31까지 해야 30개가 됨

        for(int i=1; i<= 28; i++) {
            int num = scan.nextInt(); // 학생 번호 입력
            stu[num] = 1; // stu 배열에 각 해당하는 순서에 1 입력해줌
        }

        for(int j=1; j< stu.length; j++) {
            if(stu[j] != 1) // stu 배열에서 1이 아닐 경우  null 값일 경우
                System.out.println(j); // 해당 숫자 출력
        }
    }
}