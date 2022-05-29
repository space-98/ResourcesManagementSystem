package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MoneyAdder extends JFrame {
	
	public MoneyAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		//AddMoney를 입력받는 부분 생성
		JLabel labelAddMoney = new JLabel("AddMoney: ", JLabel.TRAILING);
		JTextField filedAddMoney = new JTextField(10);
		labelAddMoney.setLabelFor(filedAddMoney);
		panel.add(labelAddMoney);
		panel.add(filedAddMoney);
		
		//AddMoneyMemo를 입력받는 부분 생성
		JLabel labelAddMoneyMemo = new JLabel("AddMoneyMemo: ", JLabel.TRAILING);
		JTextField filedAddMoneyMemo = new JTextField(10);
		labelAddMoneyMemo.setLabelFor(filedAddMoneyMemo);
		panel.add(labelAddMoneyMemo);
		panel.add(filedAddMoneyMemo);
		
		//SpendMoney를 입력받는 부분 생성
		JLabel labelSpendMoney = new JLabel("SpendMoney: ", JLabel.TRAILING);
		JTextField filedSpendMoney = new JTextField(10);
		labelSpendMoney.setLabelFor(filedSpendMoney);
		panel.add(labelSpendMoney);
		panel.add(filedSpendMoney);
		
		//SpendMoneyMemo를 입력받는 부분 생성
		JLabel labelSpendMoneyMemo = new JLabel("SpendMoneyMemo: ", JLabel.TRAILING);
		JTextField filedSpendMoneyMemo = new JTextField(10);
		labelSpendMoneyMemo.setLabelFor(filedSpendMoneyMemo);
		panel.add(labelSpendMoneyMemo);
		panel.add(filedSpendMoneyMemo);
		
		//panel에 save와 cancel 버튼 추가
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		//5열 2행으로 frame을 설정
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		//frame 크기 설정
		this.setSize(300, 300);
		//frame을 닫았을 때 메모리에서 제거되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		
		//frame이 보이도록 설정
		this.setVisible(true);
	}

}
