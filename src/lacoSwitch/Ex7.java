package lacoSwitch;

import java.util.Scanner;

public class Ex7 {

	public Ex7() {
	}

	public static void main(String[] args) {
		float num1, num2,opera = 0;
		int operacao;
		char x = 0;
	    
		
	    Scanner leia = new Scanner(System.in);
	    System.out.println( " Digite o 1º número : " );
	    num1 = leia.nextFloat();
	    System.out.println( " Digite o 2º número : " );
	    num2 = leia.nextFloat();
        System.out.println("Operação (1: soma, 2: subtração, 3: multiplicação, 4: divisão): ");
	    operacao = leia.nextInt();
	    
	  
		switch (operacao) {
	    
	    case 1:	   
	    	x= '+';
            opera = num1 + num2;
	    	break;
	    case 2:	
	    	x= '-';
            opera = num1 - num2;
	    	break;
	    case 3:	
	    	x= '*';
            opera = num1 * num2;
	    	break;
	    case 4:	 
	    	  x = '/';
              if (num2 != 0) {
                  opera = num1 / num2;
              } else {
                  System.out.println("Divisão por zero não é permitida");
                  return; 
              }
              break;
	    default:      
	    	System.out.println("Opção inválida");           
            return;
	    }
	    
		System.out.printf("Resultado: %.2f %c %.2f = %.2f%n", num1, x, num2, opera);

	}

}
