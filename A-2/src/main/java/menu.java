//our main

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class menu extends FRS {
	public menu(String name, String gender, String address, String passport_num, String plane_type, String origin, String destination,
			int age, int fare) throws AgeException {
		super(name, gender, address, passport_num, plane_type, origin, destination, age, fare);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		System.out.println("WELCOME TO ZEX RESERVATION SYSTEM\n\n");
		System.out.println("Please select any option: \n");
		System.out.println("1-Book a Flight.\n");
		
		Scanner input = new Scanner(System.in);
		int choice=input.nextInt();
		int age1=0;
		
		switch (choice)
		{
		case 1:
			System.out.println("\nPlease enter the following details\n");
			System.out.println("\nYour Age ");  //need to put custom exception here
			try {
			int age=input.nextInt();
			if(age<0)
			{
				throw new AgeException("Age cannot be in negative value");
			} 
			}
			catch (AgeException e) {
				System.out.println(e.getMessage());
				System.out.println("\nYour Age ");
				int age=input.nextInt();
				age1=age;
			}
			} 
			System.out.println("\nYour Name: ");
			String name=input.next();
			System.out.println("\nYour Gender: ");
			String gender=input.next();
			System.out.println("\nYour Address: ");
			String address=input.next();
			System.out.println("\nYour Passport Number: ");
			String passportnum=input.next();
			System.out.println("\nYour Plane Type: ");
			String planetype=input.next();
			System.out.println("\nOrigin: ");
			String origin=input.next();
			System.out.println("\nDestination: ");
			String destination=input.next();
			
			
			
			if(origin=="Pakistan" & destination=="China")
			{
				System.out.println("\nThere is a direct route for you in 2 hours. \n ");
				System.out.println("1-25000 ");
				System.out.println("2-40000 ");
				System.out.println("3-60000 ");
				System.out.println("Choose any ticket fare: ");
				int selection=input.nextInt();
				System.out.println("Your Ticket has been booked. Following are your flight details. ");
			}
			else if(origin=="China" & destination=="Pakistan")
			{
				System.out.println("\nThere is a direct route for you in 2 hours. \n ");
				System.out.println("1-25000 ");
				System.out.println("2-40000 ");
				System.out.println("3-60000 ");
				System.out.println("Choose any ticket fare: ");
				int selection=input.nextInt();
				System.out.println("Your Ticket has been booked. Following are your flight details. ");
			}
			
			else if(origin=="Pakistan" & destination=="India")
			{
				System.out.println("\nThere is an indirect route for you in 7 hours. (Pakistan-Dubai-India)\n ");
				System.out.println("1-40000 ");
				System.out.println("2-70000 ");
				System.out.println("3-90000 ");
				System.out.println("Choose any ticket fare: ");
				int selection=input.nextInt();
				System.out.println("Your Ticket has been booked. Following are your flight details. ");
			}
			
			else if(origin=="India" & destination=="Pakistan")
			{
				System.out.println("\nThere is a direct route for you in 4 hours. \n ");
				System.out.println("1-40000 ");
				System.out.println("2-70000 ");
				System.out.println("3-90000 ");
				System.out.println("Choose any ticket fare: ");
				int selection=input.nextInt();
				System.out.println("Your Ticket has been booked. Following are your flight details. ");
			}
			
			else if(origin=="Pakistan" & destination=="Iran")
			{
				System.out.println("\nThere is a direct route for you in 8 hours. \n ");
				System.out.println("1-15000 ");
				System.out.println("2-70000 ");
				System.out.println("3-120000 ");
				System.out.println("Choose any ticket fare: ");
				int selection=input.nextInt();
				System.out.println("Your Ticket has been booked. Following are your flight details. ");
			}
			
			
			FRS f1=new FRS();
				try {
					f1 = new FRS(name,gender,address,passportnum,planetype,origin,destination,age1,500);
				} catch (AgeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			f1.setBookingCode();
			System.out.println(f1.getAddress());
			System.out.println(f1.getName());
			System.out.println(f1.getGender());
			System.out.println(f1.getBookingCode());
			System.out.println(f1.getAge());
			
		      File file = new File("newFile.txt");
		      try {
		    	FileWriter myWriter = new FileWriter("newFile.txt");
		        myWriter.write(f1.getName());
		        myWriter.write(f1.getAddress());
		        myWriter.write(f1.getBookingCode());
		        myWriter.close();
		        System.out.println("\nSuccessfully wrote to the file.");
		        boolean createFile = file.createNewFile();
		        if (createFile) {
		          System.out.println("New File created");
		        }else {
		          System.out.println("This File already exists");
		        }
		      } catch (IOException e) {
		        e.printStackTrace();
		      }
			
			
		}
		

    	
		
	}


