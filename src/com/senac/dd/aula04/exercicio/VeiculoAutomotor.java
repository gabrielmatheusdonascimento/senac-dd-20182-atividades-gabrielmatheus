package com.senac.dd.aula04.exercicio;

public class VeiculoAutomotor {

	private String placa;
	private String cor;
	private String modelo;
	private double potencia;
	
	
	public VeiculoAutomotor(String placa, String cor, String modelo, double potencia) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.potencia = potencia;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public VeiculoAutomotor() {
		super();
		// TODO Auto-generated constructor stub
	}
}
