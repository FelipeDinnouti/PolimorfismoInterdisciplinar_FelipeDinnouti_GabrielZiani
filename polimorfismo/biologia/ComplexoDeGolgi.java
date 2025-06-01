package polimorfismo.biologia;
public class ComplexoDeGolgi extends OrganelasCelulares {

    // métodos abstratos da classe mãe
    @Override
    public void mostrarLocalizacao(){
        System.out.println("O complexo de golgi se localiza entre o núcleo e a membrana plasmática. Ele se situa próximo ao retículo endoplasmático, no citoplasma.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções do Complexo de Golgi são: \n-Modificação, empacotamento e distribuição de proteínas e lipídios\n-Formação de lisossomos\n-Produção de vesículas de secreção.");
    };
}