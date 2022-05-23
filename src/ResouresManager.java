import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import schedule.GeneralSchedule;
import schedule.ScheduleInput;
import schedule.ScheduleKind;
import schedule.SchoolSchedule;
import schedule.SpecialSchedule;

public class ResouresManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1704917188620068124L;
	ArrayList<ScheduleInput> schedules = new ArrayList<ScheduleInput>();
	Money money;
	//transient = Scanner를 저장하고 싶지 않다는 것을 의미
	transient Scanner in;
	ResouresManager(Scanner in) 
	{
		this.in = in;
	}

	public void addSchedule() 
	{
		int kind = 0;
		ScheduleInput scheduleInput;
		while(kind != 1 && kind != 2) {
			try {
				System.out.println("1. GeneralSchedule");
				System.out.println("2. SpecialSchedule");
				System.out.println("3. SchoolSchedule");
				System.out.print("Select num for Schedule Kind 1 or 2 or 3: ");
				kind = in.nextInt();
				if (kind == 1) {
					scheduleInput = new GeneralSchedule(ScheduleKind.GeneralSchedule);
					scheduleInput.getUserInput(in);
					schedules.add(scheduleInput);
					break;
				}
				else if (kind == 2) {
					scheduleInput = new SpecialSchedule(ScheduleKind.SpecialSchedule);
					scheduleInput.getUserInput(in);
					schedules.add(scheduleInput);
					break;
				}
				else if (kind == 3) {
					scheduleInput = new SchoolSchedule(ScheduleKind.SchoolSchedule);
					scheduleInput.getUserInput(in);
					schedules.add(scheduleInput);
					break;
				}
				else {
					System.out.print("Select num for Schedule Kind 1 or 2 or 3: "); 
				}
			} catch (InputMismatchException e){
				System.out.println("Please put an integer between 1 and 3!");

				if(in.hasNext()) {
					in.next();
				}
				kind = -1;
			}
		}
	}

	public void deleteSchedule() 
	{
		try {
			System.out.print("Date(ex: 3.17): ");
			float scheduleDate = in.nextFloat();
			int index = -1; 
			for (int i = 0; i<schedules.size(); i++) {
				if (schedules.get(i).getDate() == scheduleDate) 
				{
					index = i;
					break;
				}

			}
			if (index >= 0) {
				schedules.remove(index);
				System.out.println("the schedule " + scheduleDate + " is deleted");
			}
			else {
				System.out.println("the schedule has not been registered");
				System.out.println();
				return;
			}
		}catch (InputMismatchException e){
			System.out.println("Please put an realNumber!");

			if(in.hasNext()) {
				in.next();
			}
		}
	}


	public void editSchedule() 
	{
		System.out.print("Date(ex: 3.17): ");
		float scheduleDate = in.nextFloat();
		for (int i = 0; i<schedules.size(); i++) {
			ScheduleInput scheduleInput = schedules.get(i);
			if (scheduleInput.getDate() == scheduleDate) {
				float num = -1;
				while (num != 3) {
					System.out.println("1. Edit Date");
					System.out.println("2. Edit Memo");		
					System.out.println("3. Go Out");
					System.out.print("Select one number between 1 - 3: ");
					num = in.nextFloat();
					if (num == 1) {
						System.out.print("Date: ");
						float date = in.nextFloat();
						scheduleInput.setDate(date);
					}
					else if (num == 2) {
						System.out.print("memo: ");
						String memo1 = in.nextLine();
						scheduleInput.setMemo1(memo1);
						String b1 = in.next();

					}
					else {
						continue;
					}
				}
				break;
			} 
		} 
	}

	public void viewSchedules() 
	{
		for (int i = 0; i<schedules.size(); i++) {
			schedules.get(i).printInfo();
		}

	}

	public void getMoney() 
	{
		try {
			money = new Money();
			System.out.print("Add money: ");
			money.addMoney = in.nextFloat();
			in.nextLine();
			System.out.print("Memo: ");
			money.memo5 = in.nextLine();
			System.out.println();
		}catch (InputMismatchException e){
			System.out.println("Please put an realNumber!");

			if(in.hasNext()) {
				in.next();
			}
		}
	}

	public void spendMoney() 
	{
		try {
			System.out.print("Spend money: ");
			money.spendMoney = in.nextFloat();
			in.nextLine();
			System.out.print("Memo: ");
			money.memo6 = in.nextLine();
			System.out.println();
		}catch (InputMismatchException e){
			System.out.println("Please put an realNumber!");

			if(in.hasNext()) {
				in.next();
			}
		}
	}

	public void theMoneyLeft() 
	{
		money.printInfo();
		System.out.println();
	}
} 

