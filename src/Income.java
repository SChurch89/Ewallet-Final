

	public class Income {
		private int UserID;
		private int Income_trans_num;
		private String type;
		private double amount;
		private int month;
		
		public Income(String type, double amount, int month) {
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

		public int getIncome_trans_num() {
			return Income_trans_num;
		}

		public void setIncome_trans_num(int income_trans_num) {
			Income_trans_num = income_trans_num;
		}

		public int getUserID() {
			return UserID;
		}

		public void setUserID(int userID) {
			UserID = userID;
		}

	}


