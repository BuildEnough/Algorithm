import java.util.Scanner;
import java.util.Arrays; // 배열을 정렬해주기 위해 불러옴
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double arr[] =  new double[scan.nextInt()]; // 배열 실수형으로 입력: 제일 큰 값으로 처리해줘야하는 과정에서 실수필요

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt(); // 배열에 입력, 시험 점수는 정수형으로 입력됨
        }

        Arrays.sort(arr); // arr 배열 정렬

        double sum = 0; // sum 변수 초기화

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] / arr[arr.length-1] * 100); // sum이란 변수에 배열의 가장 뒤의 값인 최대값으로 나눈후 다시 100을 곱해줌
        }

        System.out.println(sum / arr.length); // 새로운 평균 값 sum에서 arr 배열의 길이를 나눠줌
    }
}