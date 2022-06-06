package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.LeftMoneyViewer;
import gui.ScheduleViewer;
import gui.WindowFrame;

public class ButtonAddListener3 implements ActionListener {

	WindowFrame frame;
	
	public ButtonAddListener3(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		LeftMoneyViewer viewer2 = frame.getLeftMoneyViewer();
		frame.setupPanel(viewer2);
	}

}
