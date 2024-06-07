package lacoCondicional;

import java.util.Scanner;

public class Ex4 {

	public Ex4() {
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        System.out.println("Digite três características : ");
        String cara1 = leia.next();
        String cara2 = leia.next();
        String cara3 = leia.next();

        if (cara1.equalsIgnoreCase("vertebrado")) {
            if (cara2.equalsIgnoreCase("ave")) {
                if (cara3.equalsIgnoreCase("carnívoro")) {
                    System.out.println("Águia");
                } else if (cara3.equalsIgnoreCase("onívoro")) {
                    System.out.println("Pomba");
                }
            } else if (cara2.equalsIgnoreCase("mamífero")) {
                if (cara3.equalsIgnoreCase("onívoro")) {
                    System.out.println("Homem");
                } else if (cara3.equalsIgnoreCase("herbívoro")) {
                    System.out.println("Vaca");
                }
            }
        } else if (cara1.equalsIgnoreCase("invertebrado")) {
            if (cara2.equalsIgnoreCase("inseto")) {
                if (cara3.equalsIgnoreCase("hematófago")) {
                    System.out.println("Pulga");
                } else if (cara3.equalsIgnoreCase("herbívoro")) {
                    System.out.println("Lagarta");
                }
            } else if (cara2.equalsIgnoreCase("anelídeo")) {
                if (cara3.equalsIgnoreCase("hematófago")) {
                    System.out.println("Sanguessuga");
                } else if (cara3.equalsIgnoreCase("onívoro")) {
                    System.out.println("Minhoca");
                }
            }
        } else {
            System.out.println("Opção não disponível");
        }
	}

}
