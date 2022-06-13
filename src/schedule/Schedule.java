package schedule;
import java.io.Serializable;

public abstract class Schedule implements ScheduleInput, Serializable {
	private static final long serialVersionUID = -8319281409781224373L;
	protected ScheduleKind kind = ScheduleKind.GeneralSchedule;
	protected float schedule;
	protected float date;
	protected String memo1;	
	
	public Schedule() {
	}
	
	public Schedule(ScheduleKind kind) {
		this.kind = kind;
	}
	
	public Schedule(float schedule) {
		this.schedule = schedule;
	}
	
	public Schedule(float schedule, float date, String memo1) {
		this.schedule = schedule;
		this.date = date;
		this.memo1 = memo1;	
	}
	
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
	public abstract void printInfo();
}
 