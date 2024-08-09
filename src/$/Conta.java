package $;

public class Conta {
	
	private static final int AGENCIA_PADRAO = 0;
	private static long CPF = 00000000000l;
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numero;
	private double saldo;
	protected Cliente cliente;
	protected Banco banco;
	protected long cpf;
	
	public Conta(Cliente cliente, Banco banco) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.banco = banco;
		this.cpf = CPF++;
		
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirExtrato() {
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	protected void ImprimirInfosComuns() {
		System.out.println(String.format("Banco: %s", this.banco.getNome()));
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("CPF: %d", this.cpf));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
