package projetos.projeto.banco;

import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		Conta conta1 = new Conta("Pedro", 5000);
		Conta conta2 = new Conta("João", -27);

		conta1.imprime();
		conta2.imprime();

		Scanner input = new Scanner(System.in);

		System.out.printf("\nInforme o valor para depositar na conta1: ");
		double quantidadeDeposito1 = input.nextDouble();
		System.out.printf("%nAdicionando $%.2f na conta1", quantidadeDeposito1);
		conta1.deposita(quantidadeDeposito1);
		System.out.println("\n\n");

		System.out.printf("Informe o valor para depositar na conta2: ");
		double quantidadeDeposito2 = input.nextDouble();
		System.out.printf("%nAdicionando $%.2f na conta2%n%n", quantidadeDeposito2);
		conta2.deposita(quantidadeDeposito2);
		
		input.close();
		
		conta1.imprime();
		conta2.imprime();
	}

}
