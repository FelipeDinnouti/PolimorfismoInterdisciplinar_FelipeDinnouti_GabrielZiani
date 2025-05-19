package polimorfismo.fisica;

public class DilatacaoSuperficial extends DilatacaoTermica {
    public void mostrarDefinicao() {
        System.out.println("A dilatação superficial considera a dilatação sofrida por uma determinada superfície. É o que acontece, por exemplo, com uma chapa de metal delgada.");
    };
    public double calcularDilatacao(double unidadeInicial) {
        return (unidadeInicial * getCoeficienteDeDilatacao() * getCoeficienteDeDilatacao());
    };
}
