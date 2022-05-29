package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {

	public MenuSelection() {
		//frame 크기 설정
		this.setSize(300, 300);
		//frame을 닫았을 때 메모리에서 제거되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panel1, panel2, label 객체 생성
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		//button1~8 객체 생성
		JButton button1 = new JButton("Add Schedule");
		JButton button2 = new JButton("Delete Schedule");
		JButton button3 = new JButton("Edit Schedule");
		JButton button4 = new JButton("View Schedules");
		JButton button5 = new JButton("Get Money");
		JButton button6 = new JButton("Spend Money");
		JButton button7 = new JButton("The Money Lefts");
		JButton button8 = new JButton("Go Out");
		
		//panel1에 label 추가
		panel1.add(label);
		
		//panel2에 button1~8 추가
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		panel2.add(button8);
		
		//frame의 북쪽에 panel1, 중앙에 panel2 추가
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		//frame이 보이도록 설정
		this.setVisible(true);
	}
}