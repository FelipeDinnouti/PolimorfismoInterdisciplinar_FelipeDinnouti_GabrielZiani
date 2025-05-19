package polimorfismo.fisica;

public class DilatacaoVolumetrica extends DilatacaoTermica {
    public void mostrarDefinicao() {
        System.out.println("A dilatação volumétrica resulta do aumento no volume de um corpo, acontecendo, por exemplo, com uma barra de ouro.");
    };
    public double calcularDilatacao(double unidadeInicial) {
        return (unidadeInicial * getCoeficienteDeDilatacao() * getCoeficienteDeDilatacao());
    };
}
