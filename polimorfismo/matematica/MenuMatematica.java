package polimorfismo.matematica;

import polimorfismo.misc.MyColor;
import polimorfismo.misc.Input;

import java.util.ArrayList;
import java.util.Random;

public class MenuMatematica {

    // array lists de cada tipo de progressão para armazenar as progressoes do verificador (opcao 3 do menu)
    static ArrayList<ProgressaoAritmetica> listaPA = new ArrayList<>();
    static ArrayList<ProgressaoGeometrica> listaPG = new ArrayList<>();
    static ArrayList<ProgressaoHarmonica> listaPH = new ArrayList<>();

    static void exercicioEverest() {
        Random random = new Random();

        System.out.println("Você selecionou: Exercício - Trilha Progressiva do Everest");
        System.out.println("Neste exercício, você deverá calcular os problemas de PA e PG para conseguir alcançar o topo do Monte Everest. \nLeia atentamente cada questão e digite o resultado final da equação. O resultado final será a quantidade de metros que você subirá no monte, caso tenha acertado. ");
        // Utilizando o random para sortear um número entre 1 e 2, que é correspondente à questão que será apresentada para o usuário
        int questao1 = random.nextInt(2) + 1;
        int questao2 = random.nextInt(2) + 1;
        int questao3 = random.nextInt(2) + 1;
        int soma = 0;
        
        // Objetos usados para o calculo
        Progressoes PA = new ProgressaoAritmetica(0,0);
        Progressoes PG = new ProgressaoGeometrica(0,0);
        Progressoes PH = new ProgressaoHarmonica(0,0);

        // switch case com as questões que serão sorteadas
        switch (questao1) {
            case 1:
                System.out.println("\nSabendo que o primeiro termo de uma PA é 3 e a razão é 5, qual é o 10º termo (n = 10)?");
                // definindo os atributos utilizados na questão
                PA.setPrimeiroTermo(3);
                PA.setRazao(5);
                double resultado = PA.calcularTermoGeral(10);

                System.out.print("Digite a resposta: ");
                int resposta1 = Input.readInt();

                // verifica se a resposta digitada pelo usuário equivale à resposta correta
                if (resposta1 == resultado) {
                    System.out.println("Resposta correta!");
                    System.out.println("+" +resultado+ " metros escalados.");
                    soma = soma + resposta1;
                } else {
                    System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                }

                Input.confirmar();
                break;
            case 2:
                System.out.println("\nQual é a soma dos 20 primeiros termos da PA em que a1 = 2 e a razão é 3 (n = 20)?");
                // definindo os atributos utilizados na questão
                PA.setPrimeiroTermo(2);
                PA.setRazao(3);
                resultado = PA.calcularSomaDosTermos(20);

                System.out.print("Digite a resposta: ");
                resposta1 = Input.readInt();

                // verifica se a resposta digitada pelo usuário equivale à resposta correta
                if (resposta1 == resultado) {
                    System.out.println("Resposta correta!");
                    System.out.println("+" +resultado+ " metros escalados.");
                    soma = soma + resposta1;
                } 
                else {
                    System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                }
                Input.confirmar();
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
                int resposta2 = Input.readInt();

                // verifica se a resposta digitada pelo usuário equivale à resposta correta
                if (resposta2 == resultado) {
                    System.out.println("Resposta correta!");
                    System.out.println("+" +resultado+ " metros escalados.");
                    soma = soma + resposta2;
                } else {
                    System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                }
                Input.confirmar();
                break;
            case 2:
                System.out.println("\nCalcule a soma dos 4 primeiros termos da PG com a1 = 1 e q = 2.");
                // definindo os atributos utilizados na questão
                PG.setPrimeiroTermo(1);
                PG.setRazao(2);
                resultado = PG.calcularSomaDosTermos(4);

                System.out.print("Digite a resposta: ");
                resposta2 = Input.readInt();

                // verifica se a resposta digitada pelo usuário equivale à resposta correta
                if (resposta2 == resultado) {
                    System.out.println("Resposta correta!");
                    System.out.println("+" +resultado+ " metros escalados.");
                    soma = soma + resposta2;
                } else {
                    System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                }
                
                Input.confirmar();
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
                int resposta3 = Input.readInt();

                // verifica se a resposta digitada pelo usuário equivale à resposta correta
                if (resposta3 == resultado) {
                    System.out.println("Resposta correta!");
                    System.out.println("+" +resultado+ " metros escalados.");
                    soma = soma + resposta3;
                } else {
                    System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                }
                Input.confirmar();
                break;
            case 2:
                System.out.println("\nQual é o 7º termo da PG em que o primeiro termo é 3 e a razão é 4 (n = 7)?");
                // definindo os atributos utilizados na questão
                PG.setPrimeiroTermo(3);
                PG.setRazao(4);
                resultado = PG.calcularTermoGeral(7);

                System.out.print("Digite a resposta: ");
                resposta3 = Input.readInt();

                // verifica se a resposta digitada pelo usuário equivale à resposta correta
                if (resposta3 == resultado) {
                    System.out.println("Resposta correta!");
                    System.out.println("+" +resultado+ " metros escalados.");
                    soma = soma + resposta3;
                } else {
                    System.out.println("Resposta incorreta. A resposta certa é: "+resultado+".");
                }
                
                Input.confirmar();
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
    }

    static void verificadorProgressao() {
        // Saudação
        System.out.println("Você selecionou: Verificador de Progressão. ");
        System.out.println("Neste exercício, você poderá verificar se seus cálculos relacionados a progressões estão corretos! \nVocê deverá selecionar o tipo de progressão, qual tipo de cálculo deseja executar e os valores necessários.");
        // Escolha do usuário de progressão
        System.out.print("\nQual o tipo de progressão relacionado ao seu cálculo? (Para Aritmética: '1' / Para Geométrica: '2' / Para Harmônica: '3'): ");
        int tipoProgressao = Input.readInt();

        Progressoes progressao = null;
        int primeiroTermo;
        int razao;
        int numTermos;

        // definindo os atributos utilizados na verificação
        System.out.print("\nDigite o primeiro termo: ");
        primeiroTermo = Input.readInt();
        System.out.print("Digite a razão: ");
        razao = Input.readInt();
        System.out.print("Digite o número de termos: ");
        numTermos = Input.readInt();

        // Feito por Felipe Dinnouti & Gabriel Ziani

        // Instanciando de acordo com a escolha do usuário
        switch (tipoProgressao) {
            // Progressão Aritmética
            case 1:
                System.out.println("Progressao Aritmética Criada");
                progressao = new ProgressaoAritmetica(razao, primeiroTermo);
                listaPA.add((ProgressaoAritmetica) progressao);
                break;
            // Progressao Geometrica
            case 2:
                System.out.println("Progressao Geométrica Criada");
                progressao = new ProgressaoGeometrica(razao, primeiroTermo);
                listaPG.add((ProgressaoGeometrica) progressao);
                break;
            // Progressao Harmonica
            case 3:
                System.out.println("Progressao Harmônica Criada");
                progressao = new ProgressaoHarmonica(razao, primeiroTermo);
                listaPH.add((ProgressaoHarmonica) progressao);
                break;
            default:
                    System.out.println(MyColor.ANSI_RED + "Opção inválida." + MyColor.ANSI_RESET);
                    return;
        }

        System.out.print("Digite o tipo de cálculo que irá realizar (Cálculo do Termo Geral: '1' / Soma dos Termos: '2'): ");
        int tipoCalculo = Input.readInt();

        System.out.print("Insira então o resultado do seu cálculo: ");
        int resultado = Input.readInt();

        switch (tipoCalculo) {
            // Calculo do Termo Geral
            case 1:
                // verifica se o resultado digitado pelo usuário equivale ao resultado correto (após a execução dos métodos)
                if (progressao.calcularTermoGeral(numTermos) == resultado) {
                    System.out.println("\nSeus cálculos estão corretos! O Termo Geral dessa progressão é "+ progressao.calcularTermoGeral(numTermos) +".");
                }
                else {
                    System.out.println("Seu cálculo está incorreto! O valor do Termo Geral é " + progressao.calcularTermoGeral(numTermos) + ".");
                }

                Input.confirmar();
                break;
            // Soma dos Termos
            case 2:
                // verifica se o resultado digitado pelo usuário equivale ao resultado correto (após a execução dos métodos)
                if (progressao.calcularSomaDosTermos(numTermos) == resultado) {
                    System.out.println("\nSeus cálculos estão corretos! A soma dos termos é "+ progressao.calcularSomaDosTermos(numTermos) +".");
                }
                else {
                    System.out.println("Seu cálculo está incorreto! O valor da soma dos termos é " + progressao.calcularSomaDosTermos(numTermos) + ".");
                }

                Input.confirmar();
                break; 
            default:
                    System.out.println(MyColor.ANSI_RED + "Opção inválida." + MyColor.ANSI_RESET);
                    return;
        }
    }

    public static void menu () {
        int op;

        // instanciando objetos utilizando o polimorfismo
        Progressoes PA = new ProgressaoAritmetica(0,0);
        Progressoes PG = new ProgressaoGeometrica(0,0);
        Progressoes PH = new ProgressaoHarmonica(0,0);
        
        // loop para o menu
        do {
            System.out.println("\n\n\nVamos estudar e treinar os conhecimentos adquiridos sobre" + MyColor.ANSI_PURPLE + " Progressões!" + MyColor.ANSI_RESET);
            System.out.println("1 - Estudar matéria \n2 - Exercício: Trilha Progressiva do Everest \n3 - Verificador de Progressão \n4 - Visualizar progressões registradas \n0 - Sair");
            System.out.print("\n"+ MyColor.ANSI_BLUE + "Selecione uma opção: " + MyColor.ANSI_RESET);
            op = Input.readInt();
            
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
                    String prosseguir = Input.readLine();

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
                        System.out.println(MyColor.ANSI_RED + "Voltando ao menu principal..." + MyColor.ANSI_RESET);
                        return;
                    }

                    Input.confirmar();
                    break;
                case 2:
                    exercicioEverest();
                    Input.confirmar();
                    break;
                case 3:
                    verificadorProgressao();
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
                case 0:
                    System.out.println("Você selecionou: Sair.");
                    System.out.println(MyColor.ANSI_RED + "Voltando ao menu principal..." + MyColor.ANSI_RESET);
                    return;
                default:
                    System.out.println(MyColor.ANSI_RED + "Opção inválida." + MyColor.ANSI_RESET);
                    break;
            }

        } while (op != 0);
    }
}
