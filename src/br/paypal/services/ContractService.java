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
		
		
		List<Installment> installment = new ArrayList<Installment>();			
		
		for (int j = 1; j <= months; j++) {		
			Installment install = new Installment();
			
			install.setAmount(contrato.getValorcontrato() + ( onlinePaymentService.Interest(contrato.getValorcontrato(), j) + onlinePaymentService.PaymentFee((onlinePaymentService.Interest(contrato.getValorcontrato(), j)))) );
			
			install.setContrato(contrato.getContrato());
						
			install.setDueDate(contrato.getData().plusDays(30*j));
						
			installment.add(install);
		}
		
	     contrato.setInstallment(installment);		
		
		
	}

}
