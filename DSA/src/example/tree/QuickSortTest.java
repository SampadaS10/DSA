package example.tree;

import java.util.Arrays;

public class QuickSortTest 
{
	public static void main(String[] args) 
	{
		int array[]= {13,18,27,2,19,25};
		QuickSort qs=new QuickSort();
		qs.printArray(array, array.length-1);
		qs.performQuickSort(array, 0, array.length-1);
		qs.printArray(array, array.length-1);
	}
}

class QuickSort
{
	public static int doPartition(int array[],int startPos,int endPos)
	{
		int pivot=array[endPos];
		int i=(startPos-1);
		
		for(int j=startPos;j<=endPos;j++)
		{
			if(array[j]<pivot)
			{
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int temp=array[i+1];
		array[i+1]=array[endPos];
		array[endPos]=temp;
		System.out.println("\n\t"+Arrays.toString(array));
		return i+1;
	}
	
	public  void performQuickSort(int array[],int startPos,int endPos)
	{
		if(startPos<endPos)
		{
			int p=doPartition(array,startPos,endPos);
			performQuickSort(array, startPos, p-1);
			performQuickSort(array, p+1, endPos);
		}
	}
	
	public void printArray(int array[],int len)
	{
		System.out.println("-------------------------------");
		for(int i=0;i<array.length;i++)
			System.out.println("Value: "+array[i]);
	}
}