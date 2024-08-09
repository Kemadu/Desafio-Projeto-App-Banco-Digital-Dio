package $;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.ImprimirInfosComuns();
	}
}
