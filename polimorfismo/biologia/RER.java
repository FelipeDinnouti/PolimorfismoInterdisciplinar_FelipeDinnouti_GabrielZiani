package polimorfismo.biologia;
public class RER extends OrganelasCelulares {

    // métodos abstratos da classe mãe
    @Override
    public void mostrarLocalizacao(){
        System.out.println("O retículo endoplasmático rugoso se localiza perto do retículo endoplasmático liso, do complexo golgiense e em volta do núcleo. Possui ribossomos aderidos à sua superfície externa.");
    };
    @Override
    public void mostrarFuncao(){
        System.out.println("As principais funções do Retículo Endoplasmático Rugoso são: \n-Síntese de proteínas\n-Transporte de proteínas para outras organelas ou para fora da célula\n-Possui ribossomos aderidos à sua superfície.");

    };
}