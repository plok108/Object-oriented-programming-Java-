package week5;

import java.util.Scanner;

public class RandomUpdown {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 100 + 1);
		Scanner sc = new Scanner(System.in);
		int score;
		
		while (true)
		{
			System.out.print("숫자를 맞혀 보세요(1~100) >> ");
			score = sc.nextInt();
			
			if (score <= 0 || score > 100)
			{
				System.out.println("1~100 사이의 값을 입력하세요");;
				
			} else if (score > num)
			{
				System.out.println("숫자가 너무 큽니다.");
			} else if (score < num)
			{
				System.out.println("숫자가 너무 작습니다.");
			} else 
			{
				System.out.printf("정답입니다. 랜덤 숫자는 : %d입니다.", num);
				break;
			}
							
		}
		sc.close();
	}
}
