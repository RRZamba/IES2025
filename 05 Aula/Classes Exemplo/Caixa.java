import javax.swing.JOptionPane;

public class Caixa 
{
	// Atributos
	private double saldo = 5000;	
	
	//Método Saque
	public double Saque(double valorSaque)
	{
		return saldo -= valorSaque;
	}
		
	//Método Depósito
	public double Deposito(double valorDeposito)
	{
		return saldo += valorDeposito;		
	}	
	
	//Método MostrarSaldo
	public double MostrarSaldo() 
	{
		return saldo;
	}
}
