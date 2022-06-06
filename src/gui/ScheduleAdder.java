package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ScheduleAdder extends JPanel {
	
	WindowFrame frame;
	
	public ScheduleAdder(WindowFrame frame) {		
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		//Date�� �Է¹޴� �κ� ����
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField filedDate = new JTextField(10);
		labelDate.setLabelFor(filedDate);
		panel.add(labelDate);
		panel.add(filedDate);
		
		//Memo�� �Է¹޴� �κ� ����
		JLabel labelMemo = new JLabel("Memo: ", JLabel.TRAILING);
		JTextField filedMemo = new JTextField(10);
		labelDate.setLabelFor(filedMemo);
		panel.add(labelMemo);
		panel.add(filedMemo);
		
		//panel�� save�� cancel ��ư �߰�
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		//3�� 2������ frame�� ����
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
	}
}
