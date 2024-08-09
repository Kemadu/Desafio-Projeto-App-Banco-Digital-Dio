package $;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.ImprimirInfosComuns();
	}
}
