// 학생의 성적 기록을 나타냄
import java.util.Scanner;
public class Student2 {
    // 객체 변수들
    private String name;
    private int assignmentScore;
    private int examScore;

    // 접근자 메소드

    // 학생의 이름 반환
    public String getName()
    {
        return name;
    }

    // 학생의 과제 점수 반환
    public int getAssignmentScore()
    {
        return assignmentScore;
    }

    // 학생의 시험 점수 반환
    public int getExamScore()
    {
        return examScore;
    }


    // 학생의 학점 반환
    public char getGrade()
    {
        char letterGrade; // 학생의 학점
        double total; // 학생의 점수들의 총점

        // 학생의 점수들의 총점을 계산함
        total = getAssignmentScore() * 0.4 + getExamScore() * 0.6;

        // 총점에 따라 학점을 부여
        if (total >= 90) letterGrade = 'A';
        else if (total >= 80) letterGrade = 'B';
        else if (total >= 70) letterGrade = 'C';
        else if (total >= 60) letterGrade = 'D';
        else letterGrade = 'F';

        return letterGrade;
    }

    // 현 Student 객체의 정보에 대한 문자열을 반환
    public String toString()
    {
        String str = "";
        str += "이름: " + name + "\n";
        str += "과제 점수: " + assignmentScore + "\n";
        str += "시험 점수: " + examScore + "\n";
        str += "학점: " + examScore + "\n";
        return str;
    }


    // 변경자 메소드

    // 이름을 주어진 값을 변경함
    public void setName(String Name)
    {
        name = Name;
    }

    // 과제 점수를 주어진 값으로 변경
    public void setAssignmentScore(int AssignmentScore)
    {
        assignmentScore = AssignmentScore;
    }

    // 시험 점수를 주어진 값으로 변경
    public void setExamScore(int ExamScore)
    {
        examScore = ExamScore;
    }
}
