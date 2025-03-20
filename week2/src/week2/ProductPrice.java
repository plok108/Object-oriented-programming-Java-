package week2;

public class ProductPrice {
	public static void main(String[] args) {
		int totalPrice = 5700;
		int cnt = 7;
		
		System.out.printf("구매 수량 : %d개\n", cnt);
		System.out.printf("총 구매 금액 : %d원\n", totalPrice);
		
		// 단가 = 총 금액 / 개수
		// int / int => 결과는 int
		double aPrice = (double)totalPrice / cnt;   // cnt나 totalPrice 둥중 한곳에만 캐스팅 해주면 된다. 
		System.out.printf("상품 단가 : %.1f원\n", aPrice);
	}
}