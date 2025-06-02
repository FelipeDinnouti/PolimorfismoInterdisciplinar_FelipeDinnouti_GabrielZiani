package polimorfismo.fisica;

import polimorfismo.misc.Input;
import polimorfismo.misc.MyColor;

public class DilatacaoLinear extends DilatacaoTermica {
    // métodos abstratos da classe mãe
    @Override
    public void mostrarDefinicao() {
        System.out.println("\nDefinição de Dilatação Linear:\nA dilatação linear considera a dilatação sofrida por um corpo apenas em uma das suas dimensões. É o que acontece, por exemplo, com um fio, em que o seu comprimento é mais relevante do que a sua espessura.");
        System.out.println("Fórmula para o cálculo de Dilatação Linear: DeltaL = L0 * alfa * DeltaT");
        System.out.println("Em que: \nDeltaL: variação de comprimento\nL0: comprimento inicial\nalfa: coeficiente de dilatação linear\nDeltaT: variação de temperatura");
    };
    @Override
    public double calcularDilatacao(double comprimentoInicial) {
        return (comprimentoInicial * getCoeficienteDeDilatacao() * getVariacaoTemperatura());
    };
    @Override
    public void aplicarExercicio() {
        int tamanhoTrem = (int) (5+(Math.random()*10));
        int variacaoTemperatura = (int) (20+(Math.random()*20));
        int coeficiente = (int) (10+(Math.random()*10));

        this.setCoeficienteDeDilatacao(coeficiente*(Math.pow(10, -1)));
        this.setVariacaoTemperatura(variacaoTemperatura);

        System.out.print(String.format("\nExercício:\nUm trilho de trem de %d metros tem seu comprimento alterado devido à variação de %d°C ao longo do dia." +
                                        "Possuindo um coeficiente de dilatação linear de %d ºC, determine o comprimento final do trilho.\n\nSua resposta (em metros): ", tamanhoTrem, variacaoTemperatura, coeficiente));
        
        String respostaCerta = (tamanhoTrem + this.calcularDilatacao(tamanhoTrem)) + "m";
        String respostaUsuario = Input.readLine();

        if (respostaUsuario.equals(respostaCerta)) {
            System.out.println(MyColor.ANSI_GREEN + "\nMuito bem, Você acertou!\n" + MyColor.ANSI_RESET);
        } else {
            System.out.println("\nResposta incorreta. Resposta esperada: " + respostaCerta);
        }
    }
}
