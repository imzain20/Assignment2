import java.util.Scanner;

public class Customer {
	private String name;
	private String gender;
	private String address;
	private String passport_num;
	private String plane_type;
	private String origin;
	private String destination;
	private int age;
	
	
	public Customer() {
		
	}
	public Customer(String name, String gender, String address, String passport_num, String plane_type, String origin, String destination, int age)
	{
			
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.passport_num=passport_num;
		this.plane_type=plane_type;
		this.destination=destination;
		this.origin=origin;
		this.age=age;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setGender(String gender) {
		this.address=gender;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public void setPassportNum(String pass_num) {
		this.passport_num=pass_num;
	}
	
	public void setPlaneType(String plane_type) {
		this.plane_type=plane_type;
	}
	
	public void setOrigin(String origin) {
		this.origin=origin;
	}
	
	public void setDestination(String destination) {
		this.destination=destination;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPassNum() {
		return this.passport_num;
	}
	
	public String getPlaneType() {
		return this.plane_type;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public String getOrigin() {
		return this.origin;
	}
	
	
	public int getAge() {
		return this.age;
	}
	
}


