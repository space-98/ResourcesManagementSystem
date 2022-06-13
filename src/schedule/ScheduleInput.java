package schedule;

import java.util.Scanner;

public interface ScheduleInput {
	
	public float getDate();
	
	public String getMemo1();
	
	public void setDate(float date);
	
	public void setMemo1(String memo1);
	
	public void getUserInput(Scanner in);
	
	public void printInfo();	
}
