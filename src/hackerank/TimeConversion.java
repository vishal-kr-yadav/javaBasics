package hackerank;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
	static String timeConversion(String s)
	{
	        Date date=null;String output=null;
	        try{
	        
	       DateFormat df=new SimpleDateFormat("hh:mm:ss a");
	        date=df.parse(s);
	        DateFormat outputformat=new SimpleDateFormat("HH:MM:SS");
	        output=outputformat.format(date);}
	        catch(Exception e){System.out.println("error");}
	        return output;
	       
	    }
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String result=timeConversion(s);
		System.out.println("24 hr format is"+result);
		
	}
}
