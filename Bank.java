package Assignment2.best;

import java.util.Scanner;

public class Bank implements BankFunction{
   public double totalAmt;
     public Bank(double totalAmt) {
    	 this.totalAmt=totalAmt;
     }
    // public double getTotalAmt() {
    	//return totalAmt;
     //}
     @Override
 	public void increment(double amt) {
 		// TODO Auto-generated method stub
 		totalAmt+=amt;
 		System.out.println("After Increasing Amount:" + totalAmt);
 	}
 	@Override
 	public void decrement(double amt) {
 		// TODO Auto-generated method stub
 		totalAmt-=amt;
 		System.out.println("After Decreasing Amount:" + totalAmt);
 	}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double balance;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Your Balance");
      balance=sc.nextDouble();
    ChildBank cb=new ChildBank(balance);
    System.out.println("Enter increase Amount ");
    double amt = sc.nextDouble();
     cb.increment(amt);
     System.out.println("Enter decrease Amount ");
     double damt = sc.nextDouble();
     cb.decrement(damt);
      
	}
}

