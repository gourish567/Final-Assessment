package OOP;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int res=10/0 ;
			System.out.print("result is : "+res);
		}
		catch (ArithmeticException  e)
		{
			System.out.print("result is : "+e);
		}

	}

}
