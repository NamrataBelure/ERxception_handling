package UncheckedException;

public class TestMutipleCatch {

	public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		try {
			int n[]=new int[5];
			n[5]=30/0;
		} catch (Exception e) {
			System.out.println(e);	
		}		
	System.out.println("rest of code....");
	  }
}