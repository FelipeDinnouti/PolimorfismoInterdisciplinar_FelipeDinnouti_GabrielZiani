package polimorfismo.biologia;
public class ComplexoDeGolgi extends OrganelasCelulares {

    @Override
    public void mostrarLocalizacao(){
        System.out.println("O complexo de golgi se localiza.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções do Complexo de Golgi são: \nModificação, empacotamento e distribuição de proteínas e lipídios\nFormação de lisossomos\nProdução de vesículas de secreção.");
    };
}