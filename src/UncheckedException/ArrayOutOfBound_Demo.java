package UncheckedException;

public class ArrayOutOfBound_Demo {
	
  public static void main(String[] args) {
	int num[]={1,2,3,4};
	//System.out.println(num[5]);//ArrayIndexOutOfBoundsException
	System.out.println(num[2]);
	
	try {
		int n[]=new int[5];
		n[5]=30/0;
	} catch (ArithmeticException e) {
		System.out.println("ArithmeticException");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException");
	}
	catch (Exception e) {
		System.out.println(e);
	}
System.out.println("rest of code....");
  }
}
