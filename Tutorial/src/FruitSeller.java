
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
		System.out.println("���� ��� : " + numOFApple);
		System.out.println("�Ǹ� ���� : " + myMoney);
	}
}
