package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ScheduleViewer extends JFrame {
	
	public ScheduleViewer() {
		//model ��ü ����
		DefaultTableModel model = new DefaultTableModel();
		
		//�Է¹��� ������ �׸� ����
		model.addColumn("Date");
		model.addColumn("Memo");
		
		//table, sp ��ü ����
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		this.add(sp);
		//frame ũ�� ����
		this.setSize(300, 300);
		//frame�� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame�� ���̵��� ����
		this.setVisible(true);
	}
}
