package polimorfismo;

import java.nio.file.attribute.AttributeView;
import java.util.Scanner;

import polimorfismo.matematica.MenuMatematica;
import polimorfismo.matematica.ProgressaoHarmonica;
import polimorfismo.biologia.MenuBiologia;
import polimorfismo.fisica.MenuFisica;
import polimorfismo.misc.MyColor;
import polimorfismo.misc.Input;

public class Main {    
    public static int escolherMateria() {
        System.out.print("\n\n\nBem vindo ao sistema educional" + MyColor.ANSI_PURPLE + " Zinnouti! " + MyColor.ANSI_RESET + "Matérias disponíveis\n" + 
                            "1. Biologia\n" +
                            "2. Física\n" +
                            "3. Matemática\n" +
                            "0. Sair\n" +
                            "\n"+ MyColor.ANSI_BLUE + "Selecione uma opção: " + MyColor.ANSI_RESET);
        return Input.readInt();
    }

    static void biologia() {
        MenuBiologia.menu();
    }
    static void fisica() {
        MenuFisica.menu();
    }
    static void matematica() {
        MenuMatematica.menu();
    }
    
    public static void main(String[] args) {
            System.out.println("Iniciando o Programa...");

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
                        parar = true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (!parar);
        
        System.out.println("\n\n\nSaindo...");
        Input.scanner.close();       
    }
}
