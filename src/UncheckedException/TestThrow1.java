package UncheckedException;

public class TestThrow1 {
   
	static void validate(int age){
		if (age<18) {
           throw new ArithmeticException("Not valid....");
		}else
			System.out.println("Welcome to vote...");
	}
	
	public static void main(String[] args) {
		validate(13);//not valid....
		validate(20);//Welcome to vote...
		System.out.println("rest the code....");
	}
}
