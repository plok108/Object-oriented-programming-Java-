package week3;

public class TwoOperand5 {
	public static void main(String[] args) {
		// 복합 대입 연산자 : +=, -=, *=, /= ....etc
		int result = 10;
		
		//int result2 = result + 10;
		// 변수의 재활용 가능
		//result = result + 10;
		// 코드의 효율성으로 사용하자 -> 복합 대입 연산자를 사용하자
		result += 10;
		System.out.println("result += 10 = " + result);
		
		//result = result -3;
		result -= -3;
		System.out.println("result -= 3 = " + result);
		
		//result = result *5;
		result *= 5;
		System.out.println("result *= 5 = " + result);
		
		//result = result /6;
		result /= 6;
		System.out.println("result /= 6 = " + result);
		
		//result = result /4;
		result %= 4;
		System.out.println("result %= 4 = " + result);
						
	}
}
