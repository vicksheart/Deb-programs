import java.io.*;
import java.util.*;

public class Palindrome
{
	public static void main(String ar[])
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the String that you want to check");
    String str = in.next();
    char ch[] = str.toCharArray();
    String strev = " ";
    for(int i = str.length();i>=0;i--)
    {
    	strev = strev + ch[i];
    }

    if(str.equals(strev))
    {
    	System.out.println("Palindrome");
    }
    else
    {
    	System.out.println("not palindrome");
    }
	}
}