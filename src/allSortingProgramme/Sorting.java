package allSortingProgramme;

import java.util.Scanner;

public class Sorting {

	private static void SortArray(int[] arr) {
		 int n=arr.length;
		 int min;
		 for(int i=0;i<n-1;i++)
		 {
			  min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j] <arr[min])
				{
					min=j;
				}
			}
			 
			 
			 int temp=arr[min];
			 arr[min] =arr[i];
			 arr[i] =temp;
			 
			 
			 
			 
		 }
		
		
		
		
		
		
	}
	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
	} 
	public static void main(String[] args) {
	 
		Scanner  s = new Scanner(System.in);
		int size=s.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] =s.nextInt();
		}
         SortArray(arr);
		printArray(arr);
	}

	

}
