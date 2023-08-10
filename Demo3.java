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
class Demo3
{
	public static void main(String []arg)
	{
		A a1=new A();
		a1.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}