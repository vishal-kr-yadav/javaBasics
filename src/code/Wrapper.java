package code;

public class Wrapper {
	public static void main(String args[])
	{
		int a=21;
	
		
		Integer i=Integer.valueOf(a);
		
		
		
		Integer j=new Integer(i);
		int ik=j.valueOf(j);
		System.out.println(ik);
	
	}

}
