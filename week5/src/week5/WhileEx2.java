package week5;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		// 무한 반복 루프
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		while (true)
		{
			// 무한 반복 부분
			System.out.print("첫 번째 숫자 >> ");
			num1 = sc.nextInt();
			
			System.out.print("첫 번째 숫자 >> ");
			num2 = sc.nextInt();
			
			int sum = num1 + num2;
			System.out.printf("%d + %d = %d\n", num1, num2, sum);
		}
	}	
}
