package lacoSwitch;

import java.util.Scanner;

public class Ex8 {

	public Ex8() {
	}

	public static void main(String[] args) {
		int operacao;
		float valor, saldo = 0;
		String nomeOperacao;

		Scanner leia = new Scanner(System.in);

		while(true) {
		System.out.println("Operação :  (Digite 4 para sair) ");
		operacao = leia.nextInt();		

		  if (operacao > 4) {
            System.out.println("Opção não disponível");
            break;             
 
        }
		
		  if (operacao == 4) {
              System.out.println("Encerrando o programa.");
              break;             
   
          }
		    System.out.println("Valor : ");
      		valor = leia.nextFloat();

		switch (operacao) {
		case 1:
			nomeOperacao = "Saldo";
			saldo += valor;
			System.out.println("Saldo: R$" + saldo);
			break;
		case 2:
			nomeOperacao = "Saque";
			if (valor > saldo) {
				System.out.println("Saldo insuficiente!");
			} else {
				saldo -= valor;
				System.out.println("Saldo: R$" + saldo);
			}
			break;
		case 3:
			nomeOperacao = "Depósito";
			saldo += valor;
			System.out.println("Novo Saldo: " + saldo);
			break;
			default: 
				System.out.println("Operação Inválida");
				return;

		}}

	}

}
