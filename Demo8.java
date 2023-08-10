class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo8
{
	public static void main(String []arg)
	{
		A a1=new A();
		
		a1.start();
		
		
	}
}