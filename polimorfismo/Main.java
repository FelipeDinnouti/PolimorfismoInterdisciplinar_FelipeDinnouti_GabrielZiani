package polimorfismo;

import java.nio.file.attribute.AttributeView;
import java.util.Scanner;

import polimorfismo.matematica.ProgressaoHarmonica;
import polimorfismo.biologia.MenuBiologia;
import polimorfismo.fisica.MenuFisica;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static int escolherMateria() {
        System.out.print("Bem vindo ao sistema educional Zabriel Giani! Matérias disponíveis\n" + 
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
