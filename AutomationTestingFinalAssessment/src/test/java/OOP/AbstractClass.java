package OOP;
abstract class abstractclas
{
	abstract void method();
	void method2()
	{
		System.out.println("Normal Method 2");
	}
}
public class AbstractClass extends abstractclas{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass obj=new AbstractClass();
		obj.method();
		obj.method2();
	}
	void method()
	{
		System.out.println("Abstract method 1");
	}
}
