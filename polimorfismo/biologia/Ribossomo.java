package polimorfismo.biologia;
public class Ribossomo extends OrganelasCelulares {

    @Override
    public void mostrarLocalizacao(){
        System.out.println("Os ribossomos se localizam sobre o Retículo Endoplasmático Rugoso.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("Os ribossomos são responsáveis por realizar a Síntese de proteínas na célula.");
    };
}