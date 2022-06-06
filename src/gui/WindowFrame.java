package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.ResourcesManager;

public class WindowFrame extends JFrame{
	
	ResourcesManager resourcesManager;
	
	MenuSelection menuselection;
	ScheduleAdder scheduleAdder;
	ScheduleViewer scheduleViewer;
	MoneyAdder moneyAdder;
	LeftMoneyViewer leftMoneyViewer;
	
	
	public WindowFrame(ResourcesManager resourcesManager) {		
		this.resourcesManager = resourcesManager;
		this.menuselection = new MenuSelection(this);
		this.scheduleAdder = new ScheduleAdder(this);
		this.scheduleViewer = new ScheduleViewer(this, this.resourcesManager);
		this.moneyAdder = new MoneyAdder(this);
		this.leftMoneyViewer = new LeftMoneyViewer(this);
		
		//frame 크기 설정
		this.setSize(600, 300);
		//frame을 닫았을 때 메모리에서 제거되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setupPanel(menuselection);
		
		//frame이 보이도록 설정
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

	public MoneyAdder getMoneyAdder() {
		return moneyAdder;
	}

	public void setMoneyAdder(MoneyAdder moneyAdder) {
		this.moneyAdder = moneyAdder;
	}

	public LeftMoneyViewer getLeftMoneyViewer() {
		return leftMoneyViewer;
	}

	public void setLeftMoneyViewer(LeftMoneyViewer leftMoneyViewer) {
		this.leftMoneyViewer = leftMoneyViewer;
	}
}
