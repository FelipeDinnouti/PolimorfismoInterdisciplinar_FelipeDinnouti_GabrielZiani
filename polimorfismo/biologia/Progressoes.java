package polimorfismo.biologia;
public abstract class Progressoes {
    private int razao;
    private int primeiroTermo;

    public int getRazao() {
        return razao;
    }

    public void setRazao(int razao) {
        this.razao = razao;
    }

    public int getPrimeiroTermo() {
        return primeiroTermo;
    }

    public void setPrimeiroTermo(int primeiroTermo) {
        this.primeiroTermo = primeiroTermo;
    }

    public abstract void mostrarDefinicao();
    public abstract int calcularTermoGeral(int numTermos);
    public abstract int calcularSomaDosTermos(int numTermos);
}
