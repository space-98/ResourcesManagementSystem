package manager;
public class Money {
	
	float addMoney;
	String memo5;
	float spendMoney;
	String memo6;

	public Money() {
	}
	
	public Money(float addMoney, String memo5, float spendMoney, String memo6) {
		this.addMoney = addMoney;
		this.memo5 = memo5;	
		this.spendMoney = spendMoney;
		this.memo6 = memo6;			
	}

	public void printInfo() {
		System.out.println("AddMoney: " + addMoney + "\n" + "Memo5: " + memo5);
		System.out.println("SpendMoney: " + spendMoney + "\n" + "Memo6: " + memo6);
		System.out.println("LeftMoney: " + (addMoney - spendMoney));
	}
}
