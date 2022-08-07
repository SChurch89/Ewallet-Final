public class Expense {
	private int UserID;
	private int Expense_trans_num;
	private String type;
	private double amount;
	private int month;
	
	public Expense(String type, double amount, int month) {
		this.type = type;
		this.amount = amount;
		this.month = month;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public String toString() {
		return type+" $" + String.format("%.2f", amount);
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public int getExpense_trans_num() {
		return Expense_trans_num;
	}

	public void setExpense_trans_num(int expense_trans_num) {
		Expense_trans_num = expense_trans_num;
	}
}
