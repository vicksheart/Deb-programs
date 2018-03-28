import java.io.*;
import java.util.*;

class So
{
	public static void main(String ar[])
	 {
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter the number of elements");
	   int n = in.nextInt();
	   int arr[] = new int[n];
	   int flag = 0;

	   for(int i=0;i<n;i++)
	   {
	   	arr[i] = in.nextInt();
	   }

	   for(int i=0;i<n;i++)
	   	   {
	   	   	  for(int j=i+1;j<n;j++)
	   	   	  {
	   	   	  	if(arr[i]>arr[j])
	   	   	  	{
	   	   	  		int temp;
	   	   	  		temp = arr[i];
	   	   	  		arr[i] = arr[j];
	   	   	  		arr[j] = temp;
	   	   	  		flag = 1;
	   	   	  	}
	   	   	  }
	   	   }

	   	   if(flag==1)
	   	   {
	   	   	System.out.println("Maximum value in array is" + arr[n-1]);
	   	   	System.out.println("Maximum value in array is" + arr[0]);
	   	   }

	 }
}