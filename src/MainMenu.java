import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
	JButton uploadExpenses = new JButton("Upload Expenses");
	JButton exportExpenses = new JButton("Export Expenses");
	JButton uploadIncome = new JButton("Upload Income");
	JButton exportIncome = new JButton("Export Income");


//JButton addSaving = new JButton("Add Monthly Saving");

	JButton printOverallReport = new JButton("Print Overall Report");
	JButton printExpenseReport = new JButton("Print Expense Report");
	JButton printIncomeReport = new JButton("Print Income Report");
	JButton printSavingsReport = new JButton("Print Savings Report");
	JRadioButton Dollar = new JRadioButton("Dollars (USD)");
	JRadioButton Euro = new JRadioButton("Euros (EUR)");
	JRadioButton Yen = new JRadioButton("Yen (JPY)");
	JRadioButton PoundSterling = new JRadioButton("Pound Sterling (GBP)");
	JRadioButton CanadianDollar = new JRadioButton("Canadian Dollars (CAD)");
	JRadioButton AustralianDollar = new JRadioButton("Australian Dollars (AUD)");
	ButtonGroup buttonGroup = new ButtonGroup();
	JFrame income = new JFrame();
	JFrame expenses = new JFrame();
	JFrame savings = new JFrame();
	JFrame buyFrame = new JFrame();
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


   // String[] Currency = {"Dollars (USD)","Euros (EUR)", "Yen (JPY)", "Pound Sterling (GBP)","Canadian Dollars (CAD)","Australian Dollars (AUD)"};
/* Constructor creates GUI components and adds GUI components
using a GridBagLayout. */
  
EWallet eWallet = new EWallet();
private final JButton whenCanIBuy = new JButton("When Can I Buy");
private final JPanel panel_1 = new JPanel();
private final JTextField itmName = new JTextField();
private final JTextField itmPrice = new JTextField();
private final JButton buyButton = new JButton("When Can I Buy?");
private final JLabel lblNewLabel = new JLabel("Item Name:");
private final JLabel lblPrice = new JLabel("Price:");

private static ArrayList<Expense> arrList = new ArrayList<Expense>();
private static ArrayList<Income> arrList2 = new ArrayList<Income>();


public MainMenu() {
	
	panel_1.setVisible(false);

	frame.setTitle("Main Menu");
	frame.setSize(800, 400);

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
	
	uploadExpenses.addActionListener(new UploadExpensesListener());
	
	exportExpenses.addActionListener(new ExportExpensesListener());
	
	uploadIncome.addActionListener(new UploadIncomeListener());
	
	exportIncome.addActionListener(new ExportIncomeListener());

	addMonthlyIncome.addActionListener(new AddIncomeListener());
	
	whenCanIBuy.addActionListener(new WhenBuyListener());

	
	//addMonthlySaving.addActionListener(new AddSavingListener());

//printOverallReport.addActionListener(new PrintOverallReportListener());

printExpenseReport.addActionListener(new PrintExpenseReportListener());

printIncomeReport.addActionListener(new PrintIncomeReportListener());

//printSavingsReport.addActionListener(new PrintSavingsReportListener());

buttonPanel.add(addExpense);

buttonPanel.add(uploadExpenses);

buttonPanel.add(exportExpenses);

buttonPanel.add(uploadIncome);

buttonPanel.add(exportIncome);

buttonPanel.add(addMonthlyIncome);

//buttonPanel.add(addSaving);

buttonPanel.add(printOverallReport);
buttonPanel.add(printExpenseReport);
buttonPanel.add(printIncomeReport);
buttonPanel.add(printSavingsReport);

welcomePanel.add(welcome);
topPanel.add(welcomePanel);
topPanel.add(balancePanel);
topPanel.add(currencyPanel);
topPanel.setLayout(new GridLayout(3, 1));

buttonPanel.setLayout(new GridLayout(3, 2));

panel.setLayout(new BorderLayout());
panel.add(topPanel, BorderLayout.NORTH);
panel.add(buttonPanel, BorderLayout.SOUTH);
buttonPanel.add(whenCanIBuy);

panel.setBackground(Color.BLUE);

createAddIncome();
//createAddSaving();
createAddExpense();


frame.getContentPane().add(panel);
panel.add(panel_1, BorderLayout.CENTER);
GridBagLayout gbl_panel_1 = new GridBagLayout();
gbl_panel_1.columnWidths = new int[]{0, 0, 0, 105, 0, 0, 27, 54, 128, 0, 0};
gbl_panel_1.rowHeights = new int[]{19, 0, 0, 0, 0};
gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
panel_1.setLayout(gbl_panel_1);
GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
gbc_lblNewLabel.gridx = 7;
gbc_lblNewLabel.gridy = 1;
panel_1.add(lblNewLabel, gbc_lblNewLabel);
itmName.setColumns(10);
GridBagConstraints gbc_itmName = new GridBagConstraints();
gbc_itmName.fill = GridBagConstraints.HORIZONTAL;
gbc_itmName.insets = new Insets(0, 0, 5, 5);
gbc_itmName.gridx = 8;
gbc_itmName.gridy = 1;
panel_1.add(itmName, gbc_itmName);
GridBagConstraints gbc_buyButton = new GridBagConstraints();
gbc_buyButton.anchor = GridBagConstraints.WEST;
gbc_buyButton.insets = new Insets(0, 0, 5, 0);
gbc_buyButton.gridx = 9;
gbc_buyButton.gridy = 1;

buyButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		System.out.println(whenCanIBuy(itmName.getText(), Double.parseDouble(itmPrice.getText())));
	}
});

panel_1.add(buyButton, gbc_buyButton);
GridBagConstraints gbc_lblPrice = new GridBagConstraints();
gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
gbc_lblPrice.anchor = GridBagConstraints.EAST;
gbc_lblPrice.gridx = 7;
gbc_lblPrice.gridy = 2;
panel_1.add(lblPrice, gbc_lblPrice);
GridBagConstraints gbc_itmPrice = new GridBagConstraints();
gbc_itmPrice.fill = GridBagConstraints.HORIZONTAL;
gbc_itmPrice.insets = new Insets(0, 0, 5, 5);
gbc_itmPrice.gridx = 8;
gbc_itmPrice.gridy = 2;
itmPrice.setColumns(10);
panel_1.add(itmPrice, gbc_itmPrice);
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
income.getContentPane().add(incomePanel);
income.setSize(200, 300);
addIncomeButton.addActionListener(new AddIncomeButtonListener());


}
/*public void createAddSaving()  {
savingPanel.setLayout(new GridLayout(7, 1));
savingPanel.add(savingAmount);
savingPanel.add(savingAmountBox);
savingPanel.add(savingMonthBox);
savingPanel.add(savingMonthBox);
savingPanel.add(savingButtonPanel);
savingPanel.add(savingButtonPanel);
saving.add(incomePanel);
saving.setSize(200, 300);
addSavingButton.addActionListener(new AddSavingButtonListener());


}*/
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
expenses.getContentPane().add(expensePanel);
expenses.setSize(200, 300);
addExpenseButton.addActionListener(new AddExpenseButtonListener());


}
private class AddIncomeListener implements ActionListener  {

@Override
public void actionPerformed(ActionEvent e) {
	income.setVisible(true);
	
}

}

public int whenCanIBuy(String itemname, double  price) {
	int months = 0;
	double amountLeft = price - eWallet.totalSavings();
	months = (int) (amountLeft / eWallet.totalIncome());
	return months;
}

private class WhenBuyListener implements ActionListener  {

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (panel_1.isVisible() == false) {
			panel_1.setVisible(true);
		}
		else {
			panel_1.setVisible(false);
		}
//		System.out.println(whenCanIBuy("thing", 1000)); // 
//		WhenBuyGUI buyFrame = new WhenBuyGUI();
//		buyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		buyFrame.pack();
//		buyFrame.setVisible(true);
		
	}
}

