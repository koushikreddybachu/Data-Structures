import java.util.*;

class linearSearch
{
	int find(int a[],int target)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
				return i+1;
		}
		return -1;
	}
}

class binarySearch
{
	int mid=0;
	int find(int a[],int target,int low,int high)
	{
		if(low > high)
		return -1;
		else
		{
			mid=(low+high)/2;
			if(a[mid]==target)
			return mid+1;
			else if(a[mid]<target)
			return find(a,target,mid+1,high);
			else
			return find(a,target,low,mid-1);
		}
	}
}

public class search
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        	System.out.println("\nSize of Array");
        	int size=sc.nextInt();
        	int data[]=new int[size];
        	System.out.println("\nEnter the array elements");
        	for (int i = 0; i < size; i++) 
         	   data[i]=sc.nextInt();
		linearSearch ls=new linearSearch();
		binarySearch bs=new binarySearch();
		int control=1,option,target,position =-1;
		while(control == 1)
		{
			System.out.println("\nEnter the search element");
			target=sc.nextInt();
			System.out.println("\nSelect the operation\n1. Linear Search\n2. Binary Search");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
					position = ls.find(data,target);
					break;
				case 2:
					int low=0,high=data.length;
					position = bs.find(data,target,low,high);
					break;
			}
			if(position == -1)
			System.out.println("\nElement not found in an array ");
			else
			System.out.println("\nPosition of element in array '"+position+"'");
			System.out.println("\nDo you want to continue?(0 to Exit /// 1 to continue)");
			control=sc.nextInt();
		}
	}
}