package polimorfismo.biologia;
public class MembranaPlasmatica extends OrganelasCelulares {

    // métodos abstratos da classe mãe
    @Override
    public void mostrarLocalizacao(){
        System.out.println("A membrana plasmática se localiza em volta da célula. Ela separa o interior celular do meio extracelular.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções da Membrana Plasmática são: \n-Delimita a célula\n-Controla a entrada e saída de substâncias\n-Comunicação com o meio externo\n-Reconhecimento celular.");
    };
}