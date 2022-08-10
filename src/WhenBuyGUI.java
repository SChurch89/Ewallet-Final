import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import MainMenu.AddExpenseListener;

import java.awt.Font;
import javax.swing.DropMode;
import java.awt.Color;

public class WhenBuyGUI extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1171802884208683813L;
	private JFrame whenBuyFrame;
	private JTextField txtbike;
	private JTextField textField_1;
	private JTextField txtYouStillNeed;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblItemPrice;
	private JTextField txtYoullHaveEnough;
	private JTextField svings;
	private JTextField incm;
	private JLabel lblSavings;
	private JLabel lblIncome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WhenBuyGUI window = new WhenBuyGUI();
					window.whenBuyFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WhenBuyGUI() {
		setResizable(false);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{48, 85, 0, 0, 150, 68, 0};
		gridBagLayout.rowHeights = new int[]{36, 0, 0, 0, 0, 0, 0, 32, 27, 34, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel("Item Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		txtbike = new JTextField();
		txtbike.setForeground(Color.BLACK);
		GridBagConstraints gbc_txtbike = new GridBagConstraints();
		gbc_txtbike.insets = new Insets(0, 0, 5, 5);
		gbc_txtbike.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtbike.gridx = 3;
		gbc_txtbike.gridy = 1;
		getContentPane().add(txtbike, gbc_txtbike);
		txtbike.setColumns(10);
		
		lblItemPrice = new JLabel("Item Price:");
		lblItemPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblItemPrice = new GridBagConstraints();
		gbc_lblItemPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblItemPrice.anchor = GridBagConstraints.EAST;
		gbc_lblItemPrice.gridx = 2;
		gbc_lblItemPrice.gridy = 2;
		getContentPane().add(lblItemPrice, gbc_lblItemPrice);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 2;
		getContentPane().add(textField_1, gbc_textField_1);
		
		lblSavings = new JLabel("Savings:");
		lblSavings.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblSavings = new GridBagConstraints();
		gbc_lblSavings.insets = new Insets(0, 0, 5, 5);
		gbc_lblSavings.anchor = GridBagConstraints.EAST;
		gbc_lblSavings.gridx = 2;
		gbc_lblSavings.gridy = 3;
		getContentPane().add(lblSavings, gbc_lblSavings);
		
		svings = new JTextField();
		svings.setColumns(10);
		GridBagConstraints gbc_svings = new GridBagConstraints();
		gbc_svings.insets = new Insets(0, 0, 5, 5);
		gbc_svings.fill = GridBagConstraints.HORIZONTAL;
		gbc_svings.gridx = 3;
		gbc_svings.gridy = 3;
		getContentPane().add(svings, gbc_svings);
		
		lblIncome = new JLabel("Income:");
		lblIncome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblIncome = new GridBagConstraints();
		gbc_lblIncome.insets = new Insets(0, 0, 5, 5);
		gbc_lblIncome.anchor = GridBagConstraints.EAST;
		gbc_lblIncome.gridx = 2;
		gbc_lblIncome.gridy = 4;
		getContentPane().add(lblIncome, gbc_lblIncome);
		
		incm = new JTextField();
		incm.setColumns(10);
		GridBagConstraints gbc_incm = new GridBagConstraints();
		gbc_incm.insets = new Insets(0, 0, 5, 5);
		gbc_incm.fill = GridBagConstraints.HORIZONTAL;
		gbc_incm.gridx = 3;
		gbc_incm.gridy = 4;
		getContentPane().add(incm, gbc_incm);
		
		btnNewButton = new JButton("When Can I Buy?");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 6;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		txtYouStillNeed = new JTextField();
		txtYouStillNeed.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtYouStillNeed.setDropMode(DropMode.INSERT);
		txtYouStillNeed.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtYouStillNeed.setHorizontalAlignment(SwingConstants.CENTER);
		txtYouStillNeed.setEditable(false);
		txtYouStillNeed.setColumns(10);
		GridBagConstraints gbc_txtYouStillNeed = new GridBagConstraints();
		gbc_txtYouStillNeed.insets = new Insets(0, 0, 5, 0);
		gbc_txtYouStillNeed.gridwidth = 9;
		gbc_txtYouStillNeed.fill = GridBagConstraints.BOTH;
		gbc_txtYouStillNeed.gridx = 0;
		gbc_txtYouStillNeed.gridy = 7;
		getContentPane().add(txtYouStillNeed, gbc_txtYouStillNeed);
		
		txtYoullHaveEnough = new JTextField();
		txtYoullHaveEnough.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtYoullHaveEnough.setHorizontalAlignment(SwingConstants.CENTER);
		txtYoullHaveEnough.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtYoullHaveEnough.setEditable(false);
		txtYoullHaveEnough.setDropMode(DropMode.INSERT);
		txtYoullHaveEnough.setColumns(10);
		GridBagConstraints gbc_txtYoullHaveEnough = new GridBagConstraints();
		gbc_txtYoullHaveEnough.insets = new Insets(0, 0, 5, 5);
		gbc_txtYoullHaveEnough.gridwidth = 6;
		gbc_txtYoullHaveEnough.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtYoullHaveEnough.gridx = 0;
		gbc_txtYoullHaveEnough.gridy = 8;
		getContentPane().add(txtYoullHaveEnough, gbc_txtYoullHaveEnough);
		
		class buttonListener implements ActionListener  {

			@Override
			public void actionPerformed(ActionEvent e) {
				double savings = Double.parseDouble(svings.getText());
				double income = Double.parseDouble(incm.getText());
				double amount = Double.parseDouble(textField_1.getText());
				
				String name = txtbike.getText();
				
				double months = (amount - savings) / income;
				
				ThingICanBuy thing = new ThingICanBuy(name, amount, amount - savings, (int) months);
				
				txtYouStillNeed.setText("You still need $" + thing.getPayment() + " to afford " + thing.getName() + ".");
				txtYoullHaveEnough.setText("You'll have enough in " + thing.getLength() + " months.");
			}
		}
			
		btnNewButton.addActionListener(new buttonListener());
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		whenBuyFrame = new JFrame();
		whenBuyFrame.setTitle("When Can I Buy?");
		whenBuyFrame.setBounds(100, 100, 526, 380);
		whenBuyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



}
