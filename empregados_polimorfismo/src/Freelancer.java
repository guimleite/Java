
public class Freelancer extends Funcionario {

private int pagamento;
	
	Freelancer (int valor)
	{
		pagamento = valor;
	}

	int pagamentoDoMes() 
	{
		return pagamento;
	}
	public String toString() 
	{
		return "\r\nSou um feelancer contratado e cobrei R$ " + pagamento + "\r\n";
	}
}
