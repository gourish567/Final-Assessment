package OOP;

public class OverLoadingsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingsum s=new OverLoadingsum();
		s.add(3, 6);
		s.add(2.3f, 6.6f);
		s.add(8,6,4);

	}
	void add(int x,int y)
	{
		System.out.println("Sum of "+x+" and "+y+" is :"+(x+y));
	}
	void add(float x,float y)
	{
		System.out.println("Sum of "+x+" and "+y+" is :"+(x+y));
	}
	void add(int x,int y,int z)
	{
		System.out.println("Sum of "+x+","+y+" and "+z+" is :"+(x+y+z));
	}
}
