package polimorfismo.fisica;

public class DilatacaoLinear extends DilatacaoTermica {
    @Override
    public void mostrarDefinicao() {
        System.out.println("\nDefinição de Dilatação Linear:\nA dilatação linear considera a dilatação sofrida por um corpo apenas em uma das suas dimensões. É o que acontece, por exemplo, com um fio, em que o seu comprimento é mais relevante do que a sua espessura.");
        System.out.println("Fórmula para o cálculo de Dilatação Linear: DeltaL = L0 * alfa * DeltaT");
        System.out.println("Em que: \nDeltaL: variação de comprimento\nL0: comprimento inicial\nalfa: coeficiente de dilatação linear\nDeltaT: variação de temperatura");
    };
    @Override
    public double calcularDilatacao(double comprimentoInicial) {
        return (comprimentoInicial * getCoeficienteDeDilatacao() * getVariacaoTemperatura());
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
