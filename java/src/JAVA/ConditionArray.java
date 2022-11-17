package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class ConditionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the size of row number in Array1: ");
		int rowSize_arr1 = sc.nextInt();
		int arr1[][] = new int [rowSize_arr1][];
		for(int i=0;i<rowSize_arr1;i++)
		{
			System.out.println("Please Enter the column size of the row number: "+i);
			int colSize = sc.nextInt();
		    arr1[i] = new int [colSize];
		    System.out.println("Please Enter the column values in the row number: "+i); 
		    for(int j=0;j<colSize;j++)
		    {
		    	arr1[i][j] = sc.nextInt();
		    }
		}
		System.out.println("Please Enter the size of row number in Array1: ");
		int rowSize_arr2 = sc.nextInt();
		int arr2[][] = new int [rowSize_arr2][];
		for(int i=0;i<rowSize_arr2;i++)
		{
			System.out.println("Please Enter the column size of the row number: "+i);
			int colSize = sc.nextInt();
		    arr2[i] = new int [colSize];
		    System.out.println("Please Enter the column values in the row number: "+i); 
		    for(int j=0;j<colSize;j++)
		    {
		    	arr2[i][j] = sc.nextInt();
		    }
		}
		System.out.println("Input1 and Input2 ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(Arrays.toString(arr1[i]));
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(Arrays.toString(arr2[i]));
		}
		int arr3[][] = new int[arr1.length][];
		for(int i = 0 ;i<arr1.length;i++)
		{
		   arr3[i] =  new int [arr1[i].length];	
		   for(int j=0;j<arr1[i].length;j++)
		   {
			   if(arr1[i][j]==arr2[i][j])
			   {
				  arr3[i][j] = 1; 
			   }
			   else
				   arr3[i][j] = 0;
		   }
		}
		   System.out.println("Output is: ");
		   for(int i=0;i<arr3.length;i++)
		   {
			   System.out.println(Arrays.toString(arr3[i]));
		   }
			   
		   
		}

	}


