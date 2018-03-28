import java.io.*;
import java.util.*;
public class Prima
{
	public static void main(String ar[])
	{
	   int flag = 0;
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter the value that you want to check");
	   int n = in.nextInt();
	   int m = n/2;
	   for(int i=2;i<=m;i++)
	   {
	   	   if(n%i==0||n%i==1)
	   	   {
	   	   	   System.out.println("Not prime");
               flag =1;
               break;
	   	   }
	   	   

	   }

if(flag==0)
{

  System.out.println("prime");
}



}
}