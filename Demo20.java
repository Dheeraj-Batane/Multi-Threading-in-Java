class A extends Thread
{
	String name;
	A(String name)
	{
		this.name=name;
	}
	public void run()
	{
	int i=1;
	while(i<11)
	{
		System.out.println(name+"="+i);
		i++;
		try{Thread.sleep(100);}catch(Exception e){}
		
		
	}
	}
}
class Demo20
{
	public static void main(String []arg)
	{
		A a1=new A("Cut Ticket");
		A a2=new A("Show Ticket");
		a1.start();
		a2.start();
		
	}
}