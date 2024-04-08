package conta_banco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		// criação do objeto Scanner para entrada de dados do usuário
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite o número da Agência! ");
		int num_Agencia = sc.nextInt();

		System.out.println("Por favor, digite sua Agência! ");
		String agencia = sc.next();

		System.out.println("Digite seu nome: ");
		String nomeCliente = sc.next();

		double saldo = 237.48;

		System.out.println("Olá " + nomeCliente + 
				", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia
				+ ", conta " + num_Agencia + " e seu saldo " + saldo +
				" já está disponível " + "para saque. ");

	}

}