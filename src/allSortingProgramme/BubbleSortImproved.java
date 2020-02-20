package allSortingProgramme;

import java.util.Scanner;

public class BubbleSortImproved {
	
	private static void bubbleSort(int[] arr) {
		 int n=arr.length;
		 for(int i=0;i<n-1;i++)
		 {
			 boolean swapped=false;
			 for(int j=0;j<n-i-1;j++)
			 {
				 
				 if(arr[j] > arr[j+1])
				 {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1] =temp;
					 swapped=true;
					 
				 }
				 
			 }	 
				 
			 }
			 
			 
	}	 
			
	private static void printArray(int[] arr) {
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
		 bubbleSort(arr);
		 printArray(arr);

	}


		
	}

	


