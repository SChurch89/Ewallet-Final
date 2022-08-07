import java.util.ArrayList;

public class User {
	private int UserID;
	private String Name;
	private String Username;
	private String Password;

	private ArrayList <Currency>currencyRates;
	private ArrayList <Wage>Income;  // user income sources that user can record or view or search by type or month 
	private ArrayList <Expense>Spending; //user's expenses 
	String username;
	String pwd;
	//current total income - total 
	double balance;
	// possible monthly savings, calculated using monthly income (most recent) assuming the data we have is for one year, and monthly and biweekly expenses, here you can assume yearly expenses that are recorded have already been paid. 
	double monthlysavings;	
	//should add constructor(s)
	User(String username,String password){}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
