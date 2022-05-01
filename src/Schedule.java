import java.util.Scanner;

public class Schedule {
	protected ScheduleKind kind = ScheduleKind.GeneralSchedule;
	protected float schedule;
	protected float date;
	protected String memo1;	
	
	public Schedule() {
	}
	
	//�Ű����� ScheduleKind��(�����) 1���� Schedule �޼���
	public Schedule(ScheduleKind kind) {
		this.kind = kind;
	}
	
	//�Ű����� float�� 1���� Schedule �޼��� 
	public Schedule(float schedule) {
		this.schedule = schedule;
	}
	
	//�Ű����� float�� 2��, String���� 1���� Schedule �޼���
	public Schedule(float schedule, float date, String memo1) {
		this.schedule = schedule;
		this.date = date;
		this.memo1 = memo1;	
	}
	
	//�Ű����� ScheduleKind��(�����) 1��, float�� 2��, String�� 1���� Schedule �޼���
	public Schedule(ScheduleKind kind, float schedule, float date, String memo1) {
		this.kind = kind;
		this.schedule = schedule;
		this.date = date;
		this.memo1 = memo1;	
	}
	
	public ScheduleKind getKind() {
		return kind;
	} 

	public void setKind(ScheduleKind kind) {
		this.kind = kind;
	}

	public float getSchedule() {
		return schedule;
	}

	public void setSchedule(float schedule) {
		this.schedule = schedule;
	}

	public float getDate() {
		return date;
	}

	public void setDate(float date) {
		this.date = date;
	}

	public String getMemo1() {
		return memo1;
	}

	public void setMemo1(String memo1) {
		this.memo1 = memo1;
	}
	
	String skind = "none";
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
		
		System.out.println("kind" + skind + "date: " + date + "\n" + "memo1: " + memo1);
		System.out.println();
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
 