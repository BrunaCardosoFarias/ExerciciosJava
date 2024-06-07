package lacoCondicional;

import java.util.Scanner;

public class Ex2 {

	public Ex2() {

	}

	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);
		
	    System.out.println( " Digite um número : " );
	      numero = leia.nextInt();
	      
	      if (numero > 0 && numero %2 == 0) {
	  	    System.out.printf( " O número %d é par e postivo", numero );	    	  
	      }else if(numero > 0 && numero % 2 != 0) {
		  	    System.out.printf( " O número %d é ímpar e postivo", numero );	
		  	    
	      }else if(numero < 0 && numero % 2 != 0) {
		  	    System.out.printf( " O número %d é ímpar e negativo", numero );	     	  
		    	  
	      }else {
		  	    System.out.printf( " O número %d é par e negativo", numero );	    	  

	      }

	}

}
