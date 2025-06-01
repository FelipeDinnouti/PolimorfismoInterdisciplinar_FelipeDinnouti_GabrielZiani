package polimorfismo.matematica;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MenuMatematica {
    public static void menu () {
        // criação do objeto scanner e random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int op;

        // instanciando objetos utilizando o polimorfismo
        Progressoes PA = new ProgressaoAritmetica(0,0);
        Progressoes PG = new ProgressaoGeometrica(0,0);
        Progressoes PH = new ProgressaoHarmonica(0,0);

        // array lists de cada tipo de progressão para armazenar as progressoes do verificador (opcao 3 do menu)
        ArrayList<ProgressaoAritmetica> listaPA = new ArrayList<>();
        ArrayList<ProgressaoGeometrica> listaPG = new ArrayList<>();
        ArrayList<ProgressaoHarmonica> listaPH = new ArrayList<>();
        
        // loop para o menu
        do {
            System.out.println("\n\n\nVamos estudar e treinar os conhecimentos adquiridos sobre Progressões!");
            System.out.println("1 - Estudar matéria \n2 - Exercício: Trilha Progressiva do Everest \n3 - Verificador de Progressão \n4 - Visualizar progressões registradas \n5 - Sair");
            System.out.print("\nDigite uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();
            
            // switch case baseado na opcao que o usuário digitou
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

                    // verificação se o usuário deseja prosseguir
                    if (prosseguir.equals("S")) {
                        System.out.println("\n\nAgora, serão apresentadas as definições de cada progressão e suas principais fórmulas.");
                        System.out.println("\n- Progressão Aritmética:");

                        // chamando os métodos abstratos para cada tipo de progressão
                        PA.mostrarDefinicao();

                        System.out.println("\n\n\n- Progressão Geométrica:");
                        PG.mostrarDefinicao();

                        System.out.println("\n\n\n- Progressão Harmônica:");
                        PH.mostrarDefinicao();

                    } else {
                        System.out.println("Programa encerrado.");
                        break;
                    }
                    
                break;
                case 2:
                    System.out.println("Você selecionou: Exercício 01 - Trilha Progressiva do Everest");
                    System.out.println("Neste exercício, você deverá calcular os problemas de PA e PG para conseguir alcançar o topo do Monte Everest. \nLeia atentamente cada questão e digite o resultado final da equação. O resultado final será a quantidade de metros que você subirá no monte, caso tenha acertado. ");
                    // utilizando o random para sortear um número entre 1 e 2, que é correspondente à questão que será apresentada para o usuário
                    int questao1 = random.nextInt(2) + 1;
                    int questao2 = random.nextInt(2) + 1;
                    int questao3 = random.nextInt(2) + 1;
                    int soma = 0;

                    // switch case com as questões que serão sorteadas
                    switch (questao1) {
                        case 1:
                            System.out.println("\nSabendo que o primeiro termo de uma PA é 3 e a razão é 5, qual é o 10º termo (n = 10)?");
                            // definindo os atributos utilizados na questão
                            PA.setPrimeiroTermo(3);
                            PA.setRazao(5);
                            double resultado = PA.calcularTermoGeral(10);

                            System.out.print("Digite a resposta: ");
                            int resposta1 = scanner.nextInt();

                            // verifica se a resposta digitada pelo usuário equivale à resposta correta
                            if (resposta1 == resultado) {
                                System.out.println("Resposta correta!");
                                System.out.println("+" +resultado+ " metros escalados.");
                                soma = soma + resposta1;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                            }
                        break;
                        case 2:
                            System.out.println("\nQual é a soma dos 20 primeiros termos da PA em que a1 = 2 e a razão é 3 (n = 20)?");
                            // definindo os atributos utilizados na questão
                            PA.setPrimeiroTermo(2);
                            PA.setRazao(3);
                            resultado = PA.calcularSomaDosTermos(20);

                            System.out.print("Digite a resposta: ");
                            resposta1 = scanner.nextInt();

                            // verifica se a resposta digitada pelo usuário equivale à resposta correta
                            if (resposta1 == resultado) {
                                System.out.println("Resposta correta!");
                                System.out.println("+" +resultado+ " metros escalados.");
                                soma = soma + resposta1;
                            } 
                            else {
                                System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                            }
                        break;
                    }

                    switch (questao2) {
                        case 1:
                            System.out.println("\nQual é o 5º termo da PG onde a1 = 2 e a razão é 3 (n = 5)?");
                            // definindo os atributos utilizados na questão
                            PG.setPrimeiroTermo(2);
                            PG.setRazao(3);
                            double resultado = PG.calcularTermoGeral(5);

                            System.out.print("Digite a resposta: ");
                            int resposta2 = scanner.nextInt();

                            // verifica se a resposta digitada pelo usuário equivale à resposta correta
                            if (resposta2 == resultado) {
                                System.out.println("Resposta correta!");
                                System.out.println("+" +resultado+ " metros escalados.");
                                soma = soma + resposta2;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                            }
                        break;
                        case 2:
                            System.out.println("\nCalcule a soma dos 4 primeiros termos da PG com a1 = 1 e q = 2.");
                            // definindo os atributos utilizados na questão
                            PG.setPrimeiroTermo(1);
                            PG.setRazao(2);
                            resultado = PG.calcularSomaDosTermos(4);

                            System.out.print("Digite a resposta: ");
                            resposta2 = scanner.nextInt();

                            // verifica se a resposta digitada pelo usuário equivale à resposta correta
                            if (resposta2 == resultado) {
                                System.out.println("Resposta correta!");
                                System.out.println("+" +resultado+ " metros escalados.");
                                soma = soma + resposta2;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                            }
                        break;
                    }

                    switch (questao3) {
                        case 1:
                            System.out.println("\nQual é o 150º termo da PA em que o primeiro termo é 25 e a razão é 30 (n = 150)?");
                            // definindo os atributos utilizados na questão
                            PA.setPrimeiroTermo(25);
                            PA.setRazao(30);
                            double resultado = PA.calcularTermoGeral(150);

                            System.out.print("Digite a resposta: ");
                            int resposta3 = scanner.nextInt();

                            // verifica se a resposta digitada pelo usuário equivale à resposta correta
                            if (resposta3 == resultado) {
                                System.out.println("Resposta correta!");
                                System.out.println("+" +resultado+ " metros escalados.");
                                soma = soma + resposta3;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                            }
                        break;
                        case 2:
                            System.out.println("\nQual é o 7º termo da PG em que o primeiro termo é 3 e a razão é 4 (n = 7)?");
                            // definindo os atributos utilizados na questão
                            PG.setPrimeiroTermo(3);
                            PG.setRazao(4);
                            resultado = PG.calcularTermoGeral(7);

                            System.out.print("Digite a resposta: ");
                            resposta3 = scanner.nextInt();

                            // verifica se a resposta digitada pelo usuário equivale à resposta correta
                            if (resposta3 == resultado) {
                                System.out.println("Resposta correta!");
                                System.out.println("+" +resultado+ " metros escalados.");
                                soma = soma + resposta3;
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                            }
                        break;
                    }

                    // mostra a quantidade de metros escalados com base na soma dos resultados corretos digitados pelo usuário, informando se ele atingiu o topo ou não
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
                    
                    // switch case baseado no tipo de progressão
                    switch (tipoProgressao) {
                        case 1:
                            // instancia um objeto para armazenar os dados da progressão a ser verificada
                            ProgressaoAritmetica pa1 = new ProgressaoAritmetica(0,0);
                            System.out.print("Digite o tipo de cálculo realizado (Cálculo do Termo Geral: '1' / Soma dos Termos: '2'): ");
                            int tipoCalculo = scanner.nextInt();

                            // switch case baseado no tipo de cálculo realizado
                            switch (tipoCalculo) {
                                case 1:
                                    // definindo os atributos utilizados na verificação
                                    System.out.print("\nDigite o primeiro termo: ");
                                    pa1.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    pa1.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    int numTermos = scanner.nextInt();
                                    System.out.print("Agora, digite qual o resultado do Termo Geral obtido em seus cálculos: ");
                                    int resultado = scanner.nextInt();
                                    listaPA.add(pa1); // adiciona esse objeto na lista de progressões

                                    // verifica se o resultado digitado pelo usuário equivale ao resultado correto (após a execução dos métodos)
                                    if (pa1.calcularTermoGeral(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! O Termo Geral dessa progressão é "+ pa1.calcularTermoGeral(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor do Termo Geral é " + pa1.calcularTermoGeral(numTermos) + ".");
                                    }
                                break;
                                case 2:
                                    // definindo os atributos utilizados na verificação
                                    System.out.print("\nDigite o primeiro termo: ");
                                    pa1.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    pa1.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    numTermos = scanner.nextInt();
                                    pa1.calcularTermoGeral(numTermos);
                                    System.out.print("Agora, digite qual o resultado da Soma dos Termos obtido em seus cálculos: ");
                                    resultado = scanner.nextInt();
                                    listaPA.add(pa1); // adiciona esse objeto na lista de progressões

                                    // verifica se o resultado digitado pelo usuário equivale ao resultado correto (após a execução dos métodos)
                                    if (pa1.calcularSomaDosTermos(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! A Soma dos Termos dessa progressão é "+ pa1.calcularSomaDosTermos(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor da Soma dos Termos é " + pa1.calcularSomaDosTermos(numTermos) + ".");
                                    }
                                break;
                            
                                default:
                                break;
                            }
                        break;
                        case 2:
                            // instancia um objeto para armazenar os dados da progressão a ser verificada
                            ProgressaoGeometrica pg1 = new ProgressaoGeometrica(0,0);
                            System.out.print("Digite o tipo de cálculo realizado (Cálculo do Termo Geral: '1' / Soma dos Termos: '2'): ");
                            tipoCalculo = scanner.nextInt();

                            // switch case baseado no tipo de cálculo realizado
                            switch (tipoCalculo) {
                                case 1:
                                    // definindo os atributos utilizados na verificação
                                    System.out.print("\nDigite o primeiro termo: ");
                                    pg1.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    pg1.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    int numTermos = scanner.nextInt();
                                    System.out.print("Agora, digite qual o resultado do Termo Geral obtido em seus cálculos: ");
                                    int resultado = scanner.nextInt();
                                    listaPG.add(pg1); // adiciona esse objeto na lista de progressões

                                    // verifica se o resultado digitado pelo usuário equivale ao resultado correto (após a execução dos métodos)
                                    if (pg1.calcularTermoGeral(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! O Termo Geral dessa progressão é "+ pg1.calcularTermoGeral(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor do Termo Geral é " + pg1.calcularTermoGeral(numTermos) + ".");
                                    }
                                break;
                                case 2:
                                    // definindo os atributos utilizados na verificação
                                    System.out.print("\nDigite o primeiro termo: ");
                                    pg1.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    pg1.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    numTermos = scanner.nextInt();
                                    System.out.print("Agora, digite qual o resultado da Soma dos Termos obtido em seus cálculos: ");
                                    resultado = scanner.nextInt();
                                    listaPG.add(pg1); // adiciona esse objeto na lista de progressões

                                    // verifica se o resultado digitado pelo usuário equivale ao resultado correto (após a execução dos métodos)
                                    if (pg1.calcularSomaDosTermos(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! A Soma dos Termos dessa progressão é "+ pg1.calcularSomaDosTermos(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor da Soma dos Termos é " + pg1.calcularSomaDosTermos(numTermos) + ".");
                                    }
                                break;
                            
                                default:
                                break;
                            }
                        break;
                        case 3:
                            // instancia um objeto para armazenar os dados da progressão a ser verificada
                            ProgressaoHarmonica ph1 = new ProgressaoHarmonica(0,0);
                            System.out.print("Digite o tipo de cálculo realizado (Cálculo do Termo Geral: '1' / Soma dos Termos: '2'): ");
                            tipoCalculo = scanner.nextInt();

                            // switch case baseado no tipo de cálculo realizado
                            switch (tipoCalculo) {
                                case 1:
                                    // definindo os atributos utilizados na verificação
                                    System.out.print("\nDigite o primeiro termo: ");
                                    ph1.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    ph1.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    int numTermos = scanner.nextInt();
                                    System.out.print("Agora, digite qual o resultado do Termo Geral obtido em seus cálculos: ");
                                    int resultado = scanner.nextInt();
                                    listaPH.add(ph1); // adiciona esse objeto na lista de progressões

                                    // verifica se o resultado digitado pelo usuário equivale ao resultado correto (após a execução dos métodos)
                                    if (ph1.calcularTermoGeral(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! O Termo Geral dessa progressão é "+ ph1.calcularTermoGeral(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor do Termo Geral é " + ph1.calcularTermoGeral(numTermos) + ".");
                                    }
                                break;
                                case 2:
                                    // definindo os atributos utilizados na verificação
                                    System.out.print("\nDigite o primeiro termo: ");
                                    ph1.setPrimeiroTermo(scanner.nextInt());
                                    System.out.print("Digite a razão: ");
                                    ph1.setRazao(scanner.nextInt());
                                    System.out.print("Digite o número de termos: ");
                                    numTermos = scanner.nextInt();
                                    System.out.print("Agora, digite qual o resultado da Soma dos Termos obtido em seus cálculos: ");
                                    resultado = scanner.nextInt();
                                    listaPH.add(ph1); // adiciona esse objeto na lista de progressões
                                    
                                    // verifica se o resultado digitado pelo usuário equivale ao resultado correto (após a execução dos métodos)
                                    if (ph1.calcularSomaDosTermos(numTermos) == resultado) {
                                        System.out.println("\nSeus cálculos estão corretos! A Soma dos Termos dessa progressão é "+ ph1.calcularSomaDosTermos(numTermos) +".");
                                    }
                                    else {
                                        System.out.println("Seu cálculo está incorreto! O valor da Soma dos Termos é " + ph1.calcularSomaDosTermos(numTermos) + ".");
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
                    System.out.println("Você selecionou: Visualizar progressões registradas. ");

                    System.out.println("\nProgressões Aritméticas: \n");
                    // verifica se a lista está vazia, e caso não esteja, mostra os dados das progressões registradas
                    if (listaPA.isEmpty()) {
                        System.out.println("Nenhuma PA registrada.");
                    }
                    else { 
                        for (int i = 0; i < listaPA.size(); i++) {
                            System.out.println("PA "+ (i+1) +": ");
                            listaPA.get(i).mostrarDados(); // utiliza o método abstrato mostrarDados
                        }
                    }

                    System.out.println("\nProgressões Geométricas: \n");
                    // verifica se a lista está vazia, e caso não esteja, mostra os dados das progressões registradas
                    if (listaPG.isEmpty()) {
                        System.out.println("Nenhuma PG registrada.");
                    }
                    else { 
                        for (int i = 0; i < listaPG.size(); i++) {
                            System.out.println("PG "+ (i+1) +": ");
                            listaPG.get(i).mostrarDados(); // utiliza o método abstrato mostrarDados
                        }
                    }

                    System.out.println("\nProgressões Harmônicas: \n");
                    // verifica se a lista está vazia, e caso não esteja, mostra os dados das progressões registradas
                    if (listaPH.isEmpty()) {
                        System.out.println("Nenhuma PH registrada.");
                    }
                    else { 
                        for (int i = 0; i < listaPH.size(); i++) {
                            System.out.println("PH "+ (i+1) +": ");
                            listaPH.get(i).mostrarDados(); // utiliza o método abstrato mostrarDados
                        }
                    }

                break;
                case 5:
                    System.out.println("Você selecionou: Sair.");
                    System.out.println("Programa encerrado.");
                break;
                default:
                    System.out.println("Opção Inválida.");
                break;
            }

        } while (op != 5);

        scanner.close();
    }
}
