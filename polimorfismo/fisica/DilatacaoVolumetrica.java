package polimorfismo.fisica;

public class DilatacaoVolumetrica extends DilatacaoTermica {
    public void mostrarDefinicao() {
        System.out.println("\n\n\nDefinição de Dilatação Volumétrica:\nA dilatação volumétrica resulta do aumento no volume de um corpo, acontecendo, por exemplo, com uma barra de ouro.\n\n");
    };
    public double calcularDilatacao(double unidadeInicial) {
        return (unidadeInicial * getCoeficienteDeDilatacao() * getCoeficienteDeDilatacao());
    };
}
