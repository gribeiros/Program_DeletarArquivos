package aplication;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int b = 0;
		Scanner sc = new Scanner(System.in);

		String local = sc.nextLine();
		File file = new File(local);

		System.out.println("Local: " + file.getPath());
		System.out.println();
		System.out.print("Deseja excluir arquivo (y/n):");
		char a = sc.next().charAt(0);
		try {
			while (b == 0) {
				if (a == 'y') {
					file.delete();
					b++;
					System.out.println("Apagado");
				} else if (a == 'n') {
					System.out.println("Finish");
					b++;
				} else {
					System.out.print("Entre com um valor valido:");
					a = sc.next().charAt(0);
				}

			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}
