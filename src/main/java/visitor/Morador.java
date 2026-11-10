package visitor;

public class Morador implements Pessoa {

    private int apartamento;
    private String nome;
    private Bloco bloco;

    public Morador(int apartamento, String nome, Bloco bloco) {
        this.apartamento = apartamento;
        this.nome = nome;
        this.bloco = bloco;
    }

    public int getApartamento() {
        return apartamento;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeBloco() {
        return this.bloco.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMorador(this);
    }

}
