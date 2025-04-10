package week6;

public class ReferenceString {
	public static void main(String[] args) {
		// String 클래스 타입 변수
		String ssn = "9305162340123";

		// String 변수는 0번부터 index값을 가진다.
		char gender = ssn.charAt(6);  // ssn.charAt(n) : 특정 인덱스의 값을 가져온다.
		switch(gender) {
		case '1', '3' -> System.out.println("남자");
		case '2', '4' -> System.out.println("여자");
		}
		
		// 문자열의 길이
		int length = ssn.length();
		if (length == 13)
			System.out.println("올바른 주민번호");
		else
			System.out.println("잘못된 주민번호");
		
		// 문자열 대체
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java"); // 찾는 값, 변경할 값
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		// 문자열 잘라내기(가져오기, 추출하기)
		// 0번(처음)부터 5번까지(6번 앞까지) 가져오기
		String firstNum = ssn.substring(0, 6); // 내가 가져오고 싶은 길이에 +1을 해야 원하는 값을 추출할 수 있음
		System.out.println(firstNum);
		
		// 6번 index부터 끝까지 가져오는 방법
		String secondNum = ssn.substring(6);
		System.out.println(secondNum);
		
		// 문자열 찾기
		//String oldStr = "자바 프로그래밍";
		// indexof() = 프로그래밍이라는 단어가 인덱스 몇번에 있는지 찾아주는 명령어
		// "프로그래밍" 단어가 몇 번 인덱스에 있나?
		// 찾고자 하는 값이 없을 때 -1을 리턴한다.
		int index = oldStr.indexOf("프로그래밍");
		if (index == -1)
			System.out.println("프로그래밍 단어가 포함되어있지 않음");
		else
			System.out.println(index + "번 인덱스에 프로그래밍 단어가 있음");
		
		// 문자열 포함 여부 확인
		boolean result = oldStr.contains("Java");
		if(result)
			System.out.println("자바와 관련된 문자열");
		else
			System.out.println("자바와 관련없는 문자열");
		
		// 문자열 분리
		String board = "1,자바학습,참조타입 String 클래스,홍길동";
		String[] tokens = board.split(","); // split() : 특정 값을 기준으로 나눈다.
		for (int i = 0; i < tokens.length; i++)
			System.out.print(tokens[i] + " ");
		
		System.out.println();
		
		// 향상된 for 문 적용
		for (String str : tokens)  // index없이 실행가능한 것
			System.out.print(str + " ");
	}
}