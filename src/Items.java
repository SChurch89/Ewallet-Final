
public class Items {
	private int UserID;
	private int Item_num;
	private String name;
	private double price;
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public int getItem_num() {
		return Item_num;
	}
	public void setItem_num(int item_num) {
		Item_num = item_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int whenCanIBuy(String itemname, double  price) {
		int months = 0;
		double amountLeft = price - totalSavings();
		months = (int) (amountLeft / totalIncome());
		return months;
	}
	private double totalIncome() {
		// TODO Auto-generated method stub
		return 0;
	}
	private double totalSavings() {
		// TODO Auto-generated method stub
		return 0;
	}

}
