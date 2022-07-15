
public class FuncionarioHorista extends Funcionario {
	
	private int salarioPorHora;
	private int horasTrabalhadas;
	
	FuncionarioHorista(int salarioPorHora, int horas)
	{
		this.salarioPorHora = salarioPorHora;
		this.horasTrabalhadas = horas;
	}

	int pagamentoDoMes() 
	{
		return salarioPorHora * horasTrabalhadas;
	}
	public String toString() 
	{
		return "\r\nSou um funcionário horista, ganho R$ " + salarioPorHora + " por hora e trabalhei " + horasTrabalhadas + " horas, resultando R$ " + salarioPorHora*horasTrabalhadas ;
	}
}
