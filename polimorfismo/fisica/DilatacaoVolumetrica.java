package polimorfismo.fisica;

public class DilatacaoVolumetrica extends DilatacaoTermica {

    // métodos abstratos da classe mãe
    @Override
    public void mostrarDefinicao() {
        System.out.println("\nDefinição de Dilatação Volumétrica:\nA dilatação volumétrica resulta do aumento no volume de um corpo, acontecendo, por exemplo, com uma barra de ouro.");
        System.out.println("Fórmula para o cálculo de Dilatação Volumétrica: DeltaV = V0 * gama * DeltaT");
        System.out.println("Em que: \nDeltaV: variação de volume\nV0: volume inicial\ngama: coeficiente de dilatação volumétrica (aproximadamente 3alfa)\nDeltaT: variação de temperatura");
    };
    @Override
    public double calcularDilatacao(double volumeInicial) {
        return (volumeInicial * getCoeficienteDeDilatacao() * getVariacaoTemperatura());
    };
}
