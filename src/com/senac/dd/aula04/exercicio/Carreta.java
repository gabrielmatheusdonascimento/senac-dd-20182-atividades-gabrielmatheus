package com.senac.dd.aula04.exercicio;

public class Carreta extends VeiculoAutomotor {
	private String tipoCarroceria;

	public Carreta(String placa, String cor, String modelo, double potencia, String tipoCarroceria) {
		super(placa, cor, modelo, potencia);
		this.tipoCarroceria = tipoCarroceria;
	}

	public Carreta() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	


}

