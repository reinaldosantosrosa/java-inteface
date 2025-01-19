/**
 * 
 */
package br.paypal.services;

import br.paypal.interfaces.OnlinePaymentService;

/**
 * 
 */
public class PaypalService implements OnlinePaymentService {

	@Override
	public double PaymentFee(double amount) {
		// TODO Auto-generated method stub
		return amount*0.02;
	}

	@Override
	public double Interest(double amount, int months) {
		// TODO Auto-generated method stub
		return amount*(0.01*months);
	}
	
	

}
