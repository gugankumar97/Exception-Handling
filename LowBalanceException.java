package ExceptionHandling;

public class LowBalanceException extends Exception {
	
	public LowBalanceException(){
		System.out.println("Low Balance Excpetion thrown");
	}
	
	public LowBalanceException(String str) {
		super(str);
		//System.out.println("LB Exception thrown");

	}

}
