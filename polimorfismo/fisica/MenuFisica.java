package polimorfismo.fisica;

import polimorfismo.Main;
import polimorfismo.misc.MyColor;
import polimorfismo.misc.Input;

public class MenuFisica {
    public static void menu() {

        boolean pararDeEstudar = false;

        do {
            System.out.println("\nVamos estudar e treinar os conhecimentos adquiridos sobre" + MyColor.ANSI_PURPLE + " Dilatação Térmica!" + MyColor.ANSI_RESET);
            System.out.print("\nEscolha uma tipo de dilatação para estudar:\n" +
                                "1. Dilatação Linear\n" +
                                "2. Dilatação Superficial\n" +
                                "3. Dilatação Volumétrica\n" +
                                "0. Voltar ao menu principal\n" +
                                "\n"+ MyColor.ANSI_BLUE + "Selecione uma opção: " + MyColor.ANSI_RESET);

            int op = Input.readInt();
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
                    continue; // Continua o loop - resetando a escolha do começo
            }

            System.out.print("\n\nComo você deseja estudar esse tipo de dilatação?\n" +
                                "1 - Mostrar definição\n" + 
                                "2 - Calculadora de dilatação\n" + 
                                "3 - Exercício\n" + 
                                "0 - Voltar\n" + 
                                "\n"+ MyColor.ANSI_BLUE + "Selecione uma opção: " + MyColor.ANSI_RESET);

            op = Input.readInt();
            
            switch (op) {
                case 1:
                    System.out.println("\nVocê selecionou: Mostrar Definição.");
                    dilatacao.mostrarDefinicao();
                    
                    Input.confirmar();
                    break;
                case 2:
                    System.out.println("\nVocê selecionou: Calculadora de dilatação.");
                    System.out.println("Com essa ferramenta você poderá verificar se seus cálculos relacionados a dilatação térmica estão corretos!");
                    System.out.println("Você irá inserir os parâmetros do enunciado e irá colocar a resposta que você chegou, e iremos comparar com a resposta correta.");
                    
                    // Obtendo informações do usuário
                    System.out.print("Para o cálculo da dilatação, insira a unidade inicial: ");
                    float calculoTamanhoInicial = Input.readFloat();
                    
                    System.out.print("\nInsira a variação de temperatura: ");
                    int calculoVariacaoTemperatura = Input.readInt();

                    System.out.print("\nInsira o coeficiente de dilatação do material (número decimal com vírgula): ");
                    float calculoCoeficienteDeDilatacao = Input.readFloat();
                    
                    // Aplicando o polimorfismo utilizando métodos membro
                    dilatacao.setCoeficienteDeDilatacao(calculoCoeficienteDeDilatacao);
                    dilatacao.setVariacaoTemperatura(calculoVariacaoTemperatura);
                    double resultado = dilatacao.calcularDilatacao(calculoTamanhoInicial);

                    System.out.print("Agora, digite qual o resultado da dilatação obtido em seus cálculos: ");
                    double resultadoUser = Input.readFloat();

                    if (resultado == resultadoUser) {   
                        System.out.println("\nSeus cálculos estão corretos! A variação de dilatação é "+ resultado +".");
                    }
                    else {
                        System.out.println("Seu cálculo está incorreto! A variação de dilatação é " + resultado + ".");
                    }

                    Input.confirmar();
                    break;
                case 3:
                    System.out.println("Nesta opção iremos apresentar um exercício de dilatação para que você realize.");
                    dilatacao.aplicarExercicio();
                    Input.confirmar();
                    break;
                case 0:
                    System.out.println("\nVoltando...");
                    break;
                default:
                    System.out.println(MyColor.ANSI_RED + "Opção inválida." + MyColor.ANSI_RESET);
                    break;
            }

        } while(!pararDeEstudar);
    }
}