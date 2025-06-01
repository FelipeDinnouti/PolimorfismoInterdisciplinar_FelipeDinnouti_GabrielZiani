package polimorfismo.fisica;

public abstract class DilatacaoTermica {
    private int variacaoTemperatura;
    private double coeficienteDeDilatacao;

    public int getVariacaoTemperatura() {
        return variacaoTemperatura;
    }

    public void setVariacaoTemperatura(int variacaoTemperatura) {
        this.variacaoTemperatura = variacaoTemperatura;
    }

    public double getCoeficienteDeDilatacao() {
        return coeficienteDeDilatacao;
    }

    public void setCoeficienteDeDilatacao(double coeficienteDeDilatacao) {
        this.coeficienteDeDilatacao = coeficienteDeDilatacao;
    }

    public abstract void mostrarDefinicao();
    public abstract double calcularDilatacao(double unidadeInicial);
    public abstract void exercicio1();
    public abstract void exercicio2();
}
