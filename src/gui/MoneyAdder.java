package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MoneyAdder extends JPanel {
	
	WindowFrame frame;
	
	public MoneyAdder(WindowFrame frame) {		
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		//AddMoney�� �Է¹޴� �κ� ����
		JLabel labelAddMoney = new JLabel("AddMoney: ", JLabel.TRAILING);
		JTextField filedAddMoney = new JTextField(10);
		labelAddMoney.setLabelFor(filedAddMoney);
		panel.add(labelAddMoney);
		panel.add(filedAddMoney);
		
		//AddMoneyMemo�� �Է¹޴� �κ� ����
		JLabel labelAddMoneyMemo = new JLabel("AddMoneyMemo: ", JLabel.TRAILING);
		JTextField filedAddMoneyMemo = new JTextField(10);
		labelAddMoneyMemo.setLabelFor(filedAddMoneyMemo);
		panel.add(labelAddMoneyMemo);
		panel.add(filedAddMoneyMemo);
		
		//SpendMoney�� �Է¹޴� �κ� ����
		JLabel labelSpendMoney = new JLabel("SpendMoney: ", JLabel.TRAILING);
		JTextField filedSpendMoney = new JTextField(10);
		labelSpendMoney.setLabelFor(filedSpendMoney);
		panel.add(labelSpendMoney);
		panel.add(filedSpendMoney);
		
		//SpendMoneyMemo�� �Է¹޴� �κ� ����
		JLabel labelSpendMoneyMemo = new JLabel("SpendMoneyMemo: ", JLabel.TRAILING);
		JTextField filedSpendMoneyMemo = new JTextField(10);
		labelSpendMoneyMemo.setLabelFor(filedSpendMoneyMemo);
		panel.add(labelSpendMoneyMemo);
		panel.add(filedSpendMoneyMemo);
		
		//panel�� save�� cancel ��ư �߰�
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		//5�� 2������ frame�� ����
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		
	}
}
