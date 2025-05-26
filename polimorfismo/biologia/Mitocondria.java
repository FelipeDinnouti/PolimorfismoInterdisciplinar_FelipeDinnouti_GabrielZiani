package polimorfismo.biologia;
public class Mitocondria extends OrganelasCelulares {

    @Override
    public void mostrarLocalizacao(){
        System.out.println("As mitocôndrias se localizam dispersas pelo citoplasma celular.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções das Mitocôndrias são: \nProdução de energia (ATP) por respiração celular\nRegulação do metabolismo celular\nParticipação na morte celular programada (apoptose).");

    };
}