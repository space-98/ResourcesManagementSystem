import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;


public class ResourcesManagementSystem {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner in;
		in = new Scanner(System.in);
		ResouresManager resourcesManager = getObject("resourcesManager.ser");
		if (resourcesManager == null) {
			resourcesManager = new ResouresManager(in);
		} else {
			resourcesManager.in = in;
		}

		selectMenu(in, resourcesManager);
		putObject(resourcesManager, "resourcesManager.ser");
	}

	public static void selectMenu(Scanner in, ResouresManager resourcesManager) {
		float num = 0; 
		while (num != 8) {
			try {
				showMenu();
				num = in.nextFloat();
				if (num == 1) {
					resourcesManager.addSchedule();
					logger.log("add a schedule");
				}
				else if (num == 2) {
					resourcesManager.deleteSchedule();
					logger.log("delete a schedule");
				}

				else if (num == 3) {
					resourcesManager.editSchedule();
					logger.log("edit a schedule");
				}

				else if (num == 4) {
					resourcesManager.viewSchedules();
					logger.log("edit a list of schedule");
				}

				else if (num == 5) {
					resourcesManager.getMoney();
					logger.log("add a money");
				}

				else if (num == 6) {
					resourcesManager.spendMoney();
					logger.log("spend a money");
				}
				else if (num == 7) {
					resourcesManager.theMoneyLeft();
					logger.log("edit a list of money");
				}
				else {
					continue;
				}
			} catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 7!");
				if(in.hasNext()) {
					in.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println("***ResouresManager***");
		System.out.println("1. Add Schedule");
		System.out.println("2. Delete Schedule");
		System.out.println("3. Edit Schedule");
		System.out.println("4. View Schedules");
		System.out.println("5. Get Money");
		System.out.println("6. Spend Money");
		System.out.println("7. The Money Lefts");			
		System.out.println("8. Go Out");
		System.out.print("Select one number between 1 - 8: ");
	}

	public static ResouresManager getObject(String filename) {
		ResouresManager resourcesManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			resourcesManager = (ResouresManager) in.readObject();

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

	public static void putObject(ResouresManager resouresManager, String filename) {
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