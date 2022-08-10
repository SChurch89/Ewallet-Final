
public class ThingICanBuy {
	private int UserID;
	private int Savings_trans_num;
	private String name;
	private double amount;
	private double payment;
	private int length;
	
	public ThingICanBuy(String name, double amount, double payment, int length) {
		this.name = name;
		this.amount = amount;
		this.payment = payment;
		this.length = length;
		System.out.println("name: " + name + "\namount: " + amount + "\npayment: " + payment + "\nlength" + length); // TEST
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public int getSavings_trans_num() {
		return Savings_trans_num;
	}

	public void setSavings_trans_num(int savings_trans_num) {
		Savings_trans_num = savings_trans_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
		return " $" + String.format("%.2f", amount);
	}
	
}
