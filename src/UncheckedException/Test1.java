package UncheckedException;

public class Test1 {
static void sum(int a,int b) throws myException{
	if (a<0) {
		throw new myException(a);
	}else
	{
		System.out.println(a+b);
	}
}
public static void main(String[] args) {
	try {
		sum(-10, 10);
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
class myException extends Exception{
	private int ex;
	myException(int a){
		ex=a;
	}
	public String toString(){
		return "MyException["+ex+"]is less than zero";
	}
}