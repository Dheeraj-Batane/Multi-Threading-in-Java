class A extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println(i);
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}
class Demo4
{
	public static void main(String []arg)
	{
		A a1=new A();
		A a2=new A();
		a1.start();
		a2.start();
		
	}
}