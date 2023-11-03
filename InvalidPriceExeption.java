package exception;

public class InvalidPriceExeption  extends RuntimeException{
  String message;
	public InvalidPriceExeption(String message) {
		super(message);
	//this.message=message;

	}
//	public String getMessage() {
//		return message;
//	}

}
