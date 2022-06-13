package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.ScheduleAdder;
import gui.WindowFrame;

public class ButtonAddListener1 implements ActionListener {

	WindowFrame frame;
	
	public ButtonAddListener1(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		ScheduleAdder adder1 = frame.getScheduleAdder();
		frame.setupPanel(adder1);
	}
}
