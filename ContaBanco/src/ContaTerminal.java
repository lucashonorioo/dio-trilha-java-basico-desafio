import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("------ Seja Bem-vindo ao Banco! -------");
		
		System.out.print("Por favor, digite o número da Agência: ");
		agencia = sc.next();
		
		System.out.print("Insira o numero da sua conta: ");
		numero = sc.nextInt();
		
		System.out.print("Insira seu nome: ");
		sc.nextLine();
		nomeCliente = sc.nextLine();
		
		System.out.print("Insira o valor do seu saldo inicial: ");
		saldo = sc.nextDouble();
		
		System.out.println();
		System.out.println("----- Resumo das suas informações ------");
		System.out.println();
		
		System.out.println(" Olá " + nomeCliente + ", obrigado por criar uma conta no nosso banco, sua agência é: " + agencia 
				+ ",\n Conta: " + numero + " e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque!");
		
		System.out.println();
		System.out.println("------------------------------------- ");
		
		sc.close();
	}

}
