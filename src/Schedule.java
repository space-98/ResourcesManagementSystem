 public class Schedule {
	//필드를 만듬
	float schedule;
	float date;
	String memo1;	
	
	//기본 생성자 만들기
	public Schedule() {
	}
	
	public Schedule(float schedule) {
		this.schedule = schedule;
	}
	
	//생성자 만들기
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