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
		
		
		this.add(panel);
	}
}
