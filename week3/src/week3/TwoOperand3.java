package week3;

public class TwoOperand3 {
	public static void main(String[] args) {
		// 비트 논리 연산자 : &(and), |(or), ^(xor)
		byte num1 = 45;
		byte num2 = 25;
		int result = num1 & num2;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("result = " + result);
		System.out.println();
		
		// &(and) 연산자  (두개의 값이 1인것만 더해서 결과값을 도출한다.)
		System.out.printf("num1 	  = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2 	  = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result(&) = %6s\n", Integer.toBinaryString(result));
		System.out.println();
		
		// |(or) 연산자
		result = num1 | num2;
		System.out.println("result = " + result);
		System.out.printf("num1 	  = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2 	  = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result(|) = %6s\n", Integer.toBinaryString(result));
		System.out.println();
		
		// ^(xor) 연산자  : 두개의 모양이 다른 경우에만 1이 된다. (같은경우 0이 됨)
		result = num1 ^ num2;
		System.out.println("result = " + result);
		System.out.printf("num1 	  = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2 	  = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result(^) = %6s\n", Integer.toBinaryString(result));
	}
}
