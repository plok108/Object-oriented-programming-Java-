package week9;
public class Student {
    private String name;
    private int kor;
    private int eng;
    private int math;

    // 생성자
    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 총점 계산
    public int getTotal() {
        return kor + eng + math;
    }

    // 평균 계산
    public double getAve() {
        return getTotal() / 3.0;
    }

    // 결과 출력용 메서드 (옵션)
    public void printResult() {
        System.out.printf("%s : 총점 %d점, 평균 %.1f점\n", name, getTotal(), getAve());
    }
}