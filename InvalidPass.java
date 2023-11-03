package exception;

import java.util.Scanner;

class InvalidPassWordException extends Exception {
	private String msg;

	public InvalidPassWordException(String msg) {
		this.msg = msg;
	}
}

public class InvalidPass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name= sc.next();
		System.out.println("enter the password");
		String pass = sc.next();
		
		if(pass=="Sunil123" && name=="Sunil") {
			System.out.println("Login sucessfully");
		}
		else {
			try {
				throw new InvalidIdException("Invalid password and name");
			}
			catch(Exception e ) {
				System.out.println(e.getMessage());
			}
		}
	}

}
