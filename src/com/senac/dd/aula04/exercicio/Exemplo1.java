package com.senac.dd.aula04.exercicio;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setPlaca("MZN 5527");
        
        Moto moto = new Moto();
        moto.setCor("Preta");
        
        Caminhao caminhao = new Caminhao();
        caminhao.setPotencia(300);
        
        Carreta carreta = new Carreta();
        carreta.setModelo("BMW");
        carreta.setTipoCarroceria("BiTrem");
	}

}
