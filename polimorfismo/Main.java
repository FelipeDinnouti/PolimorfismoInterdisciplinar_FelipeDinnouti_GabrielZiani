package polimorfismo;

import java.nio.file.attribute.AttributeView;
import java.util.Scanner;

import polimorfismo.matematica.ProgressaoHarmonica;
import polimorfismo.biologia.MenuBiologia;
import polimorfismo.fisica.MenuFisica;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static Scanner scanner = new Scanner(System.in);
    
    public static int escolherMateria() {
        System.out.print("Bem vindo ao sistema educional" + ANSI_PURPLE + " Zabriel Giani! " + ANSI_RESET + "Matérias disponíveis\n" + 
                            "1. Biologia\n" +
                            "2. Física\n" +
                            "3. Matemática\n" +
                            "0. Sair\n" +
                            "\nSelecione uma opção: ");
        return scanner.nextInt();
    }

    static void biologia() {
        MenuBiologia.menu();
    }
    static void fisica() {
        MenuFisica.menu();
    }
    static void matematica() {

    }
    
    public static void main(String[] args) {

            boolean parar = false;

            do {
                int op = escolherMateria();

                switch (op) {
                    case 1:
                        biologia();
                        break;
                    case 2:
                        fisica();
                        break;
                    case 3:
                        matematica();
                        break;
                    case 0:
                        
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (!parar);
            
    }
}
