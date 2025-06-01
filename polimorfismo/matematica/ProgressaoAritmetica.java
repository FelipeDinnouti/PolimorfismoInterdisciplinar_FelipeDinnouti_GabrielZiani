package polimorfismo.matematica;
public class ProgressaoAritmetica extends Progressoes {

    public ProgressaoAritmetica (int razao, int primeiroTermo) {
        super(razao, primeiroTermo);
    }

    public void mostrarDefinicao() {
        System.out.println("Uma progressão aritmética é uma sequência formada por termos que se diferenciam um do outro por um valor constante, que recebe o nome de razão.");
    };
    public double calcularTermoGeral(int numTermos) {
        return (getPrimeiroTermo()) + ((numTermos - 1) * getRazao());
    };
    public double calcularSomaDosTermos(int numTermos) {
        return ((getPrimeiroTermo() + calcularTermoGeral(numTermos))/2) * numTermos;
    };
    public void mostrarDados() {
        System.out.println("- Razão: " + getRazao());
        System.out.println("- Primeiro Termo: " + getPrimeiroTermo());
    }
}
