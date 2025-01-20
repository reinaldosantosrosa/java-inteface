package br.paypal.services;

import java.util.ArrayList;
import java.util.List;

import br.paypal.interfaces.OnlinePaymentService;
import br.paypal.model.entities.Contrato;
import br.paypal.model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	public double vrContrato;
	public int qtdPacerlas;
	

	
	public ContractService (double vrContrato, int qtdParcelas,OnlinePaymentService onlinePaymentService ) {
		this.vrContrato = vrContrato;
		this.qtdPacerlas = qtdParcelas;
		this.onlinePaymentService = onlinePaymentService;
	  }
	


	public void processContract(Contrato contrato, int months) {		
		
		
		double basicQuota = contrato.getValorcontrato() / months;		
		

		for (int j = 1; j <= months; j++) {		
	
			double interest = onlinePaymentService.Interest(basicQuota, j);
			double paymentfee = onlinePaymentService.PaymentFee(basicQuota+interest);
					
			contrato.getInstallment().add(new Installment(contrato.getData().plusDays(30*j),basicQuota+ interest + paymentfee , contrato.getContrato()));
		}
		
	
		
	}

}
