package capgemini.firstproject.Banking;

public class SC extends RBI
{
	int add;int with;
	@Override
	public void setMinBalance(double minBalance) {
		// TODO Auto-generated method stub
		super.setMinBalance(5000);
	}
	

	@Override
	public void AddAmount() {
		// TODO Auto-generated method stub
		super.AddAmount();
		System.out.println("Enter the money to be Deposited");
		add=in.nextInt();
		setAddInterest(0.038);
		setAddCounter(getAddCounter()+1);
		if(getWithdrawCounter()<=3)
		{
			setBalance(getBalance()+add);
		}
		else
		{
			setBalance(getBalance()+add);
			setBalance(getBalance()+getBalance()*getAddInterest());
		}
		System.out.println("The Balance is "+getBalance());
	}
	

	@Override
	public void WithdrawAmount() {
		// TODO Auto-generated method stub
		super.WithdrawAmount();
		System.out.println("Enter the money to be Withdrawn");
		with=in.nextInt();
		setWithdrawInterest(0.03);
		setWithdrawCounter(getWithdrawCounter()+1);
		if(getBalance()-with>=getMinBalance())
		{
		if(getAddCounter()<=3)
		{
			setBalance(getBalance()-with);
		}
		else
		{
			setBalance(getBalance()-with);
			setBalance(getBalance()-getBalance()*getWithdrawInterest());
		}
		}
		else
		{
			System.out.println("Not enough Balance");
		}
		System.out.println("The Balance is "+getBalance());
		}
}
