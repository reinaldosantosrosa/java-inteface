package br.paypal.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {


private int contrato;
private LocalDate data;
private Double valorcontrato;
private int qtdparcelas;

private List<Installment> installment = new ArrayList<>() ;


public Contrato() {


}



public Contrato(int contrato, LocalDate data, Double valorcontrato, int qtdparcelas) {
	this.contrato = contrato;
	this.data = data;
	this.valorcontrato = valorcontrato;
	this.qtdparcelas = qtdparcelas;

}



public List<Installment> getInstallment() {
	
	return installment;
	
}



public void setInstallment(List<Installment> installment) {
	this.installment = installment;
}



public int getContrato() {
	return contrato;
}



public void setContrato(int contrato) {
	this.contrato = contrato;
}



public LocalDate getData() {
	return data;
}



public void setData(LocalDate data) {
	this.data = data;
}



public Double getValorcontrato() {
	return valorcontrato;
}




public void setValorcontrato(Double valorcontrato) {
	this.valorcontrato = valorcontrato;
}



public int getQtdparcelas() {
	return qtdparcelas;
}



public void setQtdparcelas(int qtdparcelas) {
	this.qtdparcelas = qtdparcelas;
}













}
