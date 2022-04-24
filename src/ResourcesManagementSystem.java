import java.util.Scanner;

public class ResourcesManagementSystem {
	public static void main(String[] args) {
		Scanner in;
		in = new Scanner(System.in);
		ResouresManager resourcesManager = new ResouresManager(in);
		
		float num = 0; 
		while (num != 8) {
			System.out.println("1. Add Schedule");
			System.out.println("2. Delete Schedule");
			System.out.println("3. Edit Schedule");
			System.out.println("4. View Schedules");
			System.out.println("5. Get Money");
			System.out.println("6. Spend Money");
			System.out.println("7. The Money Lefts");			
			System.out.println("8. Go Out");
			System.out.print("Select one number between 1 - 8: ");
			num = in.nextFloat();
			if (num == 1) {
				resourcesManager.addSchedule();
			}
			else if (num == 2) {
				resourcesManager.deleteSchedule();
			}

			else if (num == 3) {
				resourcesManager.editSchedule();
			}

			else if (num == 4) {
				resourcesManager.viewSchedules();
			}

			else if (num == 5) {
				resourcesManager.getMoney();		
			}

			else if (num == 6) {
				resourcesManager.spendMoney();
			}
			else if (num == 7) {
				resourcesManager.theMoneyLeft();
			}
			else {
				continue;
			}
		}
	}


}