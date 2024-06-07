package lacoCondicional;

import java.util.Scanner;

public class Ex3 {

	public Ex3() {
	}

	public static void main(String[] args) {
		 String nome;
		    int idade;
		    boolean PrimeiraDoacao = true;
		    
		    Scanner leia = new Scanner(System.in);
		    
		    System.out.println( " Digite o Nome do doador : " );
		    nome = leia.next();
		    System.out.println( " Digite a Idade do doador : " );
		    idade = leia.nextInt();
		    System.out.println( " Primeira doação de sangue? " );
		    PrimeiraDoacao = leia.nextBoolean();
		    
		    
		    if(idade >= 18 && idade <60) {
		        System.out.printf( "%s está Apto para doar sangue ", nome );    	
		    }else if (idade >= 60 && idade <= 69 && !PrimeiraDoacao ) {
		        System.out.printf( "%s está Apto para doar sangue ", nome );     	
		    }else {
		        System.out.printf( "%s não está Apto para doar sangue ", nome );           

		    }
		    
	}

}
