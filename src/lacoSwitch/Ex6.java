package lacoSwitch;

import java.util.Scanner;

public class Ex6 {

	public Ex6() {
	}

	public static void main(String[] args) {
		String nome, NomeCargo = "";
		int cargo;
		float salario, SalarioAjustado, reajuste = 0;
		
		Scanner leia = new Scanner(System.in);
		
	    System.out.println( " Nome do colaborador : " );
	    nome = leia.next();	    
	    System.out.println( " Código do Cargo do Colaborador : " );
	    cargo = leia.nextInt();
	    System.out.println( " Salário do Colaborador : " );
	    salario = leia.nextFloat();

	     switch(cargo) {
	     case 1:
	    	 NomeCargo = "Gerente";
	    	 reajuste =  0.1f;
	     case 2:
	    	 NomeCargo = "Vendedor";
	    	 reajuste = 0.07f;
	     case 3:
	    	 NomeCargo = "Supervisor";
	    	 reajuste = 0.09f;
	     case 4:
	    	 NomeCargo = "Motorista";
	    	 reajuste = 0.06f;
	     case 5:
	    	 NomeCargo = "Estoquista";
	    	 reajuste = 0.05f;
	     case 6:
	    	 NomeCargo = "Técnico de TI";
	    	 reajuste = 0.08f;
	     }
	     
	    
	    SalarioAjustado = salario + (reajuste  * salario);

	    System.out.println( " Nome do Colaborador : " + nome );
	    System.out.println( " Salário do Colaborador : " + SalarioAjustado);
	    System.out.println( " Cargo do Colaborador : " + NomeCargo );

	}

}
