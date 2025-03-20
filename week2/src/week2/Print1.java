package week2;

public class Print1 {
	public static void main(String[] args) {
		// main 메소드는 단축키 : main + ctrl + spacebar
		// main 메소드는 반드시 필요 => JVM이 main을 찾아서 실행 => 프로그램 실행의 시작점
		// 출력 단축키 : sysout + ctrl + spacebar
		// 실행 단축키 : ctrl + F11
		System.out.println("객체지향 프로그래밍");
		
		/*System.out.println("객체");
		System.out.println("지향");*/
		
		// 주석 단축키 : ctrl + / (토글 키)
		System.out.println("/*객체지향*/ 프로그래밍");
		
		// 숫자 출력시 주의사항
		System.out.println(17+35);
		System.out.println("17 + 35" + 17+35);     // 문자열 연결은 + 를 사용함, 문자열 + 숫자 => 문자열로 취급함
		System.out.println("17 + 35" + (17+35));   // 괄호를 이용하면 숫자를 먼저 계산해서 나옴
		
		// 다양한 출력 포맷
		// 문자열 포맷 (printf / C언어랑 유사)
		// % : 프린트 포맷 기호
		// %s : 문자열 출력
		// %d : 정수 출력
		// %f : 실수 출력
		// \n : 줄바꿈
		
		System.out.printf("이름 : %s\n", "홍길동");  // 포맷 이용시 사용하는 방법
		System.out.printf("나이 : %d\n", 25);
		
		// 만약 3개를 출력하는데 4개가 있으면 3개만 출력되듯이 출력되나, 3개를 출력해야되는데 2개만 있다면 오류가 발생한다.
		System.out.printf("과목 : %s%s %s\n", "객체", "지향", "프로그래밍", "언어");		
	}
}