
public class FuncionarioMensalista extends Funcionario {
	
	private int salarioMensal;
	private double taxaEncargosTrabalhistas;
	
	FuncionarioMensalista (int salario, double d)
	{
		salarioMensal = salario;
		taxaEncargosTrabalhistas = d;
		
	}

	int pagamentoDoMes() 
	{
		return (int)(salarioMensal * taxaEncargosTrabalhistas);
	}
	public String toString() 
	{
		return "\r\nSou um funcionario mensalista, ganho R$ " + salarioMensal + 
				" por mês e são pagos de encargos trabalhistas R$" 
				+ salarioMensal * (taxaEncargosTrabalhistas-1);
	}
}
