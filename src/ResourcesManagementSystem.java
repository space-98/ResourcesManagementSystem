import java.util.Scanner;

public class ResourcesManagementSystem {

	public static void main(String[] args) {
		float num = 0; 
		Scanner in;
		in = new Scanner(System.in);
		Scanner input;
		input = new Scanner(System.in);

		while (num != 9) {

			System.out.println("1. Add Schedule");
			System.out.println("2. Delete Schedule");
			System.out.println("3. Edit Schedule");
			System.out.println("4. View Schedule");
			System.out.println("5. Get Money");
			System.out.println("6. Spend Money");
			System.out.println("7. The Money Left");			
			System.out.println("8. Show a menu");
			System.out.println("9. Go Out");
			System.out.print("Select one number: ");
			num = in.nextFloat();
			if (num == 1) {
				System.out.print("Date(ex: 3.17): ");
				float date = in.nextFloat();
				System.out.print("Memo: ");
				String memo1 = input.nextLine(); 

			}
			if (num == 2) {
				//Delete Schedule
			}

			if (num == 3) {
				//Edit Schedule
			}

			if (num == 4) {
				//View Schedule
			}

			if (num == 5) {
				System.out.print("Add money: ");
				float addMoney = in.nextFloat();
				System.out.print("Memo: ");
				String sentance5 = input.nextLine();

			}

			if (num == 6) {
				System.out.print("Spend money: ");
				float spendMoney = in.nextFloat();
				System.out.print("Memo: ");
				String sentance5 = input.nextLine();
			}
			if (num == 7) {
				//The Money Left
			}
			if (num == 8) {
				//Show a menu
			}

		}
		in.close();
		input.close();
	}
}
