package $;

public class Main {

	public static void main(String[] args) {
		Cliente kenedy = new Cliente();
		kenedy.setNome("Kenedy");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Carol");
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Silvania");
		
		Banco banco1 = new Banco();
		banco1.setNome("Caixa Economica Federal");
		
		Banco banco2 = new Banco();
		banco2.setNome("Inter");
		
		Banco banco3 = new Banco();
		banco3.setNome("Nubank");
		
		Conta cc = new ContaCorrente(kenedy, banco2);
		Conta poupanca = new ContaPoupanca(cliente2, banco1);
		Conta c3 = new ContaCorrente(cliente3, banco3);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		c3.depositar(150);
		c3.transferir(75, cc);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		c3.imprimirExtrato();
		

	}

}
