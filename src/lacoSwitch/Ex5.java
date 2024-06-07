package lacoSwitch;

import java.util.Scanner;

public class Ex5 {

	public Ex5() {
	}

	public static void main(String[] args) {
		 int opcao = 0;
		    int valor,preco = 0, quantidade;
		    String produto = null;
		    
		    Scanner leia = new Scanner(System.in);
		    System.out.println( " Código do produto : " );
		    opcao = leia.nextInt();
		    System.out.println( " Quantidade : " );
		    quantidade = leia.nextInt();
		 
		    
		    switch (opcao) {    
		    case 1: 
		    	  produto = "Cachorro Quente";	          	      
			      preco = 10;       
			     
		    	break;
		    case 2: 
		    	  produto = "X-Salada";	        
			      preco = 15;
			     
		  	break;
		    case 3: 
		    	  produto = "X-Bacon";	    	      
			      preco = 18;
			      
		  	break;
		    case 4: 
		    	  produto = "Bauru";
			      preco = 12;
		  	break;
		    case 5: 
		    	  produto = "Refrigerante";
			      preco = 8;
		  	break;
		    case 6: 
		    	  produto = "Suco de laranja";
			      preco = 13;
		  	break;    
		    } 
		    valor = preco * quantidade; 
		    System.out.println( " Produto : " + produto );	      
		    System.out.println( " Valor total : " + valor );

	}

}
