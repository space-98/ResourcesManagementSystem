package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LeftMoneyViewer extends JPanel {
	
	WindowFrame frame;
	
	public LeftMoneyViewer(WindowFrame frame) {
		this.frame = frame;
		
		//model 按眉 积己
		DefaultTableModel model = new DefaultTableModel();
		
		//涝仿罐阑 沥焊狼 亲格 积己
		model.addColumn("AddMoney");
		model.addColumn("AddMoneyMemo");
		model.addColumn("SpendMoney");
		model.addColumn("SpendMoneyMemo");
		model.addColumn("LeftMoney");
		
		//table, sp 按眉 积己
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}