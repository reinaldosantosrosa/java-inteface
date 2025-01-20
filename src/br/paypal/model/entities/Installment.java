package br.paypal.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate dueDate;
	private Double amount;
	
	private int contrato;
	
	public Installment() {
		
	}

	public Installment(LocalDate dueDate, Double amount, int contrato) {
		this.dueDate = dueDate;
		this.amount = amount;
		this.contrato = contrato;
	}
	
	
	
	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public int getContrato() {
		return contrato;
	}

	public void setContrato(int contrato) {
		this.contrato = contrato;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Parcela com vencimento em: " + dueDate.format(ftm) + ", no valor de: " + String.format("%.2f",amount);
	}
	

}
