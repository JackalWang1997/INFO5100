package assignment6;


public class CheckingAccount extends Account
{
public CheckingAccount(String fname, String lname, double cb) {
		super(fname, lname, cb);
		
	}
static private double MinBalance = 100;
static private double Fee = 10;
public double DebitTransaction(double debitAmount){
	super.DebitTransaction(debitAmount);
	if(CurBalance<MinBalance) {
		this.ChargeFee();
	}
	return CurBalance;
	
}
public double CreditTransaction(double creditAmount){
	super.CreditTransaction(creditAmount);
	if(CurBalance<MinBalance) {
		this.ChargeFee();
	}
	return CurBalance;
	
}
private void ChargeFee(){
	this.CurBalance -= this.Fee;
}
public static void main(String[] args)
{
 CheckingAccount ch1 = new CheckingAccount("Steve", "Jobs", 50); // he was poor once before
 System.out.println(ch1);

 ch1.DebitTransaction(0.25); 
 System.out.println(ch1);    

 ch1.CreditTransaction(7.00); 
 System.out.println(ch1);     

 ch1.CreditTransaction(1000000); 
 System.out.println(ch1); 
}


}