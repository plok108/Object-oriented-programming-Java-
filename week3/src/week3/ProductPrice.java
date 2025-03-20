package week3;

public class ProductPrice {
	public static void main(String[] args) {
		// 상품 가격 계산하기
		int m_cnt = 1;
		int m_price = 4500;
		int c_cnt = 3;
		int c_price = 1000;
		int s_cnt = 2;
		int s_price = 1500;
		
		// 할인 전 상품 가격
		//int total;
		
		//total = (m_cnt * m_price) + (c_cnt * c_price) + (s_cnt * s_price);
		int total = c_cnt * m_price;
		total += c_cnt * c_price;
		total += s_cnt * s_price;
		System.out.printf("총 상품 가격 : %d원\n", total);
		
		// 할인 적용 : 10% => 10/100 => 0.1
		
		double discount = total * 0.1;
		System.out.printf("할인 금액 : %.1f원\n", discount);
		
		//최종 결제 금액 = 원래 금액 - 할인 금액
		double final_amt = total - discount;
		System.out.printf("최종 결제 금액 : %.1f원\n", final_amt);
		
		
	}
}
