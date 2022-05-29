package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ScheduleAdder extends JFrame {
	
	public ScheduleAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		//Date를 입력받는 부분 생성
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField filedDate = new JTextField(10);
		labelDate.setLabelFor(filedDate);
		panel.add(labelDate);
		panel.add(filedDate);
		
		//Memo를 입력받는 부분 생성
		JLabel labelMemo = new JLabel("Memo: ", JLabel.TRAILING);
		JTextField filedMemo = new JTextField(10);
		labelDate.setLabelFor(filedMemo);
		panel.add(labelMemo);
		panel.add(filedMemo);
		
		//panel에 save와 cancel 버튼 추가
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		//3열 2행으로 frame을 설정
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		//frame 크기 설정
		this.setSize(300, 300);
		//frame을 닫았을 때 메모리에서 제거되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		
		//frame이 보이도록 설정
		this.setVisible(true);
	}

}
