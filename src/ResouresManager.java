import java.util.ArrayList;
import java.util.Scanner;

public class ResouresManager 
{
	//class의 리스트를 생성
	ArrayList<Schedule> schedules = new ArrayList<Schedule>();
	Money money;
	Scanner in;
	ResouresManager(Scanner in) 
	{
		this.in = in;
	}

	public void addSchedule() 
	{
		Schedule schedule = new Schedule();
		System.out.print("Date(ex: 3.17): ");
		schedule.date = in.nextFloat();
		in.nextLine();
		System.out.print("Memo: ");
		schedule.memo1 = in.nextLine();
		System.out.println();
		//목록에 추가
		schedules.add(schedule);
	}

	public void deleteSchedule() 
	{
		System.out.print("Date(ex: 3.17): ");
		float date = in.nextFloat();
		int index = -1; // array에서 인덱스르 못 찾았다
		//schedule 목록 찾기
		//i가 Array schedule를 다 순회할 때까지 i를 증가시킴
		for (int i = 0; i<schedules.size(); i++) {
			if (schedules.get(i).date == date) 
			{
				index = i;
				break;
			}

		}
		if (index >= 0) {
			schedules.remove(index);
			System.out.println("the schedule" + date + "is deleted");
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
		float date = in.nextFloat();
		for (int i = 0; i<schedules.size(); i++) {
			Schedule schedule = schedules.get(i);
			if (schedule.date == date) {
				float num = -1;
				while (num != 3) {
					System.out.println("1. Edit Date");
					System.out.println("2. Edit Memo");		
					System.out.println("3. Go Out");
					System.out.print("Select one number between 1 - 3: ");
					num = in.nextFloat();
					if (num == 1) {
						System.out.print("Date: ");
						schedule.date = in.nextFloat();
					}
					else if (num == 2) {
						System.out.print("memo: ");
						schedule.memo1 = in.nextLine();
						schedule.memo1 = in.next();
					}
					else {
						continue;
					} //if
				} //while
				break;
			} //if

		} //for
	}

	public void viewSchedules() 
	{
		//System.out.print("Date(ex: 3.17): ");
		//float date = in.nextFloat();
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

