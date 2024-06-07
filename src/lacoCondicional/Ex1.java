package lacoCondicional;

import java.util.Scanner;

public class Ex1 {

	public Ex1() {
		
	}

	public static void main(String[] args) {
		int A, B, C, soma;
	     double media;
	     
	      Scanner leia = new Scanner(System.in);
	      

	      System.out.println( " Digite o número de A : " );
	      A = leia.nextInt();
	      System.out.println( " Digite o número de B : " );
	      B = leia.nextInt();
	      System.out.println( " Digite o número de C : " );
	      C = leia.nextInt();
	      
	      soma = A + B;
	      media = soma/3;
	      
	      if (soma > C) {
		      System.out.println( A + "+ " + B  + " > " + C + "  \nA soma de A + B é maior que C" );	    	  
	      } else if (soma < C){
		      System.out.println( A + "+ " + B  + " < " + C + " \nA soma de A + B é menor que C" ); 	  
	      }else {
		      System.out.println( A + "+ " + B  + " = " + C + " \nA soma de A + B é igual a C" ); 	 	    	  
	      }
	      
	      System.out.println( "A média dos valores de A, B e C : " + media );

	

	}

}
