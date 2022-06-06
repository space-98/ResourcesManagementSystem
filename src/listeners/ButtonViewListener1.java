package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.LeftMoneyViewer;
import gui.ScheduleViewer;
import gui.WindowFrame;

public class ButtonViewListener1 implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener1(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		ScheduleViewer viewer1 = frame.getScheduleViewer();
		frame.setupPanel(viewer1);
	}

}
