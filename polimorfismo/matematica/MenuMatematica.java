package polimorfismo.matematica;

import java.util.Random;
import java.util.Scanner;

public class MenuMatematica {
    public static void menu () {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int op;

        Progressoes PA = new ProgressaoAritmetica();
        Progressoes PG = new ProgressaoGeometrica();
        Progressoes PH = new ProgressaoHarmonica();
        
        do {
            System.out.println("\n\n\nVamos estudar e treinar os conhecimentos adquiridos sobre Progressões!");
            System.out.println("1. Estudar matéria \n2. Exercício 01: Trilha Progressiva do Everest \n3. Exercício 02: Identificação da Progressão \n4 - Sair");
            System.out.print("\nDigite uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();
            
            switch (op) {
                case 1:
                    System.out.println("Você selecionou: Estudar matéria.");
                    System.out.println("Agora iremos estudar o módulo de Progressões, assunto muito importante dentro da matéria de matemática.");
                    System.out.println("\n\n\nOs três principais tipos de progressões existentes dentro da matemática são: ");
                    System.out.println("- Progressão Aritmética;");
                    System.out.println("- Progressão Geométrica;");
                    System.out.println("- Progressão Harmônica.");
                    System.out.println("Agora, estudaremos uma por uma, conhecendo suas principais aplicações e fórmulas.");
                    System.out.print("Deseja prosseguir? (S/N): ");
                    String prosseguir = scanner.nextLine();
                    if (prosseguir.equals("S")) {
                        System.out.println("\n\nAgora, serão apresentadas as definições de cada progressão e suas principais fórmulas.");
                        System.out.println("\n- Progressão Aritmética:");
                        PA.mostrarDefinicao();
                        System.out.println("As principais fórmulas de uma progressão aritmética são a do cálculo do Termo Geral e a Soma dos Termos: ");
                        System.out.println("\nTermo geral:      an = a1 + (n - 1) * r");
                        System.out.println("Em que: 'an' é o termo geral, 'a1' é o primeiro termo, 'n' representa o número de termos e 'r' é a razão.");
                        System.out.println("A razão em uma PA é a diferença constante entre termos consecutivos da sequência. Em outras palavras, é o valor que se adiciona a um termo para obter o seguinte.");
                        System.out.println("\nSoma dos n termos: Sn = (a1 + an) * n / 2");
                        System.out.println("Em que: 'Sn' é a soma dos termos, 'a1' é o primeiro termo, 'an' é o termo geral e 'n' representa o número de termos.");

                        System.out.println("\n\n\n- Progressão Geométrica:");
                        PG.mostrarDefinicao();
                        System.out.println("As principais fórmulas de uma progressão geométrica são a do cálculo do Termo Geral e a Soma dos Termos: ");
                        System.out.println("\nTermo geral:      an = a1 * q^(n - 1)");
                        System.out.println("Em que: 'an' é o termo geral, 'a1' é o primeiro termo, 'n' representa o número de termos e 'q' é a razão.");
                        System.out.println("A razão em uma PG é o fator constante pelo qual se multiplica um termo por outro para obter o seguinte.");
                        System.out.println("\nSoma dos n termos: Sn = a1 * (q^n - 1) / (q - 1)");
                        System.out.println("Em que: 'Sn' é a soma dos termos, 'a1' é o primeiro termo, 'n' representa o número de termos e 'q' é a razão.");

                        System.out.println("\n\n\n- Progressão Harmônica:");
                        PH.mostrarDefinicao();
                        System.out.println("As principais fórmulas de uma progressão harmônica são a do cálculo do Termo Geral e a Soma dos Termos: ");
                        System.out.println("\nTermo geral:      an = 1 / (a1 + (n - 1) * r)");
                        System.out.println("Em que: 'an' é o termo geral, 'a1' é o primeiro termo, 'n' representa o número de termos e 'r' é a razão.");
                        System.out.println("A razão em uma PH é a diferença constante entre termos consecutivos da sequência. Em outras palavras, é o valor que se adiciona a um termo para obter o seguinte.");
                        System.out.println("\nSoma dos n termos: Sn = (1/q) * ln(((2n - 1) * q + 2a1) / (2a1 - q))");
                        System.out.println("Em que: 'Sn' é a soma dos termos, 'a1' é o primeiro termo, 'n' representa o número de termos e 'q' é a razão.");

                        
                    } else {
                        System.out.println("Programa encerrado.");
                        break;
                    }
                    
                break;
                case 2:
                    System.out.println("Você selecionou: Exercício 01 - Trilha Progressiva do Everest");
                    System.out.println("Neste exercício, você deverá calcular os problemas de PA e PG para conseguir alcançar o topo do Monte Everest. \nLeia atentamente cada questão e digite o resultado final da equação. O resultado final será a quantidade de quilômetros que você subirá no monte, caso tenha acertado. ");
                    int questao1 = random.nextInt(2) + 1;
                    int questao2 = random.nextInt(2) + 1;
                    int questao3 = random.nextInt(2) + 1;

                    switch (questao1) {
                        case 1:
                        
                        break;
                        case 2:
                        
                        break;
                    }

                    
                break;
                case 3:
                    
                break;
                case 4:
                    System.out.println("Você selecionou: Sair.");
                    System.out.println("Programa encerrado.");
                break;
                default:
                    System.out.println("Opção Inválida.");
                    System.out.println("--------------------------------------------");
                break;
            }

        } while (op != 4);

        scanner.close();
    }
}
