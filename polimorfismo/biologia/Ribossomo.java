package polimorfismo.biologia;
public class Ribossomo extends OrganelasCelulares {

    // métodos abstratos da classe mãe
    @Override
    public void mostrarLocalizacao(){
        System.out.println("Os ribossomos se localizam sobre o Retículo Endoplasmático Rugoso ou dispersos no citoplasma.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções dos Ribossomos são: \n-Síntese de proteínas\n-Tradução da informação genética do RNA mensageiro\n-Podem estar livres no citoplasma ou ligados ao retículo endoplasmático.");
    };
}