package super_keyword;

public class Super_With_Instance_Variable 
{

	public static void main(String[] args)
	{
		
		Son obj=new Son();
		obj.disp();
		
	}

}
class Father 
{
	int a;
}
class Son extends Father
{
	int a;
	void disp()
	{
		a=100;
		super.a=200;
		
		System.out.println("Super class A= "+super.a);
		System.out.println("A= "+a);
	}
}
