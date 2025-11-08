import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Principal 
{

	public static void main(String[] args) 
	{
		
		//1) Instanciando a classe Caixa
		Caixa objCaixa = new Caixa();
				
		//2) Mensagem de boas vindas
		JOptionPane.showMessageDialog(null,
							"Olá meu querido!");
	
		
		//3) Menu para o usuário
		String opcao = JOptionPane.showInputDialog(
								"Escolha uma das opções abaixo"
								  + "\n [1] - Saque"
								  + "\n [2] - Depósito"
								  + "\n [3] - Mostrar o saldo"
								  + "\n [0] - Sair");
	
		
		switch(opcao) 
		{
			case "1": 
			{
				//Recebendo o valor de saque
				double valorSaque = Double.parseDouble(
					JOptionPane.showInputDialog("Digite o valor do saque"));
				
				//Passando o valor 
				double valorRetorno = objCaixa.Saque(valorSaque);
				
				//Mostrando o retorno
				JOptionPane.showMessageDialog(null, 
						"Valor Atual R$" + valorRetorno);
			}
			
			case "2":
			{

				//Recebendo o valor de depósito
				double valorDeposito = Double.parseDouble(
					JOptionPane.showInputDialog("Digite o valor do depósito"));
				
				//Passando o valor 
				double valorRetorno = objCaixa.Saque(valorDeposito);
				
				//Mostrando o retorno
				JOptionPane.showMessageDialog(null, 
						"Valor Atual R$" + valorRetorno);
			}
			
			case "3":
			{
				//Mostrando o retorno
				JOptionPane.showMessageDialog(null, 
						"Valor Atual R$" + objCaixa.MostrarSaldo());
			}
			
			case "0":
			{
				//Fechando o Programa
				System.exit(0);
			}
			
			default:
				JOptionPane.showMessageDialog(null, 
					"Escolha uma das opções do menu, ANIMAL!!!");
		
		}
	}

}
