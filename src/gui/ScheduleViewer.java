package gui;

import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manager.ResourcesManager;
import schedule.ScheduleInput;

public class ScheduleViewer extends JPanel {

	WindowFrame frame;

	ResourcesManager resourcesManager;

	public ScheduleViewer(WindowFrame frame, ResourcesManager resourcesManager) {
		this.frame = frame;
		this.resourcesManager = resourcesManager;

		System.out.println("***" + resourcesManager.size() + "***");
	}

	public ResourcesManager getResourcesManager() {
		return resourcesManager;
	}

	public void setResourcesManager(ResourcesManager resourcesManager) {
		this.resourcesManager = resourcesManager;
		this.removeAll();

		DefaultTableModel model = new DefaultTableModel();

		model.addColumn("Date");
		model.addColumn("Memo");

		for (int i = 0; i < resourcesManager.size(); i++) {
			Vector row = new Vector();
			ScheduleInput si = resourcesManager.get(i);
			row.add(si.getDate());
			row.add(si.getMemo1());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp); 
		
	}
}
