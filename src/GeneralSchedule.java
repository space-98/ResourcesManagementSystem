import java.util.Scanner;

public class GeneralSchedule extends Schedule {
	
	public GeneralSchedule(ScheduleKind kind) {
		this.kind = kind;
	}
	
	public void getUserInput(Scanner in) {
		System.out.print("Date(ex: 3.17): ");
		float date = in.nextFloat();
		this.setDate(date);
		in.nextLine();
		System.out.print("Memo: ");
		String memo1 = in.nextLine();
		this.setMemo1(memo1);
		System.out.println();
	}
}
