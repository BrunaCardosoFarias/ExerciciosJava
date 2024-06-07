package lacoRepeticaoFor;

import java.util.Scanner;

public class Ex1 {

	public Ex1() {
	}

	public static void main(String[] args) {
		int num1, num2;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo:");
		num1 = leia.nextInt();
		System.out.println("Digite o último  número do intervalo:");
		num2 = leia.nextInt();

		 if (num1 >= num2) {
		        System.out.println("Intervalo inválido!");
		    } else {
	            System.out.println("No intervalo entre " + num1 + " e " + num2 + ": ");
		        for (int i = num1; i <= num2; i++) {
		            if (i % 3 == 0 && i % 5 == 0) {
		                System.out.println(i + " é múltiplo de 3 e 5");
		            }else if (i % 9 == 0) {
		                System.out.println(i + " é múltiplo de 9");

		            }
		        }
		        
	}   
          
	}}
