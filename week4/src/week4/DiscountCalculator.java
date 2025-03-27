package week4;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요 : ");
		int price = sc.nextInt();
		
		int discount = 0;
		int totalPrice = 0;
		
		if (price >= 100000){
			discount = 10;
		} else if (price >= 50000) {
			discount = 5;
		} else {
			discount = 0;
		}
		
		// 할인 금액 계산
		
		int discountAmt = price * discount / 100;
		totalPrice = price - discountAmt;
		
		System.out.printf("원래 가격 : %d원\n", price);
		System.out.printf("할인율 : %d\n", discount);
		System.out.printf("최종 가격 : %d원\n", totalPrice);
		sc.close();
	}
}