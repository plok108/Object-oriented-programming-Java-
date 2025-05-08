package week5;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		String inStr;
		
		do {
			// 반드시 한 번은 실행되는 블럭
			System.out.print(">> ");
			inStr = sc.nextLine();
			System.out.println(inStr);
		} while (!inStr.equals("q"));   //  입력된 값이 q가 아니면 반복
		
		System.out.println();
		System.out.println("\n프로그램을 종료합니다.");
		
		sc.close();
	}
}
