import java.util.Random;

public class FRS extends Customer{
	private String BookingCode;
	private int fare;
	
	
	public void FRS()
	{
		
	}
	
	public FRS(String name, String gender, String address, String passport_num, String plane_type, String origin, String destination, int age, int fare) throws AgeException
	{
		super(name,gender,address,passport_num,plane_type,origin,destination,age);
		this.BookingCode=BookingCode;
		this.fare=fare;
	}
	
	//setters

	public FRS() {
		// TODO Auto-generated constructor stub
	}

	public void setBookingCode()
	{
		 // create a string of all characters
	    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	    // create random string builder
	    StringBuilder sb = new StringBuilder();

	    // create an object of Random class
	    Random random = new Random();

	    // specify length of random string
	    int length = 6;

	    for(int i = 0; i < length; i++) {

	      // generate random index number
	      int index = random.nextInt(alphabet.length());

	      // get character specified by index
	      // from the string
	      char randomChar = alphabet.charAt(index);
	      // append the character to string builder
	      sb.append(randomChar);
	    }

	    String randomString = sb.toString();
		
		this.BookingCode=randomString;
	}
	
	public void setFare(int fare)
	{
		this.fare=fare;
	}
	
	//getters
	
	public String getBookingCode()
	{
		return this.BookingCode;
	}
	
	public int getFare() 
	{
		return this.fare;
	}
}
