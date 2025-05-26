package polimorfismo;

import java.nio.file.attribute.AttributeView;
import java.util.Scanner;

import polimorfismo.matematica.ProgressaoHarmonica;

import polimorfismo.fisica.*;

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
        System.out.print("Escolha um tema sobre biologia celular para estudar: \n" + 
                            "1. Complexo de Golgi\n" +
                            "2. Lisossomo\n" +
                            "3. Mitocôndria\n" +
                            "4. Núcleo\n" +
                            "5. Organelas Celulares\n" +
                            "6. Retículo Endoplasmático Liso\n" +
                            "7. Retículo Endoplasmático Rugoso\n" +
                            "8. Ribossomo\n" +
                            "0. Sair\n" +
                            "\nSelecione uma opção: ");
        int op = scanner.nextInt();

        switch (op) {
            case 0:
                
                break;
        
            default:
                break;
        }
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