private class AddIncomeButtonListener implements ActionListener  {

@Override
public void actionPerformed(ActionEvent e) {
	String type = incomeTypeBox.getText();
	double amount = Double.parseDouble(incomeAmountBox.getText());
	int month = Integer.parseInt(incomeMonthBox.getText());
	Income inc = new Income(type, amount, month - 1);
	arrList2.add(inc);
	//System.out.println(inc);
	eWallet.addIncome(inc, month - 1);
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
	/*String type = incomeTypeBox.getText();
	double amount = Double.parseDouble(savingAmountBox.getText());
	int month = Integer.parseInt(savingMonthBox.getText());
	Income inc = new Savings(type, amount, month);
	System.out.println(inc);
	eWallet.addSaving(inc, month);
	JLabel savingTypeBox;
	savingTypeBox.setText("");
	savingAmountBox.setText("");
	savingMonthBox.setText("");
	saving.setVisible(false);*/
	
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
	Expense ex = new Expense(type, amount, month - 1);
	arrList.add(ex);
	//System.out.println(ex);
	eWallet.addExpense(ex, month -1);
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
private class PrintSavingsReportListener implements ActionListener  {

@Override
public void actionPerformed(ActionEvent e) {
	String report = eWallet.printSavings();
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
private class PrintOverallReportListener implements ActionListener  {

@Override
public void actionPerformed(ActionEvent e) {
	String report = eWallet.printAll();
	JOptionPane.showMessageDialog(null, report);
	
}

}

@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == CanadianDollarButton) {
			String amount = currentBalance.getText();
			Integer.parseInt(amount);
			int Dollar = Integer.parseInt(amount);
			double canadianDollar = Dollar * 1.29;
			String convertedAmount = String.format("%.2f", canadianDollar);
			currentBalance.setText(convertedAmount);

		}
		if (e.getSource() == AustralianDollarButton) { 
			String amount = currentBalance.getText();
			Integer.parseInt(amount);
			int Dollar = Integer.parseInt(amount);
			double australianDollar = Dollar * 1.44;
			String convertedAmount = String.format("%.2f", australianDollar);
			currentBalance.setText(convertedAmount);

		}
		if (e.getSource() == PoundSterlingButton) { 
			String amount = currentBalance.getText();
			Integer.parseInt(amount);
			int Dollar = Integer.parseInt(amount);
			double poundSterling = Dollar * 0.83;
			String convertedAmount = String.format("%.2f", poundSterling);
			currentBalance.setText(convertedAmount);

		}
		if (e.getSource() == CanadianDollarButton) { 
			String amount = currentBalance.getText();
			Integer.parseInt(amount);
			int Dollar = Integer.parseInt(amount);
			double canadianDollar = Dollar * 1.29;
			String convertedAmount = String.format("%.2f", canadianDollar);
			currentBalance.setText(convertedAmount);

		}
		if (e.getSource() == EuroButton) { 
			String amount = currentBalance.getText();
			Integer.parseInt(amount);
			int Dollar = Integer.parseInt(amount);
			double Euro = Dollar * 0.98;
			String convertedAmount = String.format("%.2f", Euro);
			currentBalance.setText(convertedAmount);

		}
		if (e.getSource() == YenButton) { 
			String amount = currentBalance.getText();
			Integer.parseInt(amount);
			int Dollar = Integer.parseInt(amount);
			double Yen = Dollar * 1.29;
			String convertedAmount = String.format("%.2f", Yen);
			currentBalance.setText(convertedAmount);

		}
		
	}

private class UploadExpensesListener implements ActionListener  {

@Override
public void actionPerformed(ActionEvent e) {
	
	  GuiFile myFrame = new GuiFile();

      myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
      
	
	}

}

private class ExportExpensesListener implements ActionListener {

@Override
public void actionPerformed(ActionEvent e) {
	
	GuiFile gui = new GuiFile();
	
	//Expense [] bloop = gui.getExpenseArr();
	
	String fileName = JOptionPane.showInputDialog(null,"Enter Name for File: ");
	
	ArrayList<Expense> list = GuiFile.getExpenseList();
	
	try {
		
		File exportFile = new File(fileName + ".txt");
		
		if (exportFile.createNewFile()) {
			
			BufferedWriter myWriter = new BufferedWriter(new FileWriter(exportFile));
			
			//GuiFile gui = new GuiFile();
			
			//System.out.println("here");
			
			for(int j = 0; j < arrList.size(); j++) {
				
				myWriter.write(arrList.get(j).getType() + ":"+ arrList.get(j).getAmount() + ":" + (arrList.get(j).getMonth() +1) + "\n");

			}
			
			for(int i = 0; i < list.size(); i++) {
				
			myWriter.write(list.get(i).getType() + ":"+ list.get(i).getAmount() + ":" + (list.get(i).getMonth() +1) + "\n");
			
			myWriter.flush();
			
			}
			myWriter.close();

		}
			else {
				System.out.println("File already exists.");
			}
}
	catch (IOException except) {
		System.out.println("Error");
	}
	
	//System.out.println(list);
	
	//for(int i = 0; i < bloop.length; i++) {
	//System.out.println(bloop[i]);
	
	//	}
	
	
	
	
	
	}
}

private class UploadIncomeListener implements ActionListener  {

@Override
public void actionPerformed(ActionEvent e) {
	
	  GuiFileIncome myFrame = new GuiFileIncome();

      myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
      
	
	}

}

private class ExportIncomeListener implements ActionListener {

@Override
public void actionPerformed(ActionEvent e) {
	
	//GuiFile gui = new GuiFile();
	
	//Expense [] bloop = gui.getExpenseArr();
	
	String fileName = JOptionPane.showInputDialog(null,"Enter Name for File: ");
	
	ArrayList<Income> list = GuiFileIncome.getIncomeList();
	
	try {
		
		File exportFile = new File(fileName + ".txt");
		
		if (exportFile.createNewFile()) {
			
			BufferedWriter myWriter = new BufferedWriter(new FileWriter(exportFile));
			
			//GuiFile gui = new GuiFile();
			
			//System.out.println("here");
			
			for(int j = 0; j < arrList2.size(); j++) {
				
				myWriter.write(arrList2.get(j).getType() + ":"+ arrList2.get(j).getAmount() + ":" + (arrList2.get(j).getMonth() +1) + "\n");

			}
			
			for(int i = 0; i < list.size(); i++) {
				
			myWriter.write(list.get(i).getType() + ":"+ list.get(i).getAmount() + ":" + (list.get(i).getMonth() +1) + "\n");
			
			myWriter.flush();
			
			}
			myWriter.close();

		}
			else {
				System.out.println("File already exists.");
			}
}
	catch (IOException except) {
		System.out.println("Error");
	}
	
	//System.out.println(list);
	
	//for(int i = 0; i < bloop.length; i++) {
	//System.out.println(bloop[i]);
	
	//	}
	
	
	
	
	
	}
}

}







