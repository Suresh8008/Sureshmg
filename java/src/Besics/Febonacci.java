package Besics;

import java.util.Scanner;

public class Febonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int K,a=1,b=1;
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt()
;K=0;
System.out.println("1 1");
while(K<num) {
	K=a+b;
	System.out.println(K+" ");
	a=b;
	b=K;
}
	}

}
