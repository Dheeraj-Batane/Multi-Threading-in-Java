class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}
class Demo11
{
	public static void main(String []arg)
	{
		A a1=new A();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		t1.start();
		t2.start();
		
		
	}
}