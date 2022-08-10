import java.util.ArrayList;
import java.util.Arrays;

public class EWallet {
	private ArrayList<Month> months;                    //Declare income  ArrayList
	private final String [] MONTHS = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
	
	public EWallet() {
		months = new ArrayList<Month>(12);              //Create List of incomes
		for(int i = 0; i < 12; i++) {
			months.add(new Month());
			
		}
		
	}
	
	public void addIncome(Income income, int month) {
		months.get(month).addIncome(income);
	}
	
	public void addExpense(Expense expense, int month) {
		months.get(month).addExpense(expense);
	}
	public double totalIncome()  {
		double total = 0;
		for(int i = 0; i<months.size(); i++) {
			total += months.get(i).monthlyIncome();
		}
		return total;
	}
	public double totalExpenses()  {
		double total = 0;
		for(int i = 0; i<months.size(); i++) {
			total += months.get(i).monthlyExpenses();
		}
		return total;
	}
	public double totalSavings()  {
		double total = 0;
		for(int i = 0; i<months.size(); i++) {
			total += months.get(i).monthlySavings();
		}
		return total;
	}
	public String printIncome()  {
		String s="INCOME REPORT\n\n";
		for(int i = 0; i<months.size(); i++) {
			s+= MONTHS[i] + "\n";
			s+= months.get(i).printMonthlyIncome()+"\n";
		}
		s+= "------------------------------\n";
		s+= "GRAND TOTAL: $" + String.format("%.2f", totalIncome())+"\n";
		return s;
	}
	public String printExpense()  {
		String s="EXPENSES REPORT\n\n";
		for(int i = 0; i<months.size(); i++) {
			s+= MONTHS[i] + "\n";
			s+= months.get(i).printMonthlyExpenses()+"\n";
		}
		s+= "------------------------------\n";
		s+= "GRAND TOTAL: $" + String.format("%.2f", totalExpenses())+"\n";
		return s;
	}

	public void addSaving(Income inc, int month) {
		
	}
	
	public int whenCanIBuy(String itemname, double  price) {
		int months = 0;
		double amountLeft = price - totalSavings();
		months = (int) (amountLeft / totalIncome());
		return months;
	}

	public String printSavings() {
		String s="SAVINGS REPORT\n\n";
		for(int i = 0; i<months.size(); i++) {
			s+= MONTHS[i] + "\n";
			s+= months.get(i).printMonthlySavings()+"\n";
		}
		s+= "------------------------------\n";
		s+= "GRAND TOTAL: $" + String.format("%.2f", totalSavings())+"\n";
		return s;
	}
	public String printAll() {
		String s="OVERALL REPORT\n\n";
		s+= printIncome()+ "\n";
		s+= printExpense()+ "\n";
		s+= printSavings()+ "\n";
		return s;
	}
	public String getMonth(int month) {
		
		return MONTHS[month].toString();

	}
}







//EWallet list of months we have a way to add income
//and expense to any given month 