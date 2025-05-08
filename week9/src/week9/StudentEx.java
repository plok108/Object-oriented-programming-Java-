package week9;

public class StudentEx {
    public static void main(String[] args) {
    // 학생 객체 생성
    Student student = new Student("홍길동", 90, 85, 87);

    // 결과 출력
    student.printResult();
    // 출력: 홍길동 : 총점 262점, 평균 87.3점
    }
}