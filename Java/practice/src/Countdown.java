// 카운트 다운하는 프로그램
public class Countdown {
    public static void main(String[] args) {
        // 카운트 시작을 10부터 함
        int count = 10;

        System.out.println("카운트 다운 시작");

        // 카운트 다운을 10에서 0이 될 때까지 함
        while (count >= 0){
            System.out.println(count);
            count--;
        }
        System.out.println("발사!");
    }
}