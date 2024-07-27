package projetos.projeto.banco;
/*Projeto de conta simples;
Feito por Wellyton no dia 27/07/2024;
*/


public class Conta {
	private String nome;
	private double saldo;

	public Conta(String nome, double saldo) {
		this.nome = nome;

		if (saldo > 0.0) {
			this.saldo = saldo;
		}
	}

	public void imprime() {
		System.out.printf("%s saldo: $%.2f %n", getNome(), getSaldo());

	}

	public void deposita(double quantidadeDeposito) {

		if (quantidadeDeposito > 0.0) {
			saldo = saldo + quantidadeDeposito;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
