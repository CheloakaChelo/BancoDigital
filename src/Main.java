public class Main {
    public static void main(String[] args) throws Exception {
        Cliente chelo = new Cliente();
		chelo.setNome("Chelo");
		
		Conta cc = new ContaCorrente(chelo);
		Conta poupanca = new ContaPoupanca(chelo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
