package Banco_Digital;

public class Main {

	public static void main(String[] args) {
		Cliente marialuiza = new Cliente();
		marialuiza.setNome("Maria Luiza");
		
		Conta cc = new ContaCorrente(marialuiza);
		Conta poupanca = new ContaPoupanca(marialuiza);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}