package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JTextField;
import manager.ResourcesManager;
import schedule.GeneralSchedule;
import schedule.ScheduleInput;
import schedule.ScheduleKind;

public class ScheduleAdderListener implements ActionListener {

	JTextField filedDate;
	JTextField filedMemo;

	ResourcesManager resourcesManager;

	public ScheduleAdderListener(
			JTextField filedDate, 
			JTextField filedMemo, 
			ResourcesManager resourcesManager) {

		this.filedDate = filedDate;
		this.filedMemo = filedMemo;
		this.resourcesManager = resourcesManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		ScheduleInput schedule = new GeneralSchedule(ScheduleKind.GeneralSchedule);

		schedule.setDate(Float.parseFloat(filedDate.getText()));
		schedule.setMemo1(filedMemo.getText());
		resourcesManager.addSchedule(schedule);
		putObject(resourcesManager, "resourcesManager.ser");
		schedule.printInfo();

	}

	public static void putObject(ResourcesManager resouresManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(resouresManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
