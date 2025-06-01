package polimorfismo.matematica;
public class ProgressaoGeometrica extends Progressoes {
    
    public ProgressaoGeometrica (int razao, int primeiroTermo) {
        super(razao, primeiroTermo);
    }

    @Override
    public void mostrarDefinicao() {
        System.out.println("Uma progressão geométrica é formada quando uma sequência tem um fator multiplicador resultado da divisão de dois termos consecutivos, chamada de razão comum.");
    };
    @Override
    public double calcularTermoGeral(int numTermos) {
        return (int) ((getPrimeiroTermo()) * Math.pow((double) getRazao(), (double) numTermos-1));
    };
    @Override
    public double calcularSomaDosTermos(int numTermos) {
        return (getPrimeiroTermo() * (Math.pow((double) getRazao(), (double) numTermos) - 1)/(getRazao() - 1));
    };
    @Override
    public void mostrarDados() {
        System.out.println("- Razão: " + getRazao());
        System.out.println("- Primeiro Termo: " + getPrimeiroTermo());
    }
}
