package polimorfismo.matematica;
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

    public void printTermos(int n) {
        System.out.println("Calculando termos: ");
        for (int i = 0; i<n; i++) {
            System.out.print(i + ": "); 
            double result = calcularTermoGeral(i);
            System.out.print(" = " + result + "\n");
        }
    }

    public abstract void mostrarDefinicao();
    public abstract double calcularTermoGeral(int numTermos);
    public abstract double calcularSomaDosTermos(int numTermos);
}
