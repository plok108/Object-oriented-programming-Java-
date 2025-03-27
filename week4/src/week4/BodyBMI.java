package week4;

import java.util.Scanner;

public class BodyBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("키(cm)를 입력하세요 : ");
		int cm = sc.nextInt();
		System.out.print("몸무게를 입력하세요 : ");
		int kg = sc.nextInt();
		
		System.out.printf("%s님의 키는 %dcm이고 몸무게는 %dkg입니다.\n", name, cm, kg);
		//System.out.println(name+"님의 키는 "+cm+"cm, 몸무게는 "+kg+"kg입니다.");
		System.out.println();
		
		double mcm = cm / 100.0;
		//System.out.println(mcm);
		double bmi = kg / (mcm * mcm);
		System.out.printf("BMI 지수는 : %.2f이고 ", bmi);
		
		// 
		//String result = "";
		//
		//if (bmi >= 18.5 && bmi 23)
		//	result = "정상";
		//else if (23 <= bmi && bmi < 25)
		//	result = "과체중";
		//else if (25 <= bmi && bmi < 30)
		//	result = "비만";
		//else if (bmi >= 30)
		//	result = "고도비만";
		//System.out.printf("BMI 지수 : %.2f, s", bmi, result);
		
		if (bmi > 30) {
			System.out.print("고도 비만");
		} else if (bmi >= 25) {
			System.out.print("비만");
		} else if (bmi >= 23) {
			System.out.print("과체중");
		} else if (bmi >= 18.5) {
			System.out.print("정상");
		}
		System.out.println("입니다.");
		sc.close();
		
	}
}
