package week3;

public class OneOperand3 {
	public static void main(String[] args) {
		// 단항 연산자 : ~ (비트 반전 연산자, 2진수를 기준으로 계산함)
		int var1 = 10;
		int var2 = ~var1;
		int var3 = ~var1 + 1;
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		
		//Integer.toBinaryString(var1)  <-- 참고
		// 반전시켜서 -부호비트가 되면 -값을 10진수로 변환할때 2의 보수(0을 1로 바꾼 후 1을 더함)을/를 사용한다.
		// ex) 10 -> 1010(2) -> -1 0101(2) -> -1 1010(2, 1의보수) -> -1 1011(2, 2의보수)
		//     따라서 결과는 -1 1011(2)이므로 -11(10)이 나온다.
		// 참고사항 : int는 4바이트, short는 2바이트
		System.out.printf("십진수(%d) :%32s\n", var1, Integer.toBinaryString(var1));
		System.out.printf("십진수(%d):%32s\n", var2, Integer.toBinaryString(var2));
		System.out.printf("십진수(%d):%32s\n", var3, Integer.toBinaryString(var3));
	}
}
