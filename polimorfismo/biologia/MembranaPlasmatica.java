package polimorfismo.biologia;
public class MembranaPlasmatica extends OrganelasCelulares {

    @Override
    public void mostrarLocalizacao(){
        System.out.println("A membrana plasmática se localiza em volta da célula.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções da Membrana Plasmática são: \nDelimita a célula\nControla a entrada e saída de substâncias\nComunicação com o meio externo\nReconhecimento celular.");
    };
}