 public class Schedule {
	//�ʵ带 ����
	float schedule;
	float date;
	String memo1;	
	
	//�⺻ ������ �����
	public Schedule() {
	}
	
	public Schedule(float schedule) {
		this.schedule = schedule;
	}
	
	//������ �����
	public Schedule(float schedule, float date, String memo1) {
		this.schedule = schedule;
		this.date = date;
		this.memo1 = memo1;	
	}
	
	public void printInfo() {
		System.out.println("date: " + date + "\n" + "memo1: " + memo1);
		System.out.println();
	}
}