package visitor;

public class Sindico implements Pessoa {

    private int apartamento;
    private String nome;
    private String mandato;

    public Sindico(int apartamento, String nome, String mandato) {
        this.apartamento = apartamento;
        this.nome = nome;
        this.mandato = mandato;
    }

    public int getApartamento() {
        return apartamento;
    }

    public String getNome() {
        return nome;
    }

    public String getMandato() {
        return mandato;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirSindico(this);
    }

}
