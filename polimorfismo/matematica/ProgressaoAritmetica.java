package polimorfismo.matematica;
public class ProgressaoAritmetica extends Progressoes {

    public ProgressaoAritmetica (int razao, int primeiroTermo) {
        super(razao, primeiroTermo);
    }

    @Override
    public void mostrarDefinicao() {
        System.out.println("Uma progressão aritmética é uma sequência formada por termos que se diferenciam um do outro por um valor constante, que recebe o nome de razão.");
    };
    @Override
    public double calcularTermoGeral(int numTermos) {
        return (getPrimeiroTermo()) + ((numTermos - 1) * getRazao());
    };
    @Override
    public double calcularSomaDosTermos(int numTermos) {
        return ((getPrimeiroTermo() + calcularTermoGeral(numTermos))/2) * numTermos;
    };
    @Override
    public void mostrarDados() {
        System.out.println("- Razão: " + getRazao());
        System.out.println("- Primeiro Termo: " + getPrimeiroTermo());
    }
}
