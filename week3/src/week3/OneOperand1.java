package week3;

public class OneOperand1 {
	public static void main(String[] args) {
		// 단항연산자 : +, -, ++, --, !, ~
		int    iValue1 = 100;
		int	   iValue2 = -100;
		double dValue1 = 3.14;
		double dValue2 = -10.5;
		
		int result1 = +iValue1;
		int result2 = -iValue2;
		
		System.out.println("Result1 = " + result1);
		System.out.println("Result2 = " + result2);
		
		short sValue = 100;
		// int보다 크기가 작은 데이터 타입의 연산은 결과가 int 타입이다.
		// 그러므로 최소단위 타입 : int이다.
		//short sResult = -sValue;
		int sResult = -sValue;
		System.out.println("sResult = " + sResult);
		
		byte bValue = -100;
		int bResult = -bValue;
		
		long lValue = 100;
		long lResult = -lValue;
		System.out.println("lResult = " + lResult);
	}
}
