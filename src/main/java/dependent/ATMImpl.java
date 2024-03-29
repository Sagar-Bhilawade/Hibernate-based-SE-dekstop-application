package dependent;


import dependency.HttpTransport;
import dependency.TestTransport;
import dependency.Transport;

public class ATMImpl implements ATM {
	private Transport myTransport;//=new HttpTransport();
	public ATMImpl() {
		System.out.println("in cnstr of " +getClass().getName()+" "+myTransport);
	}

	@Override
	public void deposit(double amt) {
		System.out.println("depositing "+amt);
		byte[] data=("depositing "+amt).getBytes();
		myTransport.informBank(data);

	}

	@Override
	public void withdraw(double amt) {
		System.out.println("withdrawing "+amt);
		byte[] data=("withdrawing "+amt).getBytes();
		myTransport.informBank(data);
	}
	//add a setter : setter based D.I

	public void setMyTransport(Transport myTransport) {
		
		this.myTransport = myTransport;
		System.out.println("in setter "+this.myTransport);//not null
	}
	
	
}
