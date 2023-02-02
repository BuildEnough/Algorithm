public class ConvertTemp {
    public static void main(String[] args) {
        int celsiusValue; // 섭씨 온도

        double fahrenheitValue; // 화씨 온도

        celsiusValue = 27; // 섭씨 온도를 나타내는 변수에 27 저장
        fahrenheitValue =  9.0 / 5.0 * celsiusValue + 32.0; // 섭씨 온도를 화씨 온도로 나타내는 변수에 저장

        System.out.println("섭씨온도 = " + celsiusValue);
        System.out.println("화씨온도 = " + fahrenheitValue);
    }
}
