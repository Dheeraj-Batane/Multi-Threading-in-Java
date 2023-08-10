import java.awt.*;
class A implements Runnable
{
	A()
	{
		Thread t1=new Thread();
		Thread t2=new Thread();
		t1.start();
		t2.start();
		
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try{Thread.sleep(50);}catch(Exception e){}
		
		}
	}
}
class Demo15
{
	public static void main(String []arg)
	{
		A a1=new A();
		
	}
}