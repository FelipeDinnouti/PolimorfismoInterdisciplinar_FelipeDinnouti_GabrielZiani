public class ProgressaoGeometrica extends Progressoes {

    public void mostrarDefinicao() {
        System.out.println("Uma progressão geométrica é formada quando uma sequência tem um fator multiplicador resultado da divisão de dois termos consecutivos, chamada de razão comum.");
    };
    public int calcularTermoGeral(int numTermos) {
        return (int) ((getPrimeiroTermo()) * Math.pow((double) getRazao(), (double) numTermos-1));
    };
    public int calcularSomaDosTermos(int numTermos) {
        return (int) (getPrimeiroTermo() * (Math.pow((double) getRazao(), (double) numTermos) - 1)/(getRazao() - 1));
    };
}
