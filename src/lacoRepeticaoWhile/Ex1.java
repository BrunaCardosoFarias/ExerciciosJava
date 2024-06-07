package lacoRepeticaoWhile;

import java.util.Scanner;

public class Ex1 {

	public Ex1() {
	}

	public static void main(String[] args) {
		int idade, pessoa21 = 0, pessoa50 = 0, index = 0;
		String[] menores7 = new String[100];

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite uma idade");
		idade = leia.nextInt();

		while (idade >= 0) {
			if (idade < 21) {
				pessoa21 = pessoa21 + 1;
			}
			if (idade > 50) {
				pessoa50 = pessoa50 + 1;
			}
			if (idade < 7) {
				System.out.println("Digite o nome da criança:");
				String nome = leia.next();
				menores7[index] = nome; 
				index++;
			}
			System.out.println("Digite uma idade");
			idade = leia.nextInt();
		}
		System.out.println("Total de pessoas menores de 21 anos: " + pessoa21);
		System.out.println("Total de pessoas maiores de 50 anos: " + pessoa50);
		System.out.println("Nomes das crianças menores de 7 anos:");
	    for (int i = 0; i < index; i++) {
	        System.out.println(menores7[i]);
	}

}}
