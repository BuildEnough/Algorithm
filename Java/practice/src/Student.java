// 학생의 성적 기록을 나타냄
import java.util.Scanner;
public class Student {
    // 객체 변수들
    public String name; // 이름
    public int assignmentScore; // 과제 점수
    public int examScore; // 시험 점수

    // 객체 메소드들
    // 현 Student 객체의 정보에 대한 문자열을 반환함
    public String toString()
    {
        String str = "";
        str += "이름: " + name + "\n";
        str += "과제 점수: " + assignmentScore + "\n";
        str += "시험 점수: " + examScore + "\n";
        str += "학점: " + examScore + "\n";
        return str;
    }

    // 학생의 학점을 반환
    public char getGrade()
    {
        char letterGrade; // 학생의 학점
        double total; // 학생의 점수들의 총점

        // 학생의 점수들의 총점을 계산함
        total = assignmentScore*0.4 + examScore*0.6;

        // 총점에 따라 학점을 부여함
        if (total >= 90) letterGrade = 'A';
        else if (total >= 80) letterGrade = 'B';
        else if (total >= 70) letterGrade = 'C';
        else if (total >= 60) letterGrade = 'D';
        else letterGrade = 'F';

        return letterGrade;
    }
}
