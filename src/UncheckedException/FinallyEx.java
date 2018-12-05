package UncheckedException;

public class FinallyEx {

	public static void main(String[] args) {
		int a[]=new int[2];
		try {
			System.out.println("access element three:"+a[3]);
		}catch (IndexOutOfBoundsException e) {
		 System.out.println("Exception thrown:"+e);
		}
		finally {
			a[0]=6;
			System.out.println("frist element value:"+a[0]);
			System.out.println("The finally statement is executed...");
		}
	}
}
