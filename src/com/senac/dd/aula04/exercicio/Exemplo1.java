package com.senac.dd.aula04.exercicio;



import javax.swing.JOptionPane;

public class Exemplo1 {

	

	public static int menu() {
        String menu = "MENU\n";
        menu = menu + "1 – Cadastrar Automovel\n";
        menu = menu + "2 – Listar Automoveis\n";
        menu = menu + "3 – Relatório Geral\n";
        menu = menu + "9 – SAIR";
        String opcao = JOptionPane.showInputDialog(menu);
		return 0;
       
    }
       public static void main(String args[]) {
        int maxAL= 100;
        VeiculoAutomotor veiculoAutomotores[] = new VeiculoAutomotor[maxAL];
        int contAL = 0;
        int op;

        do {
            op = menu();
            switch (op) {
                case 1://CADASTRO DE AUTOMOVEL
                    if (contAL < maxAL) {
                        String tipo = JOptionPane.showInputDialog("Digite o tipo de automovel");
                        String placa= JOptionPane.showInputDialog("Digite placa do automovel");
                        String cor = JOptionPane.showInputDialog("Digite a cor do automovel");
                        String modelo = JOptionPane.showInputDialog("Digite o modelo");
                        veiculoAutomotores[contAL] = new VeiculoAutomotor(tipo, placa,cor,modelo, 0);
                        contAL++;
                    }
                    break;
                
            }
        } while (op >= 1 && op <= 8);
    }
}
 
       