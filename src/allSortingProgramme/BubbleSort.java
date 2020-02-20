package allSortingProgramme;

import java.util.Scanner;

public class BubbleSort {

	
	public static void bubbleSort(int a[]){
	
	int n=a.length;
	for(int i=0;i<n;i++){
		for(int j=0;j<n-i-1;j++){
			if(a[j]>a[j+1]){
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
		
	}
	
}
	
	
	public static void print(int []a){
		int n=a.length;
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
			
			
		}
		System.out.println();
		
	}
	
public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int size=s.nextInt();
	 int a[]=new int[size];
	 for(int i=0;i<size;i++){
		 a[i]=s.nextInt();
		 
		 
	 }
	       bubbleSort(a);
	       print(a);

	}

}
