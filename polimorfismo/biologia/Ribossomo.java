package polimorfismo.biologia;
public class Ribossomo extends OrganelasCelulares {

    @Override
    public void mostrarLocalizacao(){
        System.out.println("Os ribossomos se localizam sobre o Retículo Endoplasmático Rugoso.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções dos Ribossomos são: \nSíntese de proteínas\nTradução da informação genética do RNA mensageiro\nPodem estar livres no citoplasma ou ligados ao retículo endoplasmático.");
    };
}