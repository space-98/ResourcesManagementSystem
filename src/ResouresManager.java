import java.util.Scanner;

public class ResouresManager 
{
	Schedule schedule;
	Money money;
	Scanner in;
	ResouresManager(Scanner in) 
	{
		this.in = in;
	}

	public void addSchedule() 
	{
		schedule = new Schedule();
		System.out.print("Date(ex: 3.17): ");
		schedule.date = in.nextFloat();
		in.nextLine();
		System.out.print("Memo: ");
		schedule.memo1 = in.nextLine();
		System.out.println();
	}
	
	public void deleteSchedule() 
	{
		System.out.print("Date(ex: 3.17): ");
		float date = in.nextFloat();
		if (schedule == null) 
		{
			System.out.println("the schedule has not been registered");
			System.out.println();
			return;
		}
		if (schedule.date == date) 
		{
			schedule = null;
			System.out.println("the schedule is deleted");
			System.out.println();
		}
	}
	
	public void editSchedule() 
	{
		System.out.print("Date(ex: 3.17): ");
		float date = in.nextFloat();
		if (schedule == null) 
		{
			System.out.println("the schedule has not been registered");
			System.out.println();
			return;
		}
		if (schedule.date == date) 
		{
			System.out.println("the schedule to be edited is " + date);
			System.out.println();
		}		
	}
	
	public void viewSchedule() 
	{
		System.out.print("Date(ex: 3.17): ");
		float date = in.nextFloat();
		if (schedule == null) 
		{
			System.out.println("the schedule has not been registered");
			System.out.println();
			return;
		}
		if (schedule.date == date) 
		{
			schedule.printInfo();
			System.out.println();
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
