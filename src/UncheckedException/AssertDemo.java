package UncheckedException;

public class AssertDemo {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		assert num>0;
		System.out.println("num is positive and its value is:"+num);
	}
}
