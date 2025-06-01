package polimorfismo.fisica;

public class DilatacaoSuperficial extends DilatacaoTermica {
    @Override
    public void mostrarDefinicao() {
        System.out.println("\nDefinição de Dilatação Superficial:\nA dilatação superficial considera a dilatação sofrida por uma determinada superfície. É o que acontece, por exemplo, com uma chapa de metal delgada.");
        System.out.println("Fórmula para o cálculo de Dilatação Superficial: DeltaA = A0 * beta * DeltaT");
        System.out.println("Em que: \nDeltaA: variação da área\nA0: área inicial\nbeta: coeficiente de dilatação superficial (aproximadamente 2alfa)\nDeltaT: variação de temperatura");
    };
    @Override
    public double calcularDilatacao(double areaInicial) {
        return (areaInicial * getCoeficienteDeDilatacao() * getVariacaoTemperatura());
    };
    @Override
    public void exercicio1() {
        System.out.println("");
    }
    @Override
    public void exercicio2() {
        System.out.println("");
    }
}
