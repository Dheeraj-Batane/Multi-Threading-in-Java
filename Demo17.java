class Demo17
{
	public static void main(String []arg)
	{
		new Thread()
		{
			public void run()
			{
				int i=1;
				for(;;)
				{
					System.out.println(" "+i);
					i++;
					try{Thread.sleep(100);}catch(Exception e){}
					if(i>=100)
						System.exit(0);
				}
			}
		}.start();
		
	}
}