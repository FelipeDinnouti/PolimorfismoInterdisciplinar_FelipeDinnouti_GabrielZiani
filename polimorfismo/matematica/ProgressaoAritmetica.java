package polimorfismo.matematica;
public class ProgressaoAritmetica extends Progressoes {
    public void mostrarDefinicao() {
        System.out.println("Uma progressão aritmética é uma sequência formada por termos que se diferenciam um do outro por um valor constante, que recebe o nome de razão.");
    };
    public int calcularTermoGeral(int numTermos) {
        return (getPrimeiroTermo()) + ((numTermos - 1) * getRazao());
    };
    public int calcularSomaDosTermos(int numTermos) {
        return ((getPrimeiroTermo() + calcularTermoGeral(numTermos))/2) * numTermos;
    };
}
