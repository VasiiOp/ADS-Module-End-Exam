import java.util.*;
import java.io.*;
public class InsertionSort
{
	private static void printArray(int[] ar)
	{
		for(int n : ar)
		{
			System.out.print(n + " ");
		}
			System.out.println(" ");
	
}
public static int insertIntoSorted(int[]ar){
int length= ar.length;
int elementNeedToBeInserted= ar[length-1];
for(int i=length-2;i>=0;i--)
{
	if (ar[i]>elementNeedToBeInserted)
{
	ar[i+1]=ar[i];
	printArray(ar);
}
else{
	ar[i+1]=elementNeedToBeInserted;
	printArray(ar);
	break;
}
if ((i==0) && (a1[i]> elementNeedToBeInserted))
	(ar[i]=elementNeedToBeInserted);
	printArray(ar);
}
}
}
public static void main(String... args)
{
	Scanner Sc = new Scanner(System.in);
	int s= sc.nextInt();
	int[]ar = new int[s];
	for(int i=0;i<s;i++)
	{
		ar[i]=sc.nextInt();
	}
	insertIntoSorted(ar);
	sc.close();
}
}