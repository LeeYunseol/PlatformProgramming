
public class FruitBuyer {
	int myMoney;
	int numOFApple;
	
	public FruitBuyer(int money)
	{
		myMoney = money;
		numOFApple = 0;
	}
	
	public void buyApple(FruitSeller seller, int money)
	{
		numOFApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void ShowBuyResult()
	{
		System.out.println("사과 개수 : " + numOFApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}
