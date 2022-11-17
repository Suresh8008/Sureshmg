package Besics;

public class Bank {
	
	int currentBalance=1000;
	
public  static void GreetCustomer() {
	System.out.println("Hello,Welcome to banking application");
	
}
public void deposit(int amount) {
	currentBalance=currentBalance+amount;
	System.out.println("amount deposit succesfull");
	
}
public void withdrawal(int amount) {
	currentBalance=currentBalance-amount;
	System.out.println("amount withdrawal succesfull");
}
 public int getCurrentBalance(){
	return currentBalance;
}
    public static void main(String[] args) {
    Bank bank=new Bank();	
	GreetCustomer();
	System.out.println("current balance is :"+bank.getCurrentBalance());
	bank.deposit(500);
	System.out.println("current balance is :"+bank.getCurrentBalance());
	bank.withdrawal(200);
	System.out.println("current balance is :"+bank.getCurrentBalance());
	
}
}
