package capgemini.firstproject.Banking;

import java.util.Scanner;

public class RBI {
	double Balance=0,AddInterest,WithdrawInterest,MinBalance;int WithdrawCounter=0,AddCounter=0;
	Scanner in = new Scanner(System.in);
	public void Display(double balance)
	{
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public double getAddInterest() {
		return AddInterest;
	}
	public void setAddInterest(double addInterest) {
		AddInterest = addInterest;
	}
	public double getWithdrawInterest() {
		return WithdrawInterest;
	}
	public void setWithdrawInterest(double withdrawInterest) {
		WithdrawInterest = withdrawInterest;
	}
	public double getMinBalance() {
		return MinBalance;
	}
	public void setMinBalance(double minBalance) {
		MinBalance = minBalance;
	}
	public int getWithdrawCounter() {
		return WithdrawCounter;
	}
	public void setWithdrawCounter(int withdrawCounter) {
		WithdrawCounter = withdrawCounter;
	}
	public int getAddCounter() {
		return AddCounter;
	}
	public void setAddCounter(int addCounter) {
		AddCounter = addCounter;
	}
	public void AddAmount() {
		
	}
	public void WithdrawAmount()
	{
	}
	
}
