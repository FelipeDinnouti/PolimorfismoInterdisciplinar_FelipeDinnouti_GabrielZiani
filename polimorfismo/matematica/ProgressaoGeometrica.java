package polimorfismo.matematica;

import polimorfismo.misc.MyColor;

public class ProgressaoGeometrica extends Progressoes {
    
    // construtor
    public ProgressaoGeometrica (int razao, int primeiroTermo) {
        super(razao, primeiroTermo);
    }

    // métodos abstratos da classe mãe
    @Override
    public void mostrarDefinicao() {
        System.out.println("Uma " + MyColor.ANSI_BLUE + "progressão geométrica" + MyColor.ANSI_RESET + " é formada quando uma sequência tem um fator multiplicador resultado da divisão de dois termos consecutivos, chamada de razão comum.");
        System.out.println("\n\nsAs principais fórmulas de uma progressão geométrica são a do cálculo do Termo Geral e a Soma dos Termos: ");
        System.out.println("\nTermo geral:      " + MyColor.ANSI_BLUE + "an = a1 * q^(n - 1)\n\n" + MyColor.ANSI_RESET);
        System.out.println("Em que: 'an' é o termo geral, 'a1' é o primeiro termo, 'n' representa o número de termos e 'q' é a razão.");
        System.out.println("A razão em uma PG é o fator constante pelo qual se multiplica um termo por outro para obter o seguinte.");
        System.out.println("\nSoma dos n termos: " + MyColor.ANSI_BLUE + "Sn = a1 * (q^n - 1) / (q - 1)\n\n" + MyColor.ANSI_RESET);
        System.out.println("Em que: 'Sn' é a soma dos termos, 'a1' é o primeiro termo, 'n' representa o número de termos e 'q' é a razão.");
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
