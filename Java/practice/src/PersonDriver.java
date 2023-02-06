// Person 객체를 만들어 이용함
public class PersonDriver {
    public static void main(String[] args) {

        // 이름이 '홍길동'인 Person 객체를 생성하고 p1이 가리키게 함
        Person p1 = new Person("홍길동");
        // p1의 나이를 27로 변경
        p1.setAge(27);
        // p1의 이름과 나이를 출력
        System.out.println(p1.toString());


        // 나이가이 18인 Person 객체를 생성하고 p2이 가리키게 함
        Person p2 = new Person("홍길동");
        // p2의 이름을 '손오공'으로 변경
        p2.setName("손오공");
        // p2의 이름과 나이를 출력
        System.out.println(p2.toString());

        // 이름 '이도령'이고 나이가 20인 Person 객체를 생성하고 p3이 가리키게 함
        Person p3 = new Person("이도령", 20);
        // p3의 이름과 나이를 출력
        System.out.println(p3.toString());
    }
}
