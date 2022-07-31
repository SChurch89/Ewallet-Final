
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenu implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel welcomePanel = new JPanel();
	JPanel balancePanel = new JPanel();
	JPanel currencyPanel = new JPanel();
	JPanel topPanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JLabel welcome = new JLabel("Welcome to the EWallet App");
	JButton addExpense = new JButton("Add Monthly Expense");
	JButton addMonthlyIncome = new JButton("Add Monthly Income");
	JButton addMonthlySaving = new JButton("Add Monthly Savings");
	JButton printExpenseReport = new JButton("Print Expense Report");
	JButton printIncomeReport = new JButton("Print Income Report");
	Button printSavingReport = new JButton("Print Savings Report");
	JRadioButton Dollar = new JRadioButton("Dollars (USD)");
	JRadioButton Euro = new JRadioButton("Euros (EUR)");
	JRadioButton Yen = new JRadioButton("Yen (JPY)");
	JRadioButton PoundSterling = new JRadioButton("Pound Sterling (GBP)");
	JRadioButton CanadianDollar = new JRadioButton("Canadian Dollars (CAD)");
	JRadioButton AustralianDollar = new JRadioButton("Australian Dollars (AUD)");
	ButtonGroup buttonGroup = new ButtonGroup();
	JFrame income = new JFrame();
	JFrame expenses = new JFrame();
	JFrame saving = new JFrame();
	JPanel incomePanel = new JPanel();
	JLabel incomeType = new JLabel("Income Type");
	JLabel incomeAmount = new JLabel("Income Amount");
	JLabel incomeMonth = new JLabel("Income Month");
	JTextField incomeTypeBox = new JTextField(10);
	JTextField incomeAmountBox = new JTextField(10);
	JTextField incomeMonthBox = new JTextField(10);
	JPanel incomeButtonPanel = new JPanel();
	JButton addIncomeButton = new JButton("Add Income");
	JPanel expensePanel = new JPanel();
	JLabel expenseType = new JLabel("Expense Type");
	JLabel expenseAmount = new JLabel("Expense Amount");
	JLabel expenseMonth = new JLabel("Expense Month");
	JTextField expenseTypeBox = new JTextField(10);
	JTextField expenseAmountBox = new JTextField(10);
	JTextField expenseMonthBox = new JTextField(10);
	JPanel expenseButtonPanel = new JPanel();
	JButton addExpenseButton = new JButton("Add Expense");
	JPanel savingPanel = new JPanel();
	JLabel savingAmount = new JLabel("Savings Amount");
	JLabel saving = new JLabel("Savings Month");
	JTextField savingAmountBox = new JTextField(10);
	JTextField savingMonthBox = new JTextField(10);
	JPanel savingButtonPanel = new JPanel();
	JButton addSavingButton = new JButton("Add Savings");

	
	EWallet eWallet = new EWallet();

	public MainMenu() {

		frame.setTitle("Main Menu");
		frame.setSize(600, 300);

		JLabel balance = new JLabel("Current Balance");

		JTextField currentBalance = new JTextField(10);

		balancePanel.add(balance);
		balancePanel.add(currentBalance);
		currencyPanel.setLayout(new GridLayout(2, 3));

		Dollar.addActionListener(this);
		currencyPanel.add(Dollar);
		buttonGroup.add(Dollar);
		Dollar.setSelected(true);

		CanadianDollar.addActionListener(this);
		currencyPanel.add(CanadianDollar);
		buttonGroup.add(CanadianDollar);

		AustralianDollar.addActionListener(this);
		currencyPanel.add(AustralianDollar);
		buttonGroup.add(AustralianDollar);

		PoundSterling.addActionListener(this);
		currencyPanel.add(PoundSterling);
		buttonGroup.add(PoundSterling);

		Euro.addActionListener(this);
		currencyPanel.add(Euro);
		buttonGroup.add(Euro);

		Yen.addActionListener(this);
		currencyPanel.add(Yen);
		buttonGroup.add(Yen);
		
		addExpense.addActionListener(new AddExpenseListener());

		addMonthlyIncome.addActionListener(new AddIncomeListener());
		
		addMonthlySaving.addActionListener(new AddSavingListener());
		

		printExpenseReport.addActionListener(new PrintExpenseReportListener());

		printIncomeReport.addActionListener(new PrintIncomeReportListener());
		
		printSavingReport.addActionListener(new PrintSavingReportListener());

		buttonPanel.add(addExpense);
		buttonPanel.add(addMonthlyIncome);
		buttonPanel.add(addMonthlySaving);
		buttonPanel.add(printExpenseReport);
		buttonPanel.add(printIncomeReport);
		buttonPanel.add(printSavingReport);

		welcomePanel.add(welcome);
		topPanel.add(welcomePanel);
		topPanel.add(balancePanel);
		topPanel.add(currencyPanel);
		topPanel.setLayout(new GridLayout(3, 1));

		buttonPanel.setLayout(new GridLayout(2, 2));

		panel.setLayout(new BorderLayout());
		panel.add(topPanel, BorderLayout.NORTH);
		panel.add(buttonPanel, BorderLayout.SOUTH);

		panel.setBackground(Color.BLUE);
		
		createAddIncome();
		createAddSaving();
		createAddExpense();
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void createAddIncome()  {
		incomePanel.setLayout(new GridLayout(7, 1));
		incomePanel.add(incomeType);
		incomePanel.add(incomeTypeBox);
		incomePanel.add(incomeAmount);
		incomePanel.add(incomeAmountBox);
		incomePanel.add(incomeMonth);
		incomePanel.add(incomeMonthBox);
		incomeButtonPanel.add(addIncomeButton);
		incomePanel.add(incomeButtonPanel);
		income.add(incomePanel);
		income.setSize(200, 300);
		addIncomeButton.addActionListener(new AddIncomeButtonListener());
		
		
	}
	public void createAddSaving()  {
		savingPanel.setLayout(new GridLayout(7, 1));
		savingPanel.add(savingAmount);
		savingPanel.add(savingAmountBox);
		savingPanel.add(savinsMonth);
		savingPanel.add(savingMonthBox);
		savingButtonPanel.add(addsavingButton);
		savingPanel.add(savingButtonPanel);
		saving.add(incomePanel);
		saving.setSize(200, 300);
		addSavingButton.addActionListener(new AddSavingButtonListener());
		
		
	}
	public void createAddExpense()  {
		expensePanel.setLayout(new GridLayout(7, 1));
		expensePanel.add(expenseType);
		expensePanel.add(expenseTypeBox);
		expensePanel.add(expenseAmount);
		expensePanel.add(expenseAmountBox);
		expensePanel.add(expenseMonth);
		expensePanel.add(expenseMonthBox);
		expenseButtonPanel.add(addExpenseButton);
		expensePanel.add(expenseButtonPanel);
		expenses.add(expensePanel);
		expenses.setSize(200, 300);
		addExpenseButton.addActionListener(new AddExpenseButtonListener());
		
		
	}
	private class AddIncomeListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			income.setVisible(true);
			
		}
		
	}
	private class AddIncomeButtonListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			String type = incomeTypeBox.getText();
			double amount = Double.parseDouble(incomeAmountBox.getText());
			int month = Integer.parseInt(incomeMonthBox.getText());
			Income inc = new Income(type, amount, month);
			System.out.println(inc);
			eWallet.addIncome(inc, month);
			incomeTypeBox.setText("");
			incomeAmountBox.setText("");
			incomeMonthBox.setText("");
			income.setVisible(false);
			
		}
		
	}
	private class AddSavingListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			saving.setVisible(true);
			
		}
		
	}
	private class AddSavingButtonListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			double amount = Double.parseDouble(savingAmountBox.getText());
			int month = Integer.parseInt(savingMonthBox.getText());
			Income inc = new Income(amount, month);
			System.out.println(inc);
			eWallet.addsaving(inc, month);
			savingAmountBox.setText("");
			savingMonthBox.setText("");
			saving.setVisible(false);
			
		}
		
	}
	private class AddExpenseListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			expenses.setVisible(true);
			
		}
		
	}
	private class AddExpenseButtonListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			String type = expenseTypeBox.getText();
			double amount = Double.parseDouble(expenseAmountBox.getText());
			int month = Integer.parseInt(expenseMonthBox.getText());
			Expense ex = new Expense(type, amount, month);
			System.out.println(ex);
			eWallet.addExpense(ex, month);
			expenseTypeBox.setText("");
			expenseAmountBox.setText("");
			expenseMonthBox.setText("");
			expenses.setVisible(false);
			
		}
		
	}
	private class PrintIncomeReportListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			String report = eWallet.printIncome();
			JOptionPane.showMessageDialog(null, report);
			
		}
		
	}
	private class PrintSavingReportListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			String report = eWallet.printSaving
			JOptionPane.showMessageDialog(null, report);
			
		}
		
	}
	private class PrintExpenseReportListener implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent e) {
			String report = eWallet.printExpense();
			JOptionPane.showMessageDialog(null, report);
			
		}
		
	}
	
 //@Override
 public void actionPerformed(ActionEvent e) { //consider renaming to "CanadianDollarButton or CanadianDollarBtn"
	 /*if(e.getSource() == CanadianDollar) { //To convert USD to CAD, multiply given value in USD by 1.29
		//String amount = currentBalance.getText();
		Integer.parseInt(amount);
		int dollar = Integer.parseInt(amount);
		double canadianDollar = dollar * 1.29;
		
	 }*/
	 
 }

}







