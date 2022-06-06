package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.LeftMoneyViewer;
import gui.MoneyAdder;
import gui.ScheduleViewer;
import gui.WindowFrame;

public class ButtonAddListener2 implements ActionListener {

	WindowFrame frame;
	
	public ButtonAddListener2(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		MoneyAdder adder2 = frame.getMoneyAdder();
		frame.setupPanel(adder2);
	}

}
