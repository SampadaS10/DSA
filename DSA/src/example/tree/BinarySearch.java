package example.tree;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		int array[]= {10,4,50,60,75,55,80};
		System.out.println("Original Array: ");
		System.out.println("-------------------------------------------------------");
		for(int a:array)
		{
			System.out.println("Array: "+a);
		}
		Arrays.sort(array);
		System.out.println("\n\nSorted Array: ");
		System.out.println("-------------------------------------------------------");
		
		for(int a:array)
		{
			System.out.println("Array: "+a);
		}
		
		int data=MyIOService.getInteger("Enter value to search...");
		int first=0;
		int last=array.length+1;
		int middle=(first+last)/2;
		int count=0;
		
		while(first<=last)
		{
			count++;
			System.out.println("While execution count : "+count);
			
			if(array[middle]<data)
				first=middle+1;
			else if(array[middle]==data)
			{
				System.out.println("Data Found.."+data+" at index "+(middle+1));
				break;
			}
			else
				last=middle-1;
			
			middle=(first+last)/2;
		}
	}
}

class MyIOService
{
	public static int getInteger(String msg)
	{
		System.out.println(msg);
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		return t;
	}
}