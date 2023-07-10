package package2;
import java.util.Scanner;

class BankUser extends Exception  {
	private long acno;
	private int balance;
	private int deposit;
	int amount;
   BankUser(long acno,int balance){
	   this.acno=acno;
	   this.balance=balance;
	   //this.deposit=deposit;
   }
   public void deposit(int deposit) {
	   this.balance+=deposit;
	   if(deposit<0) System.out.println("Amount cannot be negative");
	   else System.out.println("Money deposited:"+this.deposit);
   }
   public void balance() {
	   System.out.println("Account Balance:"+this.balance);
   }
   public void withdraw(int amount) {
	   if(this.balance<amount) {
		   System.out.println("Insufficient balance");
	   }
	   else System.out.println("withdraw Successfull");
   }
}
public class BankAccount{
	public static void main(String args[]) {
		BankUser u=new BankUser(12345,10000);
		u.balance();
		u.deposit(-899);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Amount to withdraw:");
		int wd=s.nextInt();
		u.withdraw(wd);
	}
	
}
