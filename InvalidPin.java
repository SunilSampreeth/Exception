package exception;

import java.util.Scanner;

class InvalidPinException extends Exception{
	String msg;
	public InvalidPinException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
public class InvalidPin {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Pin");
	int pin= sc.nextInt();
	if(pin==8375) {
		System.out.println("your pin currect");
	}
	else {
		try {
			throw new InvalidAgeException("Invalid pin");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
}
