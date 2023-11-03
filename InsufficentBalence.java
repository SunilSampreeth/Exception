package exception;

import java.util.Scanner;

class InsufficentBalenceException extends Exception{
	private String msg;

 public InsufficentBalenceException(String msg) {
		super(msg);
		this.msg = msg;
	}
}

public class InsufficentBalence {
 
public static void main(String[] args) {
	int bal=2000;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the amount ");
	int amt=sc.nextInt();
	if(bal>amt) {
		System.out.println("withdrow successfully ");
	}
	else {
		try {
			throw new InsufficentBalenceException("Insufficient balence ");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
}
