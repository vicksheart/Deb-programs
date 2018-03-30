import java.io.*;
import java.util.*;

public class Stringrev
{
	public static void main(String ar[])
	{
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter the String to rev");
	  String str = in.next();
	  char ch[] = str.toCharArray();
	  String strev = " ";
	  for(int i=str.length()-1;i>=0;i--)
	  {
	  	strev = strev + ch[i];
	  	
	  }

	  System.out.println("reverse is" + strev);

	}
}