package polimorfismo.biologia;
public class Nucleo extends OrganelasCelulares {

    @Override
    public void mostrarLocalizacao(){
        System.out.println("O núcleo se localiza no centro do citoplasma celular.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções do Núcleo são: \nArmazena o material genético (DNA)\nControla as atividades da célula (síntese de proteínas, metabolismo)\nRegula a expressão gênica\nCoordena o crescimento e a divisão celular\nContém o nucléolo, onde é produzido o RNA ribossômico.");
    };
}