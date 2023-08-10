class A 
{
	String name;
	A(String name)
	{
		this.name=name;
	}
	public void show()
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
class Demo19
{
	public static void main(String []arg)
	{
		A a1=new A("ram");
		A a2=new A("sita");
		a1.show();
		a2.show();
		
	}
}