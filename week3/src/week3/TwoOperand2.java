package week3;

public class TwoOperand2 {
	public static void main(String[] args) {
		// 이항 연산자 : 비교연산자(<, >, <=, >=, ==, !=)
		// 논리 연산자 : &&(and, &), ||(or, |)
		int charCode1 = 'A';
		if (charCode1 >= 65 && charCode1 <= 90){
			// True && True = 둘다 True인 경우 최종 True이다.(둘 중 하나라도 False면 False이다.) 
			// 65와 90 사이를 만족하는 경우
			System.out.println((char)charCode1 + "는 알파벳 대문자이다.");
		}
		
		int charCode2 = 'b';
		if (charCode2 >= 97 && charCode2 <122){
			System.out.println((char)charCode2 + "는 알파벳 소문자이다.");
		}
		
		char charCode3 = '9';
		if ( !(charCode3 < 48) && !(charCode3 > 57) ){
			System.out.println((char)charCode3 + "는 0 ~ 9 사이의 숫자이다.");
		}
		
		int iValue = 4;
		// % : 나눈 나머지 값
		if ((iValue % 2) == 0){
			System.out.println(iValue + "는 2의 배수(짝수)이다.");
		}
		
		// 2의 배수이거나 (or, ||), 3의 배수인지 체크하는 방법(하단)
		if ((iValue % 2 == 0) || (iValue % 3 == 0)){
			// True || False = 둘 중 하나라도 True이면 True이다.
			System.out.println(iValue + "는 2의 배수 또는 3의 배수이다.");
		}
	}
}
