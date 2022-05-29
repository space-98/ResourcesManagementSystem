package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LeftMoneyViewer extends JFrame {
	
	public LeftMoneyViewer() {
		//model ��ü ����
		DefaultTableModel model = new DefaultTableModel();
		
		//�Է¹��� ������ �׸� ����
		model.addColumn("AddMoney");
		model.addColumn("AddMoneyMemo");
		model.addColumn("SpendMoney");
		model.addColumn("SpendMoneyMemo");
		model.addColumn("LeftMoney");
		
		//table, sp ��ü ����
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		//frame�� sp �߰�
		this.add(sp);		
		//frame ũ�� ����
		this.setSize(1000, 300);
		//frame�� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame�� ���̵��� ����
		this.setVisible(true);
	}
}