package polimorfismo.biologia;
public class Mitocondria extends OrganelasCelulares {

    // métodos abstratos da classe mãe
    @Override
    public void mostrarLocalizacao(){
        System.out.println("As mitocôndrias se localizam dispersas pelo citoplasma celular.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções das Mitocôndrias são: \n-Produção de energia (ATP) por respiração celular\n-Regulação do metabolismo celular\n-Participação na morte celular programada (apoptose).");

    };
}