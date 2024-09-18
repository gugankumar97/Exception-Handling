package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EHDemo1 {

	public void display() {
		System.out.println("Inside Parent class display()");
	}
	
	public void display1() throws IOException {
		System.out.println("Inside Parent class display1()");
	}

	public void display2() throws ArithmeticException {
		System.out.println("Inside Parent class display2()");
	}
	
	public void display3() throws NullPointerException {
		System.out.println("Inside Parent class display3()");
	}
	
	public void display4() throws IOException {
		System.out.println("Inside Parent class display4()");
	}
}

class EHDemo2 extends EHDemo1 {

	/*
	 *  
	 * If SuperClass does not throws an exception, then the SubClass can only
	 * throw unchecked exceptions
	 * 
	 */
	@Override
	public void display() throws ArithmeticException {
		System.out.println("Inside Child class display()");
	}
	
	/*
	 * 
	 * If SuperClass does not declare an exception
	 * Throwing any Checked Exception is not possible in subclass
	 *
	 * @Override 
	 * public void display1() throws IOException {
	 * 		System.out.println("Inside Child class display1()"); 
	 * }
	 */

	/*
	 * If SuperClass declares an exception, then the SubClass can only declare the
	 * same or child exceptions of the exception declared by the SuperClass
	 */

	@Override
	public void display3() throws ArithmeticException {
		System.out.println("Inside Child class display2()");
	}
	
	/*
	 * If SuperClass declares an exception, then it is not possible for the SubClass 
	 * to declare parent exception of the exception declared by the SuperClass

	 * 
	 * @Override 
	 * public void display3() throws Exception {
	 * 		System.out.println("Inside Parent class display2()"); 
	 * }
	 */
	
	/*
	 * If SuperClass declares a checked exception, then it is not possible for the SubClass 
	 * to declare parent exception of the exception declared by the SuperClass
	 */
	
	@Override
	public void display1() throws FileNotFoundException{
		System.out.println("Inside Child class display4()");
	}
	
	/*
	 * If SuperClass declares an exception, 
	 * then the SubClass can declare without exception.
	 */
	@Override
	public void display4(){
		System.out.println("Inside Child class display4()");
	}
}
