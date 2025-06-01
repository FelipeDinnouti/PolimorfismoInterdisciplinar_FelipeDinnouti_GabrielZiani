package polimorfismo.matematica;
public class ProgressaoHarmonica extends Progressoes {

    public ProgressaoHarmonica (int razao, int primeiroTermo) {
        super(razao, primeiroTermo);
    }

    public void mostrarDefinicao() {
        System.out.println("Uma progressão harmónica é uma sequência de números onde o inverso de cada termo forma uma progressão aritmética. Isso significa que a razão entre os termos inversos é constante. ");
    };
    public double calcularTermoGeral(int numTermos) {
        System.out.print(String.format("1/((%d) + ((%d - 1) * %d))", getPrimeiroTermo(), numTermos, getRazao()));
        return 1.0/((getPrimeiroTermo()) + ((numTermos - 1) * getRazao()));
    };
    public double calcularSomaDosTermos(int numTermos) {
        int razao = getRazao();
        int primeiroTermo = getPrimeiroTermo()*2; // Ele é sempre usado multiplicado nessa fórmula

        return (1.0/razao*Math.log((primeiroTermo+(2*numTermos-1)*razao)/(primeiroTermo-razao)));
    };
    public void mostrarDados() {
        System.out.println("- Razão: " + getRazao());
        System.out.println("- Primeiro Termo: " + getPrimeiroTermo());
    }
}   
