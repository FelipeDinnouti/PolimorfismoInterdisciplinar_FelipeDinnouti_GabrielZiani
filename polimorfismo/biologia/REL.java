package polimorfismo.biologia;
public class REL extends OrganelasCelulares {

    // métodos abstratos da classe mãe
    @Override
    public void mostrarLocalizacao(){
        System.out.println("O retículo endoplasmático liso se localiza perto do retículo endoplasmático rugoso. Ele não possui ribossomos na sua membrana.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções do Retículo Endoplasmático Liso são: \n-Síntese de lipídios\n-Desintoxicação de substâncias químicas\n-Armazenamento de íons cálcio.");

    };
}