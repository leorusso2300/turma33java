package app;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEmpresa;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class TesteConta {
	public static void main(String[] args) {

		// variáveis
		Scanner in = new Scanner(System.in);
		char contaEscolhida = ' ';
		char movimentoEscolhido = ' ';
		double valorMovimento = 0.00;

		ContaPoupanca cp1 = new ContaPoupanca(32, "2141234", 1300, true, 7);
		ContaCorrente cc1 = new ContaCorrente(2, "435654", 1700, true, 0);
		ContaEmpresa cemp1 = new ContaEmpresa(3, "5653634", 0, true, 5000);
		ContaEstudantil cest1 = new ContaEstudantil(4, "5466858", 0, true, 500);
		ContaEspecial cesp1 = new ContaEspecial(5, "45323254", 0, true, 2000);

		System.out.println("DevPag");
		System.out.println("O banco do dev");
		System.out.println("\n");

		System.out.println("1 - CONTA POUPANÇA");
		System.out.println("2 - CONTA CORRENTE");
		System.out.println("3 - CONTA ESPECIAL");
		System.out.println("4 - CONTA EMPRESA");
		System.out.println("5 - CONTA ESTUDANTIL");
		System.out.println("6 - SAIR");
		System.out.println("\n");
		System.out.print("Digite o código da opção desejada: ");
		contaEscolhida = in.next().charAt(0);

		if (contaEscolhida == '1') {
			System.out.println("\n");
			System.out.println("DevPag");
			System.out.println("O banco do dev");
			System.out.println("\n");
			System.out.println(cp1.getNumero() + " CONTA POUPANÇA");

			System.out.println("Saldo atual: " + cp1.getSaldo());
			System.out.println("\nMovimento \n D - Débito \n C - Crédito");
			movimentoEscolhido = in.next().charAt(0);
			System.out.println("\nDigite o dia de hoje: ");
			int diaAtual = in.nextInt();
			if (movimentoEscolhido == 'c') {
				System.out.println("\nValor do movimento: ");
				valorMovimento = in.nextDouble();

				cp1.credito(valorMovimento);
				cp1.correcao(diaAtual);
				System.out.println("Saldo corrigido é de R$" + cp1.getSaldo());

			} else if (movimentoEscolhido == 'd') {
				System.out.println("\nValor do movimento: ");
				valorMovimento = in.nextDouble();
				cp1.debito(valorMovimento);
				System.out.println("Saldo corrigido é de R$" + cp1.getSaldo());

			}

		} else if (contaEscolhida == '2') {
			System.out.println("\n");
			System.out.println("DevPag");
			System.out.println("O banco do dev");
			System.out.println("\n");
			System.out.println(cc1.getNumero() + " CONTA CORRENTE");

			System.out.println("Saldo atual: " + cc1.getSaldo());

			int controle = 0;
			while (controle < 3) {
				System.out.println("\nMovimento \n D - Débito \n C - Crédito");
				movimentoEscolhido = in.next().charAt(0);
				System.out.println("\nValor do movimento: ");
				valorMovimento = in.nextDouble();
				if (movimentoEscolhido == 'd') {
					cc1.debito(valorMovimento);
					System.out.println("Saldo atual: " + cc1.getSaldo());
					System.out.println("Quer continuar? \nS - Sim \nN - Não");
					char continuar = in.next().charAt(0);
					if (continuar == 'n') {
						break;
					} else if (continuar == 's') {
						controle++;
					}
				} else if (movimentoEscolhido == 'c') {
					cc1.credito(valorMovimento);
					System.out.println("Saldo atual: " + cc1.getSaldo());
					System.out.println("Quer continuar? \nS - Sim \nN - Não");
					char continuar = in.next().charAt(0);
					if (continuar == 'n') {
						break;
					} else if (continuar == 's') {
						controle++;
					}
				}
			}
			System.out.println("Deseja solicitar cheque? ");
			char solicitarCheque = in.next().charAt(0);
			if (solicitarCheque == 's') {
				System.out.println("Qual a quantidade?");
				int quantidadeTalao = in.nextInt();
				cc1.pediTalao(quantidadeTalao);
				System.out.println(cc1.toString());
			}
		}
	}
}
