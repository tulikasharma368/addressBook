package addressBook;

import java.util.Scanner;

public class NewContact {

	String lName;
	String address;
	String city;
	String state;
	int zipCode;
	long phNumber;
	String email;
	
	String fName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public long getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDetails() {
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
		
//		sc.close();
		
		NewContact newCon = new NewContact();
		newCon.setfName(fName);
		newCon.setlName(lName);
		newCon.setAddress(address);
		newCon.setCity(city);
		newCon.setState(state);
		newCon.setZipCode(zipCode);
		newCon.setPhNumber(phNumber);
		newCon.setEmail(email);
	}
	
	public void userChoice() {
		System.out.println("Press 1 to enter a new contact");
		System.out.println("Press 2 to exit");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		//sc.close();
		NewContact newCont = new NewContact();
		switch (choice) {
		case 1: {
			newCont.setDetails();
//			System.out.println("New contact added");
//			break;
			
		}
//		case 2:{
//			System.exit(0);
//			break;
//			
//		}
		}
	}
	public static void main(String[] args) {
		NewContact newContact = new NewContact();
		newContact.userChoice();
	}
}
