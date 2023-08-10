import java.awt.*;
class A implements Runnable
{
	
	public void run()
	{
		for(;;)
		{
		
			try{Thread.sleep(50);}catch(Exception e){}
		
		}
	}
}
class Demo13
{
	public static void main(String []arg)
	{
		A a1=new A();
		Thread t1=new Thread(a1);
		t1.start();
			try{Thread.sleep(500);}catch(Exception e){}
		t1.stop();
			try{Thread.sleep(500);}catch(Exception e){}
		t1.start();
		
	}
}