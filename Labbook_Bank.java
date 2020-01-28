/*
 * @Author Capgemini
 * @Developer Pankaj Chamyal
 * @Description This class performs banking process. 
 * @Created 27/01/2020
 * @Version 1.0
 * @Status release Beta
 */
package capgemini.firstproject.Banking;

import java.util.Scanner;

public class Labbook_Bank extends RBI {
	Scanner in = new Scanner(System.in);
	double minBalance=0;int countw=0;int counta=0;
	public static void main(String[] args) {
		Labbook_Bank mObject = new Labbook_Bank();
		mObject.welcome();
	}

	void welcome() {
		System.out.println("Select your bank \n 1. ICICI \n 2. HDFC \n 3. SC \n 4. AXIS");
		int choice = in.nextInt();
		switch (choice) {
		case 1:
			icici();
			break;
		case 2:
			hdfc();
			break;
		case 3:
			sc();
			break;
		case 4:
			axis();
			break;
		default:
			System.out.println("Try Again");
			welcome();
			break;
		}
	}
	void icici() {
		ICICI mICICI = new ICICI();
		int flag=1;
		while(flag==1) {
		options();
		int op = in.nextInt();
		
		switch(op)
		{
		case 1:mICICI.AddAmount();break;
		case 2:mICICI.WithdrawAmount();break;
		case 3:flag=0;break;
		default:System.out.println("Try Again");
		icici();
		break;}
		}}
	void hdfc() {
		HDFC mHDFC=new HDFC();
		options();
		int op = in.nextInt();
		switch(op)
		{
		case 1:mHDFC.AddAmount();break;
		case 2:mHDFC.WithdrawAmount();break;
		default:System.out.println("Try Again");
		hdfc();
		break;}
	}
	void sc() {
		SC mSC = new SC();
		options();
		int op = in.nextInt();
		switch(op)
		{
		case 1:mSC.AddAmount();break;
		case 2:mSC.WithdrawAmount();break;
		default:System.out.println("Try Again");
		sc();
		break;}
	}
	void axis() {
		AXIS mAXIS = new AXIS();
		options();
		int op = in.nextInt();
		switch(op)
		{
		case 1:mAXIS.AddAmount();break;
		case 2:mAXIS.WithdrawAmount();break;
		default:System.out.println("Try Again");
		axis();
		break;}
	}
	void options()
	{
		System.out.println("Choose Operation \n 1. Add Money \n 2. Withdraw Money \n 3. STOP");
	}
}

