package polimorfismo.fisica;

import polimorfismo.Main;

public class MenuFisica {
    public static void menu() {

        boolean pararDeEstudar = false;

        do {
            System.out.println("\nVamos estudar e treinar os conhecimentos adquiridos sobre Dilatação Térmica!");
            System.out.print("\nEscolha uma tipo de dilatação para estudar:\n" +
                                "1. Dilatação Linear\n" +
                                "2. Dilatação Superficial\n" +
                                "3. Dilatação Volumétrica\n" +
                                "0. Voltar ao menu principal\n" +
                                "\nSelecione uma opção: ");

            int op = Main.scanner.nextInt();
            DilatacaoTermica dilatacao = null;
            
            switch (op) {
                case 1:
                    dilatacao = new DilatacaoLinear();
                    break;
                case 2:
                    dilatacao = new DilatacaoSuperficial();
                    break;
                case 3:
                    dilatacao = new DilatacaoVolumetrica();
                    break;
                case 0:
                    System.out.println("Saindo...\n");
                    return; // Sai do menu 
                default:
                    System.out.println("Opção inválida\n");
                    continue; // Continua o loop
            }

            System.out.print("\n\nComo você deseja estudar esse tipo de dilatação?\n" +
                                "1 - Mostrar definição\n" + 
                                "2 - Verificador de dilatação\n" + 
                                "3 - Exercício\n" + 
                                "0 - Voltar\n" + "\nSelecione uma opção: ");

            op = Main.scanner.nextInt();
            Main.scanner.nextLine();
            
            switch (op) {
                case 1:
                    System.out.println("\nVocê selecionou: Mostrar Definição.");
                    dilatacao.mostrarDefinicao();
                    break;
                case 2:
                    System.out.println("\nVocê selecionou: Verificador de dilatação.");
                    System.out.println("Neste exercício, você poderá verificar se seus cálculos relacionados a dilatação térmica estão corretos!");
                    System.out.print("Para o cálculo da dilatação, insira a unidade inicial: ");
                    // Variáveis locais para o cálculo
                    float calculoTamanhoInicial = Main.scanner.nextFloat();
                    Main.scanner.nextLine();
                    
                    System.out.print("\nInsira a variação de temperatura: ");
                    int calculoVariacaoTemperatura = Main.scanner.nextInt();
                    Main.scanner.nextLine();

                    System.out.print("\nInsira o coeficiente de dilatação do material (número decimal com vírgula): ");
                    float calculoCoeficienteDeDilatacao = Main.scanner.nextFloat();
                    Main.scanner.nextLine();
                    
                    dilatacao.setCoeficienteDeDilatacao(calculoCoeficienteDeDilatacao);
                    dilatacao.setVariacaoTemperatura(calculoVariacaoTemperatura);
                    double resultado = dilatacao.calcularDilatacao(calculoTamanhoInicial);

                    System.out.print("Agora, digite qual o resultado da dilatação obtido em seus cálculos: ");
                    double resultadoUser = Main.scanner.nextDouble();

                    if (resultado == resultadoUser) {
                        System.out.println("\nSeus cálculos estão corretos! A variação de dilatação é "+ resultado +".");
                    }
                    else {
                        System.out.println("Seu cálculo está incorreto! A variação de dilatação é " + resultado + ".");
                    }

                    break;
                case 3:
                    int tamanhoTrem = (int) (5+(Math.random()*10));
                    int variacaoTemperatura = (int) (20+(Math.random()*20));
                    int coeficiente = (int) (10+(Math.random()*10));

                    dilatacao.setCoeficienteDeDilatacao(coeficiente*(Math.pow(10, -1)));
                    dilatacao.setVariacaoTemperatura(variacaoTemperatura);

                    System.out.print(String.format("\nExercício:\nUm trilho de trem de %d metros tem seu comprimento alterado devido à variação de %d°C ao longo do dia." +
                                                    "Possuindo um coeficiente de dilatação linear de %d ºC, determine o comprimento final do trilho.\n\nSua resposta (em metros): ", tamanhoTrem, variacaoTemperatura, coeficiente));
                    
                    String respostaCerta = (tamanhoTrem + dilatacao.calcularDilatacao(tamanhoTrem)) + "m";
                    String respostaUsuario = Main.scanner.nextLine().trim(); // Sanitização do input

                    if (respostaUsuario.equals(respostaCerta)) {
                        System.out.println("\nMuito bem, Você acertou!\n");
                    } else {
                        System.out.println("\nResposta incorreta. Resposta esperada: " + respostaCerta);
                    }
                    break;
                case 0:
                    System.out.println("\nVoltando...");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while(!pararDeEstudar);
    }
}