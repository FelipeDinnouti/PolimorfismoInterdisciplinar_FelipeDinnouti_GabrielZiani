package polimorfismo.matematica;
public class ProgressaoHarmonica extends Progressoes {

    public ProgressaoHarmonica (int razao, int primeiroTermo) {
        super(razao, primeiroTermo);
    }

    @Override
    public void mostrarDefinicao() {
        System.out.println("Uma progressão harmónica é uma sequência de números onde o inverso de cada termo forma uma progressão aritmética. Isso significa que a razão entre os termos inversos é constante. ");
        System.out.println("As principais fórmulas de uma progressão harmônica são a do cálculo do Termo Geral e a Soma dos Termos: ");
        System.out.println("\nTermo geral:      an = 1 / (a1 + (n - 1) * r)");
        System.out.println("Em que: 'an' é o termo geral, 'a1' é o primeiro termo, 'n' representa o número de termos e 'r' é a razão.");
        System.out.println("A razão em uma PH é a diferença constante entre termos consecutivos da sequência. Em outras palavras, é o valor que se adiciona a um termo para obter o seguinte.");
        System.out.println("\nSoma dos n termos: Sn = (1/q) * ln(((2n - 1) * q + 2a1) / (2a1 - q))");
        System.out.println("Em que: 'Sn' é a soma dos termos, 'a1' é o primeiro termo, 'n' representa o número de termos e 'q' é a razão.");
    };
    @Override
    public double calcularTermoGeral(int numTermos) {
        System.out.print(String.format("1/((%d) + ((%d - 1) * %d))", getPrimeiroTermo(), numTermos, getRazao()));
        return 1.0/((getPrimeiroTermo()) + ((numTermos - 1) * getRazao()));
    };
    @Override
    public double calcularSomaDosTermos(int numTermos) {
        int razao = getRazao();
        int primeiroTermo = getPrimeiroTermo()*2; // Ele é sempre usado multiplicado nessa fórmula

        return (1.0/razao*Math.log((primeiroTermo+(2*numTermos-1)*razao)/(primeiroTermo-razao)));
    };
    @Override
    public void mostrarDados() {
        System.out.println("- Razão: " + getRazao());
        System.out.println("- Primeiro Termo: " + getPrimeiroTermo());
    }
}   
