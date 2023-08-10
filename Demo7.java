class A extends Thread
{
	public void start()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo7
{
	public static void main(String []arg)
	{
		A a1=new A();
		
		a1.start();
		
		
	}
}