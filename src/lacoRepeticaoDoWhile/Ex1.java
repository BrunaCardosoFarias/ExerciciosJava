package lacoRepeticaoDoWhile;

import java.util.Scanner;

public class Ex1 {

	public Ex1() {
	}

	public static void main(String[] args) {
		int numInt, somaTotal = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			numInt = leia.nextInt();
			if (numInt >= 0) {
				somaTotal = somaTotal + numInt;
			}
		} while (numInt != 0);

		System.out.println("A soma dos números positivos é: " + somaTotal);

	}

}
