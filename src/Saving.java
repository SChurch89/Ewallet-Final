
public class Saving {
		private int UserID;
		private int Savings_trans_num;
		private String type;
		private double amount;
		private int month;
		
		public Saving (String type, double amount, int month) {
			this.amount = amount;
			this.month = month;
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

		public int getSavings_trans_num() {
			return Savings_trans_num;
		}

		public void setSavings_trans_num(int savings_trans_num) {
			Savings_trans_num = savings_trans_num;
		}

	}


