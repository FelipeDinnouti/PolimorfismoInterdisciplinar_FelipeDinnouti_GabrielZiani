package polimorfismo.biologia;

import polimorfismo.misc.MyColor;
import polimorfismo.misc.Input;   
import java.util.Random;

public class MenuBiologia {
    public static void menu () {
        // criação do objeto scanner e random
        Random random = new Random();
        int op;

        // instanciando objetos utilizando o polimorfismo
        OrganelasCelulares mitocondria = new Mitocondria();
        OrganelasCelulares nucleo = new Nucleo();
        OrganelasCelulares rer = new RER();
        OrganelasCelulares rel = new REL();
        OrganelasCelulares golgi = new ComplexoDeGolgi();
        OrganelasCelulares lisossomo = new Lisossomo();
        OrganelasCelulares ribossomo = new Ribossomo();
        OrganelasCelulares membrana = new MembranaPlasmatica();

        // loop para o menu
        do {
            System.out.println("\n\n\nVamos estudar e treinar os conhecimentos adquiridos sobre" + MyColor.ANSI_PURPLE + " Organelas Celulares!" + MyColor.ANSI_RESET);
            System.out.println("1 - Estudar matéria \n2 - Exercício: Mistério da Organela (Função) \n3 - Exercício: Mistério da Organela (Localização) \n0 - Sair");
            System.out.print(MyColor.ANSI_RED + "\nDigite uma opção: " + MyColor.ANSI_RESET);
            op = Input.readInt();
            
            // switch case com base na opção que o usuário digitou
            switch (op) {
                case 1:
                    System.out.println("Você selecionou: Estudar matéria.");
                    System.out.println("Agora iremos estudar o módulo de Organelas Celulares, assunto muito importante dentro da matéria de Biologia.");
                    System.out.println("As principais organelas celulares presentes na célula animal (Eucariótica) são: ");
                    System.out.println("- Mitocôndria;");
                    System.out.println("- Núcleo;");
                    System.out.println("- Retículo Endoplasmático Rugoso;");
                    System.out.println("- Retículo Endoplasmático Liso;");
                    System.out.println("- Complexo de Golgi (Complexo Golgiense);");
                    System.out.println("- Lisossomos;");
                    System.out.println("- Ribossomos;");
                    System.out.println("- Membrana Plasmática.");
                    System.out.println("Agora, estudaremos uma por uma, conhecendo suas principais funções e onde elas se localizam.");
                    System.out.println("Serão apresentadas as funções e a localizacação de cada Organela Celular.");

                    Input.confirmar();

                    // chamando os métodos abstratos para cada organela
                    System.out.println(MyColor.ANSI_PURPLE + "\n\n\n- Mitocôndria:"+ MyColor.ANSI_RESET);
                    mitocondria.mostrarFuncao();
                    mitocondria.mostrarLocalizacao();
                    Input.confirmar();

                    System.out.println(MyColor.ANSI_PURPLE +  "\n\n\n- Núcleo:"+ MyColor.ANSI_RESET);
                    nucleo.mostrarFuncao();
                    nucleo.mostrarLocalizacao();
                    Input.confirmar();

                    System.out.println(MyColor.ANSI_PURPLE +  "\n\n\n- Retículo Endoplasmático Rugoso:"+ MyColor.ANSI_RESET);
                    rer.mostrarFuncao();
                    rer.mostrarLocalizacao();
                    Input.confirmar();

                    System.out.println(MyColor.ANSI_PURPLE +  "\n\n\n- Retículo Endoplasmático Liso:"+ MyColor.ANSI_RESET);
                    rel.mostrarFuncao();
                    rel.mostrarLocalizacao();
                    Input.confirmar();

                    System.out.println(MyColor.ANSI_PURPLE +  "\n\n\n- Complexo de Golgi (Complexo Golgiense):"+ MyColor.ANSI_RESET);
                    golgi.mostrarFuncao();
                    golgi.mostrarLocalizacao();
                    Input.confirmar();

                    System.out.println( MyColor.ANSI_PURPLE + "\n\n\n- Lisossomos:"+ MyColor.ANSI_RESET);
                    lisossomo.mostrarFuncao();
                    lisossomo.mostrarLocalizacao();
                    Input.confirmar();

                    System.out.println(MyColor.ANSI_PURPLE + "\n\n\n- Ribossomos:" + MyColor.ANSI_RESET);
                    ribossomo.mostrarFuncao();
                    ribossomo.mostrarLocalizacao();
                    Input.confirmar();

                    System.out.println(MyColor.ANSI_PURPLE + "\n\n\n- Membrana Plasmática:" + MyColor.ANSI_RESET);
                    membrana.mostrarFuncao();
                    membrana.mostrarLocalizacao();

                    Input.confirmar();
                    
                break;
                case 2:
                    System.out.println("Você selecionou: Exercício 01 - MISTÉRIO DA ORGANELA (Função)");
                    System.out.println("Neste exercício, você deverá descobrir qual organela celular está sendo descrita com base em pistas fornecidas. \nLeia atentamente cada descrição e digite o nome da organela correspondente.");
                    // sorteia um número entre 1 e 8 para escolher alguma organela de forma aleatória
                    int organelaNumero = random.nextInt(8) + 1;

                    // o sistema fará a pergunta relacionada à organela sorteada
                    switch (organelaNumero) {
                        case 1:
                        
                            System.out.println("Sou essencial para a célula. Meu papel é gerar energia através de um processo chamado respiração celular.");
                            System.out.println("Graças a mim, a célula tem energia suficiente para realizar suas atividades.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            String organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("mitocôndria") || organelaNome.equalsIgnoreCase("mitocondria")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: mitocôndria.");
                            }

                            Input.confirmar();
                            break;
                        case 2:
                        
                            System.out.println("Eu guardo o material genético da célula, o DNA.");
                            System.out.println("Coordeno as atividades celulares, como a síntese de proteínas e o crescimento.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("núcleo") || organelaNome.equalsIgnoreCase("nucleo")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: núcleo.");
                        }
                            Input.confirmar();
                            break;
                        case 3:

                            System.out.println("Sou uma rede de membranas com ribossomos aderidos.");
                            System.out.println("Minha função principal é a produção de proteínas.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("retículo endoplasmático rugoso") || organelaNome.equalsIgnoreCase("reticulo endoplasmatico rugoso")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: retículo endoplasmático rugoso.");
                            }

                            Input.confirmar();
                            break;
                        case 4:

                            System.out.println("Sou uma rede de membranas, mas sem ribossomos.");
                            System.out.println("Produzo lipídios e ajudo a desintoxicar a célula.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("retículo endoplasmático liso") || organelaNome.equalsIgnoreCase("reticulo endoplasmatico liso")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: retículo endoplasmático liso.");
                            }

