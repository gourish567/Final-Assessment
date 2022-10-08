package OOP;
class Cars
{
	void car()
	{
		System.out.println("Talking about car");
	}
}
public class MethodOverriding extends Cars{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding obj=new MethodOverriding();
		obj.car();

	}
	void car()
	{
		super.car();
		System.out.println("BMW is a car");
	}

}
