package week5;

import java.util.Scanner;

public class ScoreGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		char grade;
		while (true)
		{
			System.out.print("점수 입력 >> ");
			score = sc.nextInt();
			
			
			if (score >=90)
			{
				grade = 'A';
			} else if(score >=80)
			{
				grade = 'B';
			} else if(score >=70)
			{
				grade = 'C';
			} else if(score >=60)
			{
				grade = 'D';
			} else if(score >=0)
			{
				grade = 'F';
			} else
			{
				break;
			}
			
			System.out.println("SCORE                 GRADE");
			System.out.println("===========================");
			System.out.printf("   %d                   %c \n", score, grade);
			
		}
		
		System.out.println("프로그램 종료");
		sc.close();		
	}
			
}
