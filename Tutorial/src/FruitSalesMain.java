
public class FruitSalesMain {

	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller(0, 30, 1500);
		FruitSeller seller2 = new FruitSeller(0, 20, 1000);
		
		FruitBuyer buyer = new FruitBuyer(10000);
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("과일 판매자 1의 현재현황");
		seller1.ShowSaleResult();
		
		System.out.println("과일 판매자 2의 현재현황");
		seller2.ShowSaleResult();
		
		System.out.println("과일 구매자의 현재현황");
		buyer.ShowBuyResult();
				

	}

}
