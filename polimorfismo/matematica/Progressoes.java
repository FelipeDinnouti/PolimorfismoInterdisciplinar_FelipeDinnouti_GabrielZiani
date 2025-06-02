package polimorfismo.matematica;

// Classe mae abstrata para todas progressoes matemáticas 
public abstract class Progressoes {
    // atributos
    private int razao;
    private int primeiroTermo;

    // construtor
    public Progressoes (int razao, int primeiroTermo) {
        this.razao = razao;
        this.primeiroTermo = primeiroTermo;
    }

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

    // métodos abstratos
    public abstract void mostrarDefinicao();
    public abstract double calcularTermoGeral(int numTermos);
    public abstract double calcularSomaDosTermos(int numTermos);
    public abstract void mostrarDados();
}
