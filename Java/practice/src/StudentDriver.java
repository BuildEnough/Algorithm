// Student 클래스와 그 메소드들을 사용함
public class StudentDriver {
    public static void main(String[] args) {
        // 첫 번째 학생을 나타내는 객체를 만듬
        Student stud1 = new Student();

        // 첫 번쨰 학생의 이름 정함
        stud1.name = "선남";

        // 첫 번째 학생의 과제 점수 줌
        stud1.assignmentScore = 91;

        // 첫 번째 학생의 시험 점수 줌
        stud1.examScore = 84;

        // 첫 번째 학생의 이름, 점수들과 학점 출력
        System.out.println(stud1.toString());


        // 두 번째 학생을 나타내는 객체 만듬
        Student stud2 = new Student();

        // 두 번쨰 학생의 이름 정함
        stud2.name = "선녀";

        // 두 번째 학생의 과제 점수 줌
        stud2.assignmentScore = 86;

        // 두 번째 학생의 시험 점수 줌
        stud2.examScore = 95;

        // 두 번째 학생의 이름, 점수들과 학점을 출력
        System.out.println(stud2.toString());
    }
}