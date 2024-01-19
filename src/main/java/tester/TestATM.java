package tester;

import dependency.HttpTransport;
import dependent.ATMImpl;

public class TestATM {

	public static void main(String[] args) {
		ATMImpl atm=new ATMImpl();
		//setter
		atm.setMyTransport(new HttpTransport());
		
		atm.withdraw(1000);

	}

}
