package polimorfismo.fisica;

import polimorfismo.misc.Input;
import polimorfismo.misc.MyColor;

public class DilatacaoSuperficial extends DilatacaoTermica {
    // métodos abstratos da classe mãe
    @Override
    public void mostrarDefinicao() {
        System.out.println("\nDefinição de Dilatação Superficial:\nA dilatação superficial considera a dilatação sofrida por uma determinada superfície. É o que acontece, por exemplo, com uma chapa de metal delgada.");
        System.out.println("Fórmula para o cálculo de Dilatação Superficial: DeltaA = A0 * beta * DeltaT");
        System.out.println("Em que: \nDeltaA: variação da área\nA0: área inicial\nbeta: coeficiente de dilatação superficial (aproximadamente 2alfa)\nDeltaT: variação de temperatura");
    };
    @Override
    public double calcularDilatacao(double areaInicial) {
        return (areaInicial * getCoeficienteDeDilatacao() * getVariacaoTemperatura());
    };
    @Override
    public void aplicarExercicio() {
        int tamanho = (int) (5+(Math.random()*10));
        int variacaoTemperatura = (int) (20+(Math.random()*20));
        int coeficiente = (int) (10+(Math.random()*10));

        this.setCoeficienteDeDilatacao(coeficiente*(Math.pow(10, -1)));
        this.setVariacaoTemperatura(variacaoTemperatura);

        System.out.print(String.format("\nExercício:\nUma placa de ferro plana tem  %dm² e tem sua àrea alterada devido à variação de %d°C ao longo do dia." +
                                        "Possuindo um coeficiente de dilatação linear de %d ºC, determine o comprimento final da placa.\n\nSua resposta (em metros): ", tamanho, variacaoTemperatura, coeficiente));
        
        String respostaCerta = (tamanho + this.calcularDilatacao(tamanho)) + "m";
        String respostaUsuario = Input.readLine();

        if (respostaUsuario.equals(respostaCerta)) {
            System.out.println(MyColor.ANSI_GREEN + "\nMuito bem, Você acertou!\n" + MyColor.ANSI_RESET);
        } else {
            System.out.println("\nResposta incorreta. Resposta esperada: " + respostaCerta);
        }
    }
}
