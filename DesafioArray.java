package Arrays;

import java.util.Scanner;

public class DesafioArray {
		
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas:");
		int qtdNotas = entrada.nextInt();
		
		double [] notas = new double [qtdNotas];
		
		for (int i = 0; i < notas.length; i++ ) {
			System.out.println("Imforme as notas " + (i + 1) + " : ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total =+ nota;
		}
		double media = total / notas.length;
		System.out.println("Amédia é " + media + "!");
		
		entrada.close();
	
	}

}
