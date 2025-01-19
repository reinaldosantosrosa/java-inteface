package br.paypal.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import br.paypal.model.entities.Contrato;
import br.paypal.services.ContractService;
import br.paypal.services.PaypalService;

public class Main {
	
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Informe com os dados do Contrato");
		
		System.out.println("Numero do Contratao:");
		int nContrato = Integer.parseInt(sc.nextLine());
		System.out.println("Data do Contratao (dd/MM/yyyy): ");
		LocalDateTime dDataContrato = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Valor do Contratao....:");
		Double nValorContrato = Double.parseDouble(sc.nextLine());
		
		System.out.println("Quantidade de Parcelas....:");
		int nQtdparcelas = Integer.parseInt(sc.nextLine());
		
		System.out.println("Parcelas:");

		Contrato contrato = new Contrato(nContrato,dDataContrato,nValorContrato,nQtdparcelas);
		
		PaypalService paypalservice = new PaypalService();
		
		ContractService contractservice = new ContractService(nValorContrato,nQtdparcelas, paypalservice);
		
		contractservice.processContract(contrato, nQtdparcelas);		
		
    	for (int i = 0; i < contrato.getInstallment().size(); i++) {
		  System.out.println("Vencimento da Parcela " + (i+1) +  ", " + contrato.getInstallment().get(i).getDueDate() + ", com o valor de: " + contrato.getInstallment().get(i).getAmount() );
     	}
					
		
		
		sc.close();
	}

}
