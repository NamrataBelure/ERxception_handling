package UncheckedException;

public class TestCustomEx {

	public static void validate(int age) throws invalidAgeException{
	if (age<18) {
		throw new invalidAgeException("not valid...");
	}else
		System.out.println("welcome to vote....");
   }
	public static void main(String[] args){
		try {
			validate(10);
		} catch (Exception e) {
			System.out.println("exception occures..."+e);
		}
		System.out.println("rest to the code...");
    }
}
class invalidAgeException extends Exception{

	public invalidAgeException(String s) {
		super(s);
	}

}
