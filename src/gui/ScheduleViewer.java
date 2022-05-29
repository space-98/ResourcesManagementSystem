package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ScheduleViewer extends JFrame {
	
	public ScheduleViewer() {
		//model 객체 생성
		DefaultTableModel model = new DefaultTableModel();
		
		//입력받을 정보의 항목 생성
		model.addColumn("Date");
		model.addColumn("Memo");
		
		//table, sp 객체 생성
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		this.add(sp);
		//frame 크기 설정
		this.setSize(300, 300);
		//frame을 닫았을 때 메모리에서 제거되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame이 보이도록 설정
		this.setVisible(true);
	}
}
