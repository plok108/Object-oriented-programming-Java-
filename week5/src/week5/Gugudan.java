package week5;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 몇 단을 계산할까? ");
		
		int num = sc.nextInt();
		
		System.out.printf("< 구구단 %d단 >\n", num);
		for (int i =1; i<=9; i++)
		{
			int sum = num * i;
			System.out.printf("%d X %d = %d\n", num, i, sum);
		}
		
		sc.close();
	}
}
