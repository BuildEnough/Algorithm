// 사람을 모델함
public class Person {
    String name; // 이름을 나타내는 변수
    int age; // 나이를 나타내는 변수

    // 생성자 메소드 - 이름만 초기화
    public Person(String NewName)
    {
        setName(NewName);
    }

    // 생성자 메소드 - 나이만 초기화
    public Person(int NewAge)
    {
        setAge(NewAge);
    }

    // 생성자 메소드 - 이름과 나이를 초기화함
    public Person(String NewName, int NewAge)
    {
        setName(NewName);
        setAge(NewAge);
    }

    // 변경자 메소드

    // 이름을 주어진 값으로 변경함
    public void setName(String NewName)
    {
        name = NewName;
    }

    // 나이를 주어진 값으로 변경함
    public void setAge(int NewAge)
    {
        age = NewAge;
    }

    // 접근자 메소드

    // 이름 반환
    public String getName()
    {
        return name;
    }

    // 나이 반환
    public int getAge()
    {
        return age;
    }

    // 현 Person 객체의 정보에 대한 문자열 반환
    public String toString()
    {
        return (name + "\t\t" + age);
    }
}
