package week3;  // 202244030 정태완

public abstract class ThreeWeekPractice {
	public static void main(String[] args) {
		// 상품 가격 계산하기(야채 품목 제외)
		int m_cnt = 1;
		int m_price = 4500;
		int c_cnt = 3;
		int c_price = 1000;
		int s_cnt = 2;
		int s_price = 1500;
		
		double rate = 25;      // 할인율
		
		
		int m_s_total = (m_cnt * m_price) + (s_cnt * s_price);  // 당근 제외 가격
		int c_total = (c_cnt * c_price);
		int total = m_s_total + c_total;   // 총합 가격
		System.out.printf("총 상품 가격 : %d원\n", total);
		
		// 할인 적용 : 25% => rate / 100 => 0.25 
		
		double discount = m_s_total * (rate / 100);
		System.out.printf("할인 금액 : %.1f원\n", discount);
		
		// 최종 결제 금액 = 원래 금액 - 할인 금액
		double final_amt = total - discount;
		System.out.printf("최종 결제 금액 : %.1f원\n", final_amt);
	}

}
