import java.util.*;
class Demo1
{
	static int count(String s,char c)
	{
		int i,occ=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			occ++;
		}
		return occ;
	}
	static int countString(String s1,String s2)
	{
		String s3[]=null;
		s3=s1.split(" ");
		int count=0;
		for(String s4:s3)
		{
			if(s4.equals(s2))
			count++;
		}
		return count;
	}
	public static void main(String []arg)
	{
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter String:");
		// String s=sc.nextLine();
		// System.out.println("Enter char to search in above string:");
		// String c=sc.next();
		// int n=count(s,c);
		// if(n>0)
		// System.out.println("Occurence of a in above string is "+n);
		// else
		// System.out.println("Character a not found in String ");
		
		String s1="my name is ram my my name ";
		System.out.println(countString(s1,"my"));
		System.out.println(countString(s1,"name"));
		
	}
}