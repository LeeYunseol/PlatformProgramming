
public class FruitSeller {
	int numOFApple;
	int myMoney;
	final int APPLE_PRICE;

	public FruitSeller(int money, int appleNum,int price) {
		myMoney = money;
		numOFApple = appleNum;
		APPLE_PRICE = price;
	}
	
	public int saleApple(int money)
	{
		int num = money / APPLE_PRICE;
		numOFApple -= num;
		myMoney += money;
		return num;
	}
	
	public void ShowSaleResult()
	{
		System.out.println("남은 사과 : " + numOFApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}
