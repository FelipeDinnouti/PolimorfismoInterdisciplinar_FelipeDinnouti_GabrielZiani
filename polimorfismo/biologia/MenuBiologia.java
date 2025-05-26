package polimorfismo.biologia;
import java.util.Random;
import java.util.Scanner;

public class MenuBiologia {
    public static void menu () {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int op;

        Mitocondria mitocondria = new Mitocondria();
        Nucleo nucleo = new Nucleo();
        RER rer = new RER();
        REL rel = new REL();
        ComplexoDeGolgi golgi = new ComplexoDeGolgi();
        Lisossomo lisossomo = new Lisossomo();
        Ribossomo ribossomo = new Ribossomo();
        MembranaPlasmatica membrana = new MembranaPlasmatica();

        
        do {
            System.out.println("\n\n\nVamos estudar e treinar os conhecimentos adquiridos sobre Organelas Celulares!");
            System.out.println("1. Estudar matéria \n2. Exercício 01: Mistério da Organela (Função) \n3. Exercício 02: Mistério da Organela (Localização) \n4 - Sair");
            System.out.print("\nDigite uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();
            
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
                    System.out.print("Deseja prosseguir? (S/N): ");
                    String prosseguir = scanner.nextLine();
                    if (prosseguir.equals("S")) {
                        System.out.println("Agora, serão apresentadas as funções e a localizacação de cada Organela Celular.");
                        System.out.println("- Mitocôndria:");
                        mitocondria.mostrarFuncao();
                        mitocondria.mostrarLocalizacao();

                        System.out.println("- Núcleo:");
                        nucleo.mostrarFuncao();
                        nucleo.mostrarLocalizacao();

                        System.out.println("- Retículo Endoplasmático Rugoso:");
                        rer.mostrarFuncao();
                        rer.mostrarLocalizacao();

                        System.out.println("- Retículo Endoplasmático Liso:");
                        rel.mostrarFuncao();
                        rel.mostrarLocalizacao();

                        System.out.println("- Complexo de Golgi (Complexo Golgiense):");
                        golgi.mostrarFuncao();
                        golgi.mostrarLocalizacao();

                        System.out.println("- Lisossomos:");
                        lisossomo.mostrarFuncao();
                        lisossomo.mostrarLocalizacao();

                        System.out.println("- Ribossomos:");
                        ribossomo.mostrarFuncao();
                        ribossomo.mostrarLocalizacao();

                        System.out.println("- Membrana Plasmática:");
                        membrana.mostrarFuncao();
                        membrana.mostrarLocalizacao();
                    } else {
                        System.out.println("Programa encerrado.");
                        break;
                    }
                    
                break;
                case 2:
                    System.out.println("Você selecionou: Exercício 01 - MISTÉRIO DA ORGANELA (Função)");
                    System.out.println("Neste exercício, você deverá descobrir qual organela celular está sendo descrita com base em pistas fornecidas. \nLeia atentamente cada descrição e digite o nome da organela correspondente.");
                    int organelaNumero = random.nextInt(8) + 1;

                    switch (organelaNumero) {
                        case 1:
                        
                            System.out.println("Sou essencial para a célula. Meu papel é gerar energia através de um processo chamado respiração celular.");
                            System.out.println("Graças a mim, a célula tem energia suficiente para realizar suas atividades.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            String organelaNome = scanner.nextLine().trim();
        
                            if (organelaNome.equalsIgnoreCase("mitocôndria") || organelaNome.equalsIgnoreCase("mitocondria")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: mitocôndria.");
                            }
                        break;
                        case 2:
                        
                            System.out.println("Eu guardo o material genético da célula, o DNA.");
                            System.out.println("Coordeno as atividades celulares, como a síntese de proteínas e o crescimento.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("núcleo") || organelaNome.equalsIgnoreCase("nucleo")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: núcleo.");
                        }
                        break;
                        case 3:

                            System.out.println("Sou uma rede de membranas com ribossomos aderidos.");
                            System.out.println("Minha função principal é a produção de proteínas.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("retículo endoplasmático rugoso") || organelaNome.equalsIgnoreCase("reticulo endoplasmatico rugoso")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: retículo endoplasmático rugoso.");
                            }
                        break;
                        case 4:

                            System.out.println("Sou uma rede de membranas, mas sem ribossomos.");
                            System.out.println("Produzo lipídios e ajudo a desintoxicar a célula.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("retículo endoplasmático liso") || organelaNome.equalsIgnoreCase("reticulo endoplasmatico liso")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: retículo endoplasmático liso.");
                            }
                        break;
                        case 5:
                            System.out.println("Recebo proteínas e lipídios para modificá-los e enviá-los para outras partes da célula.");
                            System.out.println("Sou fundamental para a secreção celular.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("complexo de golgi") || organelaNome.equalsIgnoreCase("complexo golgiense")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: complexo de golgi.");
                            }
                        break;
                        case 6:
                            System.out.println("Sou responsável pela digestão e destruição de resíduos e partes velhas da célula.");
                            System.out.println("Contenho enzimas que degradam substâncias.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("lisossomo") || organelaNome.equalsIgnoreCase("lisossomos")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: lisossomo.");
                            }
                        break;
                        case 7:
                            System.out.println("Sou pequenas estruturas sem membrana que produzem proteínas.");
                            System.out.println("Posso estar livres no citoplasma ou presos ao retículo endoplasmático.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("ribossomos") || organelaNome.equalsIgnoreCase("ribossomo")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: ribossomo.");
                            }
                        break;
                        case 8:
                            System.out.println("Sou uma estrutura que envolve a célula, controlando a entrada e saída de substâncias.");
                            System.out.println("Sou fundamental para manter o equilíbrio interno da célula.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("membrana plasmática") || organelaNome.equalsIgnoreCase("membrana plasmatica")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: membrana plasmática.");
                            }
                        break;
                    }

                    
                break;
                case 3:
                    
                    System.out.println("Você selecionou: Exercício 02 - MISTÉRIO DA ORGANELA (Localização)");
                    System.out.println("Neste exercício, você deverá descobrir qual organela celular está sendo descrita com base em pistas sobre sua localização dentro da célula. \nLeia atentamente cada descrição e digite o nome da organela correspondente.");
                    organelaNumero = random.nextInt(8) + 1;

                    switch (organelaNumero) {
                        case 1:
                        
                            System.out.println("Localizo-me dentro do citoplasma, envolvida por uma dupla membrana, e sou o centro energético da célula.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            String organelaNome = scanner.nextLine().trim();
        
                            if (organelaNome.equalsIgnoreCase("mitocôndria") || organelaNome.equalsIgnoreCase("mitocondria")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: mitocôndria.");
                            }
                        break;
                        case 2:
                        
                            System.out.println("Estou localizada dentro da célula, delimitada por uma membrana dupla, e contenho o material genético (DNA).");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("núcleo") || organelaNome.equalsIgnoreCase("nucleo")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: núcleo.");
                        }
                        break;
                        case 3:

                            System.out.println("Fico próximo ao núcleo e produzo proteínas.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("retículo endoplasmático rugoso") || organelaNome.equalsIgnoreCase("reticulo endoplasmatico rugoso")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: retículo endoplasmático rugoso.");
                            }
                        break;
                        case 4:

                            System.out.println("Sou uma rede de membranas lisa, dispersa no citoplasma, e não possuo ribossomos.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("retículo endoplasmático liso") || organelaNome.equalsIgnoreCase("reticulo endoplasmatico liso")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: retículo endoplasmático liso.");
                            }
                        break;
                        case 5:
                            System.out.println("Sou formado por pilhas de sacos membranosos, localizados próximos ao núcleo e ao retículo endoplasmático.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("complexo de golgi") || organelaNome.equalsIgnoreCase("complexo golgiense")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: complexo golgiense.");
                            }
                        break;
                        case 6:
                            System.out.println("Localizo-me dentro da célula e realizo a digestão de resíduos.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("lisossomo") || organelaNome.equalsIgnoreCase("lisossomos")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: lisossomo.");
                            }
                        break;
                        case 7:
                            System.out.println("Sou estruturas pequenas, presentes tanto livres no citoplasma quanto aderidas ao retículo endoplasmático.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("ribossomos") || organelaNome.equalsIgnoreCase("ribossomo")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: ribossomo.");
                            }
                        break;
                        case 8:
                            System.out.println("Sou uma fina camada que envolve toda a célula, controlando a entrada e saída de substâncias.");
                            System.out.print("Quem sou eu? Digite o nome da organela: ");
                            organelaNome = scanner.nextLine().trim();
                            if (organelaNome.equalsIgnoreCase("membrana plasmática") || organelaNome.equalsIgnoreCase("membrana plasmatica")) {
                                System.out.println("Resposta correta!");
                            } else {
                                System.out.println("Resposta incorreta. A resposta certa é: membrana plasmática.");
                            }
                        break;
                    }
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
