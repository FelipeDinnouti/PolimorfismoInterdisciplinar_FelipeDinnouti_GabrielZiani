package polimorfismo.biologia;
public class Nucleo extends OrganelasCelulares {

    // métodos abstratos da classe mãe
    @Override
    public void mostrarLocalizacao(){
        System.out.println("O núcleo se localiza no centro do citoplasma celular. Ele é rodeado por uma membrana dupla chamada envelope nuclear.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções do Núcleo são: \n-Armazena o material genético (DNA)\n-Controla as atividades da célula (síntese de proteínas, metabolismo)\n-Regula a expressão gênica\n-Coordena o crescimento e a divisão celular\n-Contém o nucléolo, onde é produzido o RNA ribossômico.");
    };
}