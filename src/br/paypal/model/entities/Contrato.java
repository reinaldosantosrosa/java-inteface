package br.paypal.model.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Contrato {


private int contrato;
private LocalDateTime data;
private Double valorcontrato;
private int qtdparcelas;

private List<Installment> installment ;




public Contrato() {


}



public Contrato(int contrato, LocalDateTime data, Double valorcontrato, int qtdparcelas) {
	super();
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



public LocalDateTime getData() {
	return data;
}



public void setData(LocalDateTime data) {
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
