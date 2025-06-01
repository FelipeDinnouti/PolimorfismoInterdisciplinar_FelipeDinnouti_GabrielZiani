package polimorfismo.matematica;
public class ProgressaoAritmetica extends Progressoes {

    // construtor
    public ProgressaoAritmetica (int razao, int primeiroTermo) {
        super(razao, primeiroTermo);
    }

    // métodos abstratos da classe mãe
    @Override
    public void mostrarDefinicao() {
        System.out.println("Uma progressão aritmética é uma sequência formada por termos que se diferenciam um do outro por um valor constante, que recebe o nome de razão.");
        System.out.println("As principais fórmulas de uma progressão aritmética são a do cálculo do Termo Geral e a Soma dos Termos: ");
        System.out.println("\nTermo geral:      an = a1 + (n - 1) * r");
        System.out.println("Em que: 'an' é o termo geral, 'a1' é o primeiro termo, 'n' representa o número de termos e 'r' é a razão.");
        System.out.println("A razão em uma PA é a diferença constante entre termos consecutivos da sequência. Em outras palavras, é o valor que se adiciona a um termo para obter o seguinte.");
        System.out.println("\nSoma dos n termos: Sn = (a1 + an) * n / 2");
        System.out.println("Em que: 'Sn' é a soma dos termos, 'a1' é o primeiro termo, 'an' é o termo geral e 'n' representa o número de termos.");
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
