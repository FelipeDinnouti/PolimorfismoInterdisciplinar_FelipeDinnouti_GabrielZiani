package polimorfismo.biologia;
public class REL extends OrganelasCelulares {

    @Override
    public void mostrarLocalizacao(){
        System.out.println("O retículo endoplasmático liso se localiza perto do retículo endoplasmático rugoso.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("O retículo endoplasmático liso é responsável por produzir lipídeos (especialmente os fosfolipídeos) e destoxificação do organismo.");
    };
}