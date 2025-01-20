package br.paypal.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import br.paypal.model.entities.Contrato;
import br.paypal.model.entities.Installment;
import br.paypal.services.ContractService;
import br.paypal.services.PaypalService;

public class Main {
	
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Informe com os dados do Contrato");
		
		System.out.print("Numero do Contratao:");
		int nContrato = Integer.parseInt(sc.next());
		System.out.print("Data do Contratao (dd/MM/yyyy): ");
		LocalDate dDataContrato = LocalDate.parse(sc.next(),fmt);
		System.out.print("Valor do Contratao....:");
		Double nValorContrato = Double.parseDouble(sc.next());
		
		System.out.print("Quantidade de Parcelas....:");
		int nQtdparcelas = Integer.parseInt(sc.next());
		System.out.println("");
		
		System.out.println("Parcelas:");
		System.out.println("");
		

		Contrato contrato = new Contrato(nContrato,dDataContrato,nValorContrato,nQtdparcelas);
		
		PaypalService paypalservice = new PaypalService();
		
		ContractService contractservice = new ContractService(nValorContrato,nQtdparcelas, paypalservice);
		
		contractservice.processContract(contrato, nQtdparcelas);		
		
    	
    	for (Installment installment : contrato.getInstallment() ) {    		
    		System.out.println( installment);
    	}
					
		
		
		sc.close();
	}

}
