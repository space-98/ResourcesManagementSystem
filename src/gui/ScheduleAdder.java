 package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import listeners.ScheduleAdderCancelListener;
import listeners.ScheduleAdderListener;
import manager.ResourcesManager;

public class ScheduleAdder extends JPanel {

	WindowFrame frame;
	ResourcesManager resourcesManager;

	public ScheduleAdder(WindowFrame frame, ResourcesManager resourcesManager) {		
		this.frame = frame;
		this.resourcesManager = resourcesManager;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField filedDate = new JTextField(10);
		labelDate.setLabelFor(filedDate);
		panel.add(labelDate);
		panel.add(filedDate);

		JLabel labelMemo = new JLabel("Memo: ", JLabel.TRAILING);
		JTextField filedMemo = new JTextField(10);
		labelDate.setLabelFor(filedMemo);

		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new ScheduleAdderListener(filedDate, filedMemo, resourcesManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new ScheduleAdderCancelListener(frame));
		panel.add(labelMemo);
		panel.add(filedMemo);

		panel.add(saveButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);

		this.add(panel);
	}
}
