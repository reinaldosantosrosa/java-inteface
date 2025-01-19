package br.paypal.model.entities;

import java.time.LocalDateTime;

public class Installment {


	private LocalDateTime dueDate;
	private Double amount;
	
	private int contrato;
	
	public Installment() {
		
	}

	public Installment(LocalDateTime dueDate, Double amount, int contrato) {
		this.dueDate = dueDate;
		this.amount = amount;
		this.contrato = contrato;
	}
	
	
	
	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
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
	
	

}
