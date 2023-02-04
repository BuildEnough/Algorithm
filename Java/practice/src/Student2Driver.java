// Student2 클래스와 그 메소드들을 사용
public class Student2Driver {
    public static void main(String[] args) {
        // 첫 번째 학생을 나타내는 객체 만듬
        Student2 stud1 = new Student2();

        // 첫 번째 학생의 이름 정함
        stud1.setName("선남");

        // 첫 번째 학생의 과제 점수 줌
        stud1.setAssignmentScore(91);

        // 첫 번째 학생의 시험 점수 줌
        stud1.setExamScore(84);

        // 첫 번째 학생의 이름, 점수들과 학점을 출력
        System.out.println(stud1.toString());


        // 두 번째 학생을 나타내는 객체 만듬
        Student2 stud2 = new Student2();

        // 두 번째 학생의 이름 정함
        stud2.setName("선녀");

        // 두 번째 학생의 과제 점수 줌
        stud2.setAssignmentScore(86);

        // 두 번째 학생의 시험 점수 줌
        stud2.setExamScore(95);

        // 두 번째 학생의 이름, 점수들과 학점을 출력
        System.out.println(stud2.toString());
    }
}
