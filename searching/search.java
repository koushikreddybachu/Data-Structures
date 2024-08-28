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
	int recursive_Find(int a[],int target,int count)
	{
		if(count>a.length)
			return -1;
		else
		{
			if(a[count]==target)
				return count+1;
			else
				return recursive_Find(a,target,count+1);
		}
	}
}

class binarySearch
{
	int mid=0,count;
	int find(int a[],int target,int low,int high)
	{
		count=-2;
		while(low < high)
		{
			mid=(low+high)/2;
			if(a[mid]==target)
			{
				count=mid;
				break;
			}
			else if(a[mid]<target)
			low=mid+1;
			else
			high=mid-1;
		}
		return count+1;
	}
	int recursive_Find(int a[],int target,int low,int high)
	{
		if(low > high)
		return -1;
		else
		{
			mid=(low+high)/2;
			if(a[mid]==target)
				return mid+1;
			else if(a[mid]<target)
				return recursive_Find(a,target,mid+1,high);
			else
				return recursive_Find(a,target,low,mid-1);
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
				System.out.println("\nSelect the operation\n1. Recursive\n2. Normal");
				option=sc.nextInt();
					switch(option)
					{
						case 1:
						position =ls.recursive_Find(data,target,0);
						break;
						case 2:
						position = ls.find(data,target);
						break;
						default:
						System.out.println("Invalid input");
						continue;
					}
					break;

				case 2:
				System.out.println("\nSelect the operation\n1. Recursive\n2. Normal");
				option=sc.nextInt();
				int low=0,high=data.length;
					switch(option)
					{
						case 1:
						position =bs.recursive_Find(data,target,low,high);
						break;
						case 2:
						position = bs.find(data,target,low,high);
						break;
						default:
						System.out.println("Invalid input");
						continue;
					}
					break;
				default:
				System.out.println("Invalid input");
				continue;
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