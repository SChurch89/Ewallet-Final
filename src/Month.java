
	import java.util.ArrayList;

	public class Month {
		private ArrayList<Income> incomes;                    //Declare income  ArrayList
		private ArrayList<Expense> expenses;                  //Declare expense ArrayList
		
		public Month() {
			incomes = new ArrayList<Income>();                //Create List of incomes
			expenses = new ArrayList<Expense>();              //Create List of expenses
		}
		
		public void addIncome(Income income) {
			incomes.add(income);
		}
		
		public void addExpense(Expense expense) {
			expenses.add(expense);
		}
		public double monthlyIncome()  {
			double total = 0;
			for(int i = 0; i<incomes.size(); i++) {
				total += incomes.get(i).getAmount();
			}
			return total;
		}
		public double monthlyExpenses()  {
			double total = 0;
			for(int i = 0; i<expenses.size(); i++) {
				total += expenses.get(i).getAmount();
			}
			return total;
		}
		public String printMonthlyIncome()  {
			String s="";
			for(int i = 0; i<incomes.size(); i++) {
				s+= incomes.get(i).toString()+"\n";
			}
			s+= "Total: $" + String.format("%.2f", monthlyIncome())+"\n";
			return s;
		}
		public String printMonthlyExpenses()  {
			String s="";
			for(int i = 0; i<expenses.size(); i++) {
				s+= expenses.get(i).toString()+"\n";
			}
			s+= "Total: $" + String.format("%.2f", monthlyExpenses())+"\n";
			return s;
		}

		public double monthlySavings1() {
			// TODO Auto-generated method stub
			return 0;
		}

		public double monthlySavings() {
			// TODO Auto-generated method stub
			return 0;
		}

		public String printMonthlySavings() {
			// TODO Auto-generated method stub
			return null;
		}
	}



	//list of income and expenses for that month


