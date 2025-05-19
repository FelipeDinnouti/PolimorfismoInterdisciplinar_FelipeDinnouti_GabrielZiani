package polimorfismo;

import polimorfismo.matematica.ProgressaoHarmonica;

public class Main {
    public static void main(String[] args) {
        ProgressaoHarmonica progressaoHarmonica = new ProgressaoHarmonica();
        progressaoHarmonica.setRazao(3);
        progressaoHarmonica.setPrimeiroTermo(2);
        
        System.out.print("Soma dos termos: ");
        System.out.println(progressaoHarmonica.calcularSomaDosTermos(10));

        System.out.print("Termos: ");
        for (int i = 0; i<8; i++) {
            System.out.print(progressaoHarmonica.calcularTermoGeral(i) + ", ");
        }

    }
}
