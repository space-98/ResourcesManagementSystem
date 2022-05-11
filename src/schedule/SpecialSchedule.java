package schedule;
import java.util.Scanner;

public class SpecialSchedule extends Schedule implements ScheduleInput {
	
	public SpecialSchedule(ScheduleKind kind) {
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
	
	public void printInfo() {
		switch(this.kind) {
		case GeneralSchedule:
			skind = "GeneralSchedule.";
			break;
		case SpecialSchedule:
			skind = "SpecialSchedule.";
			break;
		case SchoolSchedule:
			skind = "SchoolSchedule.";
			break;
			default:
		}
		
		System.out.println("kind: " + skind + "date: " + date + "\n" + "memo1: " + memo1);
		System.out.println();
	}
}
