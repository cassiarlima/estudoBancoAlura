
public class TestaMetodos {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo= 50;
		conta.deposita(100);
		
		System.out.println(conta.saldo); //validando o metodo de deposito
		
	
		boolean conseguiuRetirar = conta.saca(20); //validando o metodo de saque
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
	
	}
}
