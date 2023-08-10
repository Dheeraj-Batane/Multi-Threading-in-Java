class A 
{
	void show()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo2
{
	public static void main(String []arg)
	{
		A a1=new A();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		a1.show();
	}
}