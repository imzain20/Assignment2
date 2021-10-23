
public class DateAndTime {
	private int date;
	private String day;
	private String time;
	
	public DateAndTime()
	{
		
	}
	
	public void  DateAndTime(int Date, String day, String time)
	{
		this.date=date;
		this.day=day;
		this.time=time;
	}
	
	public void setdate(int date) {
		this.date=date;
	}
	
	public void setDay(String day) {
		this.day=day;
	}
	
	public void setTime(String time) {
		this.time=time;
	}
		
		public int getDate() {
			return this.date;
		}
		
		public String getDay() {
			return this.day;
		}
		
		
		public String getTime() {
			return this.time;
		}
		
}
