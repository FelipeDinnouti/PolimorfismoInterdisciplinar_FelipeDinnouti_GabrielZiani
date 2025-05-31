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
            System.out.println("1. Estudar matéria \n2. Exercício: Trilha Progressiva do Everest \n3. Verificador de Progressão \n4 - Sair");
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
                    System.out.println("Neste exercício, você deverá calcular os problemas de PA e PG para conseguir alcançar o topo do Monte Everest. \nLeia atentamente cada questão e digite o resultado final da equação. O resultado final será a quantidade de metros que você subirá no monte, caso tenha acertado. ");
                    int questao1 = random.nextInt(2) + 1;
                    int questao2 = random.nextInt(2) + 1;
                    int questao3 = random.nextInt(2) + 1;
                    int soma = 0;

                    switch (questao1) {
                        case 1:
                            System.out.println("\nSabendo que o primeiro termo de uma PA é 3 e a razão é 5, qual é o 10º termo (n = 10)?");
                            System.out.print("Digite a resposta: ");
                            int resposta1 = scanner.nextInt();

                            
                            if (resposta1 == 48) {
                                System.out.println("Resposta correta!");
                                System.out.println("+48 metros escalados.");
                                soma = soma + resposta1;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: 48.");
                            }
                        break;
                        case 2:
                            System.out.println("\nQual é a soma dos 20 primeiros termos da PA em que a1 = 2 e a razão é 3 (n = 20)?");
                            System.out.print("Digite a resposta: ");
                            resposta1 = scanner.nextInt();
        
                            if (resposta1 == 610) {
                                System.out.println("Resposta correta!");
                                System.out.println("+610 metros escalados.");
                                soma = soma + resposta1;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: 610.");
                            }
                        break;
                    }

                    switch (questao2) {
                        case 1:
                            System.out.println("\nQual é o 5º termo da PG onde a1 = 2 e a razão é 3 (n = 5)?");
                            System.out.print("Digite a resposta: ");
                            int resposta2 = scanner.nextInt();
        
                            if (resposta2 == 162) {
                                System.out.println("Resposta correta!");
                                System.out.println("+162 metros escalados.");
                                soma = soma + resposta2;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: 162.");
                            }
                        break;
                        case 2:
                            System.out.println("\nCalcule a soma dos 4 primeiros termos da PG com a1 = 1 e q = 2.");
                            System.out.print("Digite a resposta: ");
                            resposta2 = scanner.nextInt();
        
                            if (resposta2 == 15) {
                                System.out.println("Resposta correta!");
                                System.out.println("+15 metros escalados.");
                                soma = soma + resposta2;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: 15.");
                            }
                        break;
                    }

                    switch (questao3) {
                        case 1:
                            System.out.println("\nQual é o 150º termo da PA em que o primeiro termo é 25 e a razão é 30 (n = 150)?");
                            System.out.print("Digite a resposta: ");
                            int resposta3 = scanner.nextInt();
        
                            if (resposta3 == 4495) {
                                System.out.println("Resposta correta!");
                                System.out.println("+4495 metros escalados.");
                                soma = soma + resposta3;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: 4495.");
                            }
                        break;
                        case 2:
                            System.out.println("\nQual é o 7º termo da PG em que o primeiro termo é 3 e a razão é 4 (n = 7)?");
                            System.out.print("Digite a resposta: ");
                            resposta3 = scanner.nextInt();
        
                            if (resposta3 == 12288) {
                                System.out.println("Resposta correta!");
                                System.out.println("+12288 metros escalados.");
                                soma = soma + resposta3;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: 12288.");
                            }
                        break;
                    }

                    System.out.println("\n\nMetros escalados: " + soma);
                    if (soma >= 8849) {
                        System.out.println("Parabéns! Você atingiu o topo do Monte Everest!");
                    }
                    else {
                        System.out.println("Infelizmente você não conseguiu alcançar o topo do Monte Everest, mas chegou muito perto, parabéns!");
                    }

                break;
                case 3:
                    System.out.println("Você selecionou: Verificador de Progressão. ");
                    System.out.println("Neste exercício, você poderá verificar se seus cálculos relacionados a progressões estão corretos! \nVocê deverá selecionar o tipo de progressão, qual tipo de cálculo deseja executar e os valores necessários.");
                    
                    System.out.print("\nQual o tipo de progressão relacionado ao seu cálculo? (Para Aritmética: '1' / Para Geométrica: '2' / Para Harmônica: '3'): ");
                    int tipoProgressao = scanner.nextInt();
                    
                    switch (tipoProgressao) {
                        case 1:
                            System.out.print("Digite o tipo de cálculo realizado (Cálculo do Termo Geral: '1' / Soma dos Termos: '2'): ");
                            int tipoCalculo = scanner.nextInt();

                            switch (tipoCalculo) {
                                case 1:
                                    System.out.print("\nDigite o primeiro termo: ");
                                    PA.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    PA.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    int numTermos = scanner.nextInt();
                                    System.out.print("Agora, digite qual o resultado do Termo Geral obtido em seus cálculos: ");
                                    int resultado = scanner.nextInt();

                                    if (PA.calcularTermoGeral(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! O Termo Geral dessa progressão é "+ PA.calcularTermoGeral(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor do Termo Geral é " + PA.calcularTermoGeral(numTermos) + ".");
                                    }
                                break;
                                case 2:
                                    System.out.print("\nDigite o primeiro termo: ");
                                    PA.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    PA.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    numTermos = scanner.nextInt();
                                    PA.calcularTermoGeral(numTermos);
                                    System.out.print("Agora, digite qual o resultado da Soma dos Termos obtido em seus cálculos: ");
                                    resultado = scanner.nextInt();

                                    if (PA.calcularSomaDosTermos(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! A Soma dos Termos dessa progressão é "+ PA.calcularSomaDosTermos(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor da Soma dos Termos é " + PA.calcularSomaDosTermos(numTermos) + ".");
                                    }
                                break;
                            
                                default:
                                break;
                            }
                        break;
                        case 2:
                            System.out.print("Digite o tipo de cálculo realizado (Cálculo do Termo Geral: '1' / Soma dos Termos: '2'): ");
                            tipoCalculo = scanner.nextInt();

                            switch (tipoCalculo) {
                                case 1:
                                    System.out.print("\nDigite o primeiro termo: ");
                                    PG.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    PG.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    int numTermos = scanner.nextInt();
                                    System.out.print("Agora, digite qual o resultado do Termo Geral obtido em seus cálculos: ");
                                    int resultado = scanner.nextInt();

                                    if (PG.calcularTermoGeral(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! O Termo Geral dessa progressão é "+ PG.calcularTermoGeral(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor do Termo Geral é " + PG.calcularTermoGeral(numTermos) + ".");
                                    }
                                break;
                                case 2:
                                    System.out.print("\nDigite o primeiro termo: ");
                                    PG.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    PG.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    numTermos = scanner.nextInt();
                                    System.out.print("Agora, digite qual o resultado da Soma dos Termos obtido em seus cálculos: ");
                                    resultado = scanner.nextInt();

                                    if (PG.calcularSomaDosTermos(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! A Soma dos Termos dessa progressão é "+ PG.calcularSomaDosTermos(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor da Soma dos Termos é " + PG.calcularSomaDosTermos(numTermos) + ".");
                                    }
                                break;
                            
                                default:
                                break;
                            }
                        break;
                        case 3:
                            System.out.print("Digite o tipo de cálculo realizado (Cálculo do Termo Geral: '1' / Soma dos Termos: '2'): ");
                            tipoCalculo = scanner.nextInt();

                            switch (tipoCalculo) {
                                case 1:
                                    System.out.print("\nDigite o primeiro termo: ");
                                    PH.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    PH.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    int numTermos = scanner.nextInt();
                                    System.out.print("Agora, digite qual o resultado do Termo Geral obtido em seus cálculos: ");
                                    int resultado = scanner.nextInt();

                                    if (PH.calcularTermoGeral(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! O Termo Geral dessa progressão é "+ PH.calcularTermoGeral(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor do Termo Geral é " + PH.calcularTermoGeral(numTermos) + ".");
                                    }
                                break;
                                case 2:
                                    System.out.print("\nDigite o primeiro termo: ");
                                    PH.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    PH.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    numTermos = scanner.nextInt();
                                    System.out.print("Agora, digite qual o resultado da Soma dos Termos obtido em seus cálculos: ");
                                    resultado = scanner.nextInt();

                                    if (PH.calcularSomaDosTermos(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! A Soma dos Termos dessa progressão é "+ PH.calcularSomaDosTermos(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor da Soma dos Termos é " + PH.calcularSomaDosTermos(numTermos) + ".");
                                    }
                                break;
                            
                                default:
                                break;
                            }
                        break;
                        default:
                            System.out.println("Opção Inválida.");
                        break;
                    }

                break;
                case 4:
                    System.out.println("Você selecionou: Sair.");
                    System.out.println("Programa encerrado.");
                break;
                default:
                    System.out.println("Opção Inválida.");
                break;
            }

        } while (op != 4);

        scanner.close();
    }
}
