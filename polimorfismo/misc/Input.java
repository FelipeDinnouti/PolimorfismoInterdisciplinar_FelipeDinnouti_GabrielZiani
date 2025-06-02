package polimorfismo.misc;

import polimorfismo.misc.MyColor;
import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);
	public static int readInt() {
		int result = -1;

		// Tratamento de exceções
		try {
			result = scanner.nextInt();
		} catch(Exception e) {
			System.out.println(MyColor.ANSI_RED + "Input Inválido\n" + MyColor.ANSI_RESET);
		} finally {
			scanner.nextLine();
		}

		return result;
	}
	public static float readFloat() {
		float result = 0.0f;
		
		try {
			result = scanner.nextFloat();
		} catch(Exception e) {
			System.out.println(MyColor.ANSI_RED + "Input Inválido\n" + MyColor.ANSI_RESET);
		} finally { // Usando o nextInt ou nextFloat sobra um newline (\n) e ai tem que compensar por ele
			scanner.nextLine();
		}


		return result;
	}
	public static String readLine() {
		String result = "";
		
		try {
			result = scanner.nextLine().trim();
		} catch(Exception e) {
			System.out.println(MyColor.ANSI_RED + "Input Inválido" + MyColor.ANSI_RESET);
		}

		return result;
	}
	// Função simples pra que o usuário digite qualquer coisa antes de passar para um próximo estágio qualquer.
	public static void confirmar() {
		System.out.print("Pressione enter para prosseguir...");
		scanner.nextLine();
		System.out.print("\n");
	}
}