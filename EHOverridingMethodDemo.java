package ExceptionHandling;

public class EHOverridingMethodDemo {

	public static void main(String[] args)throws Exception {
		
    EHDemo1 eh1 = new EHDemo1();//object created for child class, which is of Parent type
		

		
		eh1.display();
		
		eh1.display1();

		
		eh1.display2(); //this line suggests to keep throws declaration in the method signature

		
		eh1.display3();

		
		eh1.display4();//this line suggests to keep throws declaration in the method signature
	}

}
