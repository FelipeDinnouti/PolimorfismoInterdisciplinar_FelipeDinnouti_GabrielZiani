package polimorfismo.matematica;
public class ProgressaoHarmonica extends Progressoes {
    public void mostrarDefinicao() {
        System.out.println("Uma progressão aritmética é uma sequência formada por termos que se diferenciam um do outro por um valor constante, que recebe o nome de razão.");
    };
    public double calcularTermoGeral(int numTermos) {
        return 1/(getPrimeiroTermo()) + ((numTermos - 1) * getRazao());
    };
    public double calcularSomaDosTermos(int numTermos) {
        int razao = getRazao();
        int primeiroTermo = getPrimeiroTermo()*2; // Ele é sempre usado multiplicado nessa fórmula

        return (1/razao*Math.log((primeiroTermo+(2*numTermos-1)*razao)/(primeiroTermo-razao)));
    };
}
