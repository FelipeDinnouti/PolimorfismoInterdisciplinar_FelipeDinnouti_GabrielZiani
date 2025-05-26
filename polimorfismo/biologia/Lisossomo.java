package polimorfismo.biologia;
public class Lisossomo extends OrganelasCelulares {

    @Override
    public void mostrarLocalizacao(){
        System.out.println("Os lisossomos se localizam dispersos no citoplasma de células eucarióticas.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções dos Lisossomos são: \n-Digestão intracelular de partículas e organelas danificadas\n-Reciclagem de componentes celulares\n-Defesa contra microrganismos.");
    };
}