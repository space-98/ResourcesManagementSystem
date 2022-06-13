package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import gui.ScheduleViewer;
import gui.WindowFrame;
import manager.ResourcesManager;

public class ButtonViewListener1 implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener1(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ResourcesManager resourcesManager = getObject("resourcesManager.ser");
		ScheduleViewer scheduleViewer = frame.getScheduleViewer();
		scheduleViewer.setResourcesManager(resourcesManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(scheduleViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static ResourcesManager getObject(String filename) {
		ResourcesManager resourcesManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			resourcesManager = (ResourcesManager) in.readObject();

			in.close();
			file.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (FileNotFoundException e) {
			return resourcesManager;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resourcesManager;
		
		}
}
