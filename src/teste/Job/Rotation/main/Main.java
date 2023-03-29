package teste.Job.Rotation.main;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int a = 0, b = 1, c = 0;

		System.out.println("Digite um valor: ");
		int n = read.nextInt();

		for (int i = 0; i < n; i++) {

			a = a + b;
			b = a - b;

			System.out.println(a);
			if (a == n) {
				c = a;
				break;
			} else if (a > n) {
				break;
			}

		}

		System.out.println();
		if (c > 0) {
			System.out.println(n + " Se encontra na sequência de fibonacci!");
		} else {
			System.out.println(n + " Não se encontra na sequência de fibonacci!");

		}

	}
}