package backjoonCoding;

import java.util.Scanner;

public class BK1000 {
	public static void main(String[] args)
	{
		double a, b = 0;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > 0 && b < 10)
		{
			System.out.println((a / b));	// a - b / a * b / (a / b)		
		}	
	}
}
