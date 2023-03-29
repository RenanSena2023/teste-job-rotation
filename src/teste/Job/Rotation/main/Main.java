package teste.Job.Rotation.main;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		System.out.println("digite uma palavra:");
		String str = read.nextLine();

		int x = str.length();
		char[] n = new char[x];

		for (int i = 0; i < x; i++) {
			n[x - i - 1] = str.charAt(i);

		}

		String str2 = String.copyValueOf(n);
		System.out.println(str2);

	}
}