package addressBook;

import java.util.Scanner;

public class Create {
	String fName;
	String lName;
	String address;
	String city;
	String state;
	int zipCode;
	long phNumber;
	String email;
	
	public void entry() {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name");
		fName=sc.nextLine();
		System.out.println("Last Name");
		lName=sc.nextLine();
		System.out.println("Address");
		address=sc.nextLine();
		System.out.println("City");
		city=sc.nextLine();
		System.out.println("State");
		state=sc.nextLine();
		System.out.println("E-mail");
		email=sc.nextLine();
		System.out.println("Zip Code");
		zipCode=sc.nextInt();
		System.out.println("Phone Number");
		phNumber=sc.nextLong();
		
		sc.close();
	}
	
	public void show() {
		System.out.println("First Name:"+fName );
		System.out.println("Last Name:"+lName );
		System.out.println("Complete Address:"+address );
	    System.out.println("City:"+city );
		System.out.println("State:"+state);
		System.out.println("E-mail Address:"+email );
		System.out.println("Zip Code:"+zipCode );
		System.out.println("Phone Number:"+phNumber );
		}
	
	
	

	public static void main(String[] args) {
		Create create = new Create();
		
		create.entry();
		create.show();

	}

}
