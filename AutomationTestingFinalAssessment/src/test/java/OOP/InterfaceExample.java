package OOP;
interface interface_ex
{
	void method();
}
public class InterfaceExample implements interface_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj=new InterfaceExample();
		obj.method();
	}
	public void method()
	{
		System.out.println("Interface method");
	}
}
