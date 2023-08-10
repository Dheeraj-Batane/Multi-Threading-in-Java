import java.awt.*;
class MyDemo extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try{Thread.sleep(50);}catch(Exception e){}
		
		}
	}
	
}
class A 
{
	A()
	{
		MyDemo t1=new MyDemo();
		MyDemo t2=new MyDemo();
		t1.start();
		t2.start();
		
	}
}
class Demo16
{
	public static void main(String []arg)
	{
		A a1=new A();
		
	}
}