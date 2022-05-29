package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {

	public MenuSelection() {
		//frame ũ�� ����
		this.setSize(300, 300);
		//frame�� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panel1, panel2, label ��ü ����
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		//button1~8 ��ü ����
		JButton button1 = new JButton("Add Schedule");
		JButton button2 = new JButton("Delete Schedule");
		JButton button3 = new JButton("Edit Schedule");
		JButton button4 = new JButton("View Schedules");
		JButton button5 = new JButton("Get Money");
		JButton button6 = new JButton("Spend Money");
		JButton button7 = new JButton("The Money Lefts");
		JButton button8 = new JButton("Go Out");
		
		//panel1�� label �߰�
		panel1.add(label);
		
		//panel2�� button1~8 �߰�
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		panel2.add(button8);
		
		//frame�� ���ʿ� panel1, �߾ӿ� panel2 �߰�
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		//frame�� ���̵��� ����
		this.setVisible(true);
	}
}