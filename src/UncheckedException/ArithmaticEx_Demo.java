package UncheckedException;

public class ArithmaticEx_Demo {

	public static void main(String[] args) {
		
		/*int a=50/0;//ArithmaticException..../divided by 0....
		System.out.println(a);*/
		
		try {
			
			int b=50/0;
			//reslove the Exception
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of code....");
		
		
		
	}
}