                            Input.confirmar();
                            break;
                        case 5:
                            System.out.println("Recebo proteínas e lipídios para modificá-los e enviá-los para outras partes da célula.");
                            System.out.println("Sou fundamental para a secreção celular.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("complexo de golgi") || organelaNome.equalsIgnoreCase("complexo golgiense")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: complexo de golgi.");
                            }
                            Input.confirmar();
                            break;
                        case 6:
                            System.out.println("Sou responsável pela digestão e destruição de resíduos e partes velhas da célula.");
                            System.out.println("Contenho enzimas que degradam substâncias.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("lisossomo") || organelaNome.equalsIgnoreCase("lisossomos")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: lisossomo.");
                            }
                            Input.confirmar();
                            break;
                        case 7:
                            System.out.println("Sou pequenas estruturas sem membrana que produzem proteínas.");
                            System.out.println("Posso estar livres no citoplasma ou presos ao retículo endoplasmático.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("ribossomos") || organelaNome.equalsIgnoreCase("ribossomo")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: ribossomo.");
                            }
                            Input.confirmar();
                            break;
                        case 8:
                            System.out.println("Sou uma estrutura que envolve a célula, controlando a entrada e saída de substâncias.");
                            System.out.println("Sou fundamental para manter o equilíbrio interno da célula.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("membrana plasmática") || organelaNome.equalsIgnoreCase("membrana plasmatica")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: membrana plasmática.");
                            }
                            Input.confirmar();
                        break;
                    }

                    
                break;
                case 3:
                    
                    System.out.println("Você selecionou: Exercício 02 - MISTÉRIO DA ORGANELA (Localização)");
                    System.out.println("Neste exercício, você deverá descobrir qual organela celular está sendo descrita com base em pistas sobre sua localização dentro da célula. \nLeia atentamente cada descrição e digite o nome da organela correspondente.");
                    // sorteia um número entre 1 e 8 para escolher alguma organela de forma aleatória
                    organelaNumero = random.nextInt(8) + 1;

                    // o sistema fará a pergunta relacionada à organela sorteada
                    switch (organelaNumero) {
                        case 1:
                        
                            System.out.println("Localizo-me dentro do citoplasma, envolvida por uma dupla membrana, e sou o centro energético da célula.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            String organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("mitocôndria") || organelaNome.equalsIgnoreCase("mitocondria")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: mitocôndria.");
                            }
                            Input.confirmar();
                            break;
                        case 2:
                        
                            System.out.println("Estou localizada dentro da célula, delimitada por uma membrana dupla, e contenho o material genético (DNA).");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("núcleo") || organelaNome.equalsIgnoreCase("nucleo")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: núcleo.");
                        }
                            Input.confirmar();
                            break;
                        case 3:

                            System.out.println("Fico próximo ao núcleo e produzo proteínas.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("retículo endoplasmático rugoso") || organelaNome.equalsIgnoreCase("reticulo endoplasmatico rugoso")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: retículo endoplasmático rugoso.");
                            }
                            Input.confirmar();
                            break;
                        case 4:

                            System.out.println("Sou uma rede de membranas lisa, dispersa no citoplasma, e não possuo ribossomos.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("retículo endoplasmático liso") || organelaNome.equalsIgnoreCase("reticulo endoplasmatico liso")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: retículo endoplasmático liso.");
                            }
                            Input.confirmar();
                            break;
                        case 5:
                            System.out.println("Sou formado por pilhas de sacos membranosos, localizados próximos ao núcleo e ao retículo endoplasmático.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("complexo de golgi") || organelaNome.equalsIgnoreCase("complexo golgiense")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: complexo golgiense.");
                            }

                            Input.confirmar();                        
                            break;
                        case 6:
                            System.out.println("Localizo-me dentro da célula e realizo a digestão de resíduos.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("lisossomo") || organelaNome.equalsIgnoreCase("lisossomos")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: lisossomo.");
                            }
                            
                            Input.confirmar();
                            break;
                        case 7:
                            System.out.println("Sou estruturas pequenas, presentes tanto livres no citoplasma quanto aderidas ao retículo endoplasmático.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("ribossomos") || organelaNome.equalsIgnoreCase("ribossomo")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: ribossomo.");
                            }
                            Input.confirmar();
                            break;
                        case 8:
                            System.out.println("Sou uma fina camada que envolve toda a célula, controlando a entrada e saída de substâncias.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = Input.readLine(); // trim remove os espaços em branco

                            // verificação de entrada
                            if (organelaNome.equalsIgnoreCase("membrana plasmática") || organelaNome.equalsIgnoreCase("membrana plasmatica")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: membrana plasmática.");
                            }
                            Input.confirmar();
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Você selecionou: Sair.");
                    System.out.println(MyColor.ANSI_RED + "Voltando ao menu principal..." + MyColor.ANSI_RESET);
                    return;
                default:
                    System.out.println(MyColor.ANSI_RED + "Opção Inválida." + MyColor.ANSI_RESET);
                    break;
                
            }

        } while (op != 4);
    }
}
