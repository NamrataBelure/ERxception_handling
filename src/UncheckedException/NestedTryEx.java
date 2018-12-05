package UncheckedException;

public class NestedTryEx {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("going to divide");
				int b=40/0;
				
			} catch (ArithmeticException e) {
			System.out.println(e);
			}
			System.out.println("Other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		}
		System.out.println("Normal flow");

	}

}
