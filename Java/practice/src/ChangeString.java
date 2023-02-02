public class ChangeString {
    public static void main(String[] args) {
        // str은 주어진 문자열을 가리킴
        String str = "자바 프로그래밍은 어렵다!";

        // 주어진 문자열을 출력함
        System.out.println("주어진 문자열:" + str);

        // 주어진 문자열의 길이 출력
        System.out.println("주어진 문자열의 길이: " + str.length());

        //주어진 문자열내에서 '어렵다'가 나오는 첫 번째 지수를 찾음
        int position = str.indexOf("어렵다!");

        // 찾은 지수 출력
        System.out.println("\'어렵다\'라는 단어는 지수 " + position + "에서 시작함");

        // 주어진 문자열내의 '어렵다'를 '쉽다'로 바꿈
        str = str.substring(0, position) + "쉽다!";

        // 바뀐 문자열 출력
        System.out.println("바뀐 문자열:" + str);
    }
}