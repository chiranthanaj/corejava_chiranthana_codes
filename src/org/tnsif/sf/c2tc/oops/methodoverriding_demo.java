package org.tnsif.sf.c2tc.oops;

class Payment
{
	void makePayment() 
	{
		System.out.println("Processing payment using generic method");
	}
}

class UPIPayment extends Payment
{
	void makePayment() 
	{
		System.out.println("Payment made using UPI");
	}
}

class CardPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using Credit/debit card");
	}
}

class WalletPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using digital wallet");
	}
}
public class methodoverriding_demo {

	public static void main(String[] args) {
		Payment payment;
		
		payment = new UPIPayment();
		payment.makePayment();
		
		payment = new CardPayment();
		payment.makePayment();
		
		payment = new WalletPayment();
		payment.makePayment();
	}
}
