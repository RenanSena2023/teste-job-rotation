package teste.Job.Rotation.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		final int INDICE = 13;
		int soma = 0, k = 0;

		for (int i = k; i < INDICE; i++) {

			k++;
			soma += k;
		}
		System.out.println("Resultado da Soma: " + soma);

	}

}
