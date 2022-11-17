package Besics;

import java.util.Scanner;

public class Cals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter operator to perform operation");
		char op=(char)sc.nextInt();
		switch(op)
		{
		case 1: int a=10,b=20;
		int res=a+b;
		System.out.println(res);
		break;
		
		
		
		case 2: int n1=10,n2=20;
					int sub=n1-n2;
			System.out.println(sub);
			break;
		
			default:
				System.out.println("invalid");
				
		}
	}
	}