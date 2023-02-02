// 1과 6사이의 난수 2개 생성
import java.util.Random;
public class SimulateDie {
    public static void main(String[] args) {
        // Random 객체를 생성하고 generator이 그 객체를 가리키게 함
        Random generator = new Random();

        // 난수를 저장하는 변수
        int randomnumber1;
        float randomnumber2;

        // 1과 6사이의 난수 생성
        randomnumber1 = generator.nextInt(6) + 1;

        // 난수 출력
        System.out.println("생성된 난수는 " + randomnumber1 + "이다.");

        randomnumber2 = generator.nextFloat() * 6;

        // 생성된 난수를 1과 6사이의 난수로 변환
        randomnumber1 = (int)randomnumber2 + 1;

        // 난수 출력
        System.out.println("생성된 난수는 " + randomnumber1 + "이다.");
    }
}
