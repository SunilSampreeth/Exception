package exception;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	private String msg;

	public InvalidAgeException(String msg) {

		super(msg);
	}
}

public class InvalidAge {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age");
	int age= sc.nextInt();
	if(age>18) {
		System.out.println("Eligible for Vote");
	}
	else {
		try {
			throw new InvalidAgeException("your not eligible for vote");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
}
