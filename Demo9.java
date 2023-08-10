class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo9
{
	public static void main(String []arg)
	{
		A a1=new A();
		Thread t1=new Thread(a1);
		t1.start();
		
		
	}
}