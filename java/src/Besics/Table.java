package Besics;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter your value: ");
int num = sc.nextInt();
for (int i=1;i<=29;i++)
{
	System.out.println(num +"*"+ i + "=" + num * i);
}

	}

}
