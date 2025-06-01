package polimorfismo.matematica;
public class ProgressaoGeometrica extends Progressoes {
    
    public ProgressaoGeometrica (int razao, int primeiroTermo) {
        super(razao, primeiroTermo);
    }

    public void mostrarDefinicao() {
        System.out.println("Uma progressão geométrica é formada quando uma sequência tem um fator multiplicador resultado da divisão de dois termos consecutivos, chamada de razão comum.");
    };
    public double calcularTermoGeral(int numTermos) {
        return (int) ((getPrimeiroTermo()) * Math.pow((double) getRazao(), (double) numTermos-1));
    };
    public double calcularSomaDosTermos(int numTermos) {
        return (getPrimeiroTermo() * (Math.pow((double) getRazao(), (double) numTermos) - 1)/(getRazao() - 1));
    };
    public void mostrarDados() {
        System.out.println("- Razão: " + getRazao());
        System.out.println("- Primeiro Termo: " + getPrimeiroTermo());
    }
}
