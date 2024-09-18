package ExceptionHandling;

public class EHDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;

		String name = "";
		String name1 = "";

		System.out.println(name.length());

		try {
		
			int Quo = div(a, b);
			System.out.println(Quo);

		}

		catch (ArithmeticException ae) {

			System.out.println(ae.getMessage());

		}catch(NullPointerException ne) {
			ne.printStackTrace();
		}catch (Exception e) {

			System.out.println("My exception is :" + e.getMessage());
			e.printStackTrace();
			System.out.println(e.getCause());

		}

		finally {
			System.out.println("Entered Finally Block");

		}

		int sum = add(a, b);
		System.out.println(sum);
		int diff = sub(a, b);
		System.out.println(diff);
		int prod = mul(a, b);
		System.out.println(prod);

	}

	private static int add(int a, int b) {
		return a + b;
	}

	private static int mul(int a, int b) {
		return a - b;
	}

	private static int sub(int a, int b) {
		return a * b;
	}

	private static int div(int a, int b) {

		if (b == 0) {
			throw new ArithmeticException("Divide By zero Exception");
		}

		return a / b;
	}

	}


