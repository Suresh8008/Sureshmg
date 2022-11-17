package JAVA;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please Enter the size of the row: ");
		int rowSize = sc.nextInt();
		int arr[][] = new int [rowSize][];
		for(int i=0;i<rowSize;i++ )
		{
			System.out.println("Please Enter the Column Size in the row " +i);
			int colSize = sc.nextInt();
			arr[i] =new  int [colSize];
			System.out.println("Enter the column values in the row" +i);
			for(int j=0;j<colSize;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Input is :");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(Arrays.toString(arr[i]));
        }
        int outArr[][] = new int [arr.length][];
        for(int i=0;i<arr.length;i++)
        {
        	outArr[i] = new int[arr[i].length];
        	for(int j=0;j<arr[i].length;j++)
        	{
        		outArr[i][j] = (int) Math.pow(arr[i][j], 2);
        	}
        }
        System.out.println("Output :");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(Arrays.toString(outArr[i]));
        }
        sc.close();
	}

}
