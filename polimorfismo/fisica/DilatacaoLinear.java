package polimorfismo.fisica;

public class DilatacaoLinear extends DilatacaoTermica {
    public void mostrarDefinicao() {
        System.out.println("\n\n\nDefinção de Dilatação Térmica:\nA dilatação linear considera a dilatação sofrida por um corpo apenas em uma das suas dimensões. É o que acontece, por exemplo, com um fio, em que o seu comprimento é mais relevante do que a sua espessura.\n\n");
    };
    public double calcularDilatacao(double tamanhoInicial) {
        return (tamanhoInicial * getCoeficienteDeDilatacao() * getCoeficienteDeDilatacao());
    };
}
