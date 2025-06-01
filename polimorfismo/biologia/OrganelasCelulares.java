package polimorfismo.biologia;
public abstract class OrganelasCelulares {
    // atributos
    private String nome;
    private String funcao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    // métodos abstratos
    public abstract void mostrarLocalizacao();
    public abstract void mostrarFuncao();
}