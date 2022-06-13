package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.ResourcesManager;

public class WindowFrame extends JFrame{
	
	ResourcesManager resourcesManager;
	MenuSelection menuselection;
	ScheduleAdder scheduleAdder;
	ScheduleViewer scheduleViewer;
	
	
	public WindowFrame(ResourcesManager resourcesManager) {		
		this.resourcesManager = resourcesManager;
		this.menuselection = new MenuSelection(this);
		this.scheduleAdder = new ScheduleAdder(this, this.resourcesManager);
		this.scheduleViewer = new ScheduleViewer(this, this.resourcesManager);
		
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupPanel(menuselection);
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
		
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ScheduleAdder getScheduleAdder() {
		return scheduleAdder;
	}

	public void setScheduleAdder(ScheduleAdder scheduleAdder) {
		this.scheduleAdder = scheduleAdder;
	}

	public ScheduleViewer getScheduleViewer() {
		return scheduleViewer;
	}

	public void setScheduleViewer(ScheduleViewer scheduleViewer) {
		this.scheduleViewer = scheduleViewer;
	}
}
