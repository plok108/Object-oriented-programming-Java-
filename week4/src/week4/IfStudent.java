package week4;

import java.util.Scanner;

public class IfStudent {
	public static void main(String[] args) {
		// Scanner 객체(클래스) : 외부로부터 데이터값을 입력받을 수 있음
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 연도를 입력하세요 : ");
		
		int year = sc.nextInt();
		System.out.println(year);
		
		int age = 2025 - year;
		
		if (age >= 20 && age <= 26) {
			System.out.println("대학생");
		} else if (age >= 17 && age < 20){
			System.out.println("고등학생");
		} else if (age >= 14 && age < 17) {
			System.out.println("중학생");
		} else if (age >= 8 && age < 14) {
			System.out.println("초등학생");
		} else {
			System.out.println("학생이 아닙니다.");
		}
	}
}
