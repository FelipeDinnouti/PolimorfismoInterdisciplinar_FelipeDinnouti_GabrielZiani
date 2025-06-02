package polimorfismo.fisica;

import polimorfismo.misc.Input;
import polimorfismo.misc.MyColor;

public class DilatacaoVolumetrica extends DilatacaoTermica {

    // métodos abstratos da classe mãe
    @Override
    public void mostrarDefinicao() {
        System.out.println("\nDefinição de Dilatação Volumétrica:\nA dilatação volumétrica resulta do aumento no volume de um corpo, acontecendo, por exemplo, com uma barra de ouro.");
        System.out.println("Fórmula para o cálculo de Dilatação Volumétrica: DeltaV = V0 * gama * DeltaT");
        System.out.println("Em que: \nDeltaV: variação de volume\nV0: volume inicial\ngama: coeficiente de dilatação volumétrica (aproximadamente 3alfa)\nDeltaT: variação de temperatura");
    };
    @Override
    public double calcularDilatacao(double volumeInicial) {
        return (volumeInicial * getCoeficienteDeDilatacao() * getVariacaoTemperatura());
    };
    @Override
    public void aplicarExercicio() {
        int tamanho = (int) (5+(Math.random()*10));
        int variacaoTemperatura = (int) (20+(Math.random()*20));
        int coeficiente = (int) (10+(Math.random()*10));

        this.setCoeficienteDeDilatacao(coeficiente*(Math.pow(10, -1)));
        this.setVariacaoTemperatura(variacaoTemperatura);

        System.out.print(String.format("\nExercício:\nUm lindo cubo de tungstênio tem  %dm³ de volume que é alterado devido à variação de %d°C ao longo do dia." +
                                        "Possuindo um coeficiente de dilatação linear de %d ºC, determine o comprimento final do cubo.\n\nSua resposta (em metros): ", tamanho, variacaoTemperatura, coeficiente));
        
        String respostaCerta = (tamanho + this.calcularDilatacao(tamanho)) + "m";
        String respostaUsuario = Input.readLine();

        if (respostaUsuario.equals(respostaCerta)) {
            System.out.println(MyColor.ANSI_GREEN + "\nMuito bem, Você acertou!\n" + MyColor.ANSI_RESET);
        } else {
            System.out.println("\nResposta incorreta. Resposta esperada: " + respostaCerta);
        }
    }
}
