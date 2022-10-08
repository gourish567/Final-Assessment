package javaprogram;
class methods
{
	private void m1()
	{
		System.out.print("Private method");
	}
	protected void m2()
	{
		System.out.println("protected method");
	}
	public void m3()
	{
		System.out.print("public method");
	}
}
public class AccessSpecifier extends methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifier obj=new AccessSpecifier();
		obj.m2();
		obj.m3();

	}

}
