import java.util.ArrayList;
import java.util.List;

abstract public class Funcionario {
	
	abstract int pagamentoDoMes();
	
	public static void main(String[] args) {
		List<Funcionario> corpoDeTrabalho = new ArrayList<>();
		
		corpoDeTrabalho.add(new FuncionarioHorista(100, 30));
		corpoDeTrabalho.add(new FuncionarioMensalista (5000, 1.8));
		corpoDeTrabalho.add(new Freelancer (7000));
		
		int custoTotal = 0;
		for (Funcionario trabalhador: corpoDeTrabalho)
			custoTotal += trabalhador.pagamentoDoMes(); // POLIMORFISMO em ação!
		System.out.println("Minha folha de pagamento neste mês vai custar R$ " + custoTotal);
		System.out.println(corpoDeTrabalho);
	}

}
