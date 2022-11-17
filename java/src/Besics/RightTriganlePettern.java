package Besics;
import java.util.*;
public class RightTriganlePettern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int rows;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the numbar of rows");
 rows=sc.nextInt();
		for(int i=0;i<rows; i++) {
	  
	  for(int j=2*(rows-i); j>=0;j--) {
		  System.out.print(" ");
	  }
	  for(int j=0; j<=i; j++) {
		  System.out.print("* ");
	  }
	 System.out.println(); 
  }
	
 

 
	for(int i=1;i<=5; i++ ) {
		  for(int j=1; j<=i; j++) {
			  System.out.print("* ");
		  }
		 System.out.println();
	
		
	}
	}
		}






