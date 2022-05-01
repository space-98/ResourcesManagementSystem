import java.util.ArrayList;

import java.util.Scanner;

public class ResouresManager {
	ArrayList<Schedule> schedules = new ArrayList<Schedule>();
	Money money;
	Scanner in;
	ResouresManager(Scanner in) 
	{
		this.in = in;
	}

	public void addSchedule() 
	{
		int kind = 0;
		Schedule schedule;
		while(kind != 1 && kind != 2) {
			System.out.println("1. GeneralSchedule");
			System.out.println("2. SpecialSchedule");
			System.out.println("3. SchoolSchedule");
			System.out.print("Select num for Schedule Kind 1 or 2 or 3: ");
			kind = in.nextInt();
			if (kind == 1) {
				schedule = new GeneralSchedule(ScheduleKind.GeneralSchedule);
				schedule.getUserInput(in);
				schedules.add(schedule);
				break;
			}
			else if (kind == 2) {
				schedule = new SpecialSchedule(ScheduleKind.SpecialSchedule);
				schedule.getUserInput(in);
				schedules.add(schedule);
				break;
			}
			else if (kind == 3) {
				schedule = new SchoolSchedule(ScheduleKind.SchoolSchedule);
				schedule.getUserInput(in);
				schedules.add(schedule);
				break;
			}
			else {
				System.out.print("Select num for Schedule Kind 1 or 2 or 3: "); 
			}
		}
	}

	public void deleteSchedule() 
	{
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
			System.out.println("the schedule" + scheduleDate + "is deleted");
		}
		else {
			System.out.println("the schedule has not been registered");
			System.out.println();
			return;
		}
	}

	public void editSchedule() 
	{
		System.out.print("Date(ex: 3.17): ");
		float scheduleDate = in.nextFloat();
		for (int i = 0; i<schedules.size(); i++) {
			Schedule schedule = schedules.get(i);
			if (schedule.getDate() == scheduleDate) {
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
						schedule.setDate(date);
					}
					else if (num == 2) {
						System.out.print("memo: ");
						String memo1 = in.nextLine();
						//String memo1 = in.next();
						schedule.setMemo1(memo1);

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
		money = new Money();
		System.out.print("Add money: ");
		money.addMoney = in.nextFloat();
		in.nextLine();
		System.out.print("Memo: ");
		money.memo5 = in.nextLine();
		System.out.println();

	}

	public void spendMoney() 
	{
		System.out.print("Spend money: ");
		money.spendMoney = in.nextFloat();
		in.nextLine();
		System.out.print("Memo: ");
		money.memo6 = in.nextLine();
		System.out.println();

	}

	public void theMoneyLeft() 
	{
		money.printInfo();
		System.out.println();
	}

}

