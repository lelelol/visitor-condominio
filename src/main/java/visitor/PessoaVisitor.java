package visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirMorador(Morador morador) {
        return "Morador{" +
                "apartamento=" + morador.getApartamento() +
                ", nome='" + morador.getNome() + '\'' +
                ", bloco=" + morador.getNomeBloco() +
                '}';
    }

    @Override
    public String exibirSindico(Sindico sindico) {
        return "Sindico{" +
                "apartamento=" + sindico.getApartamento() +
                ", nome='" + sindico.getNome() + '\'' +
                ", mandato='" + sindico.getMandato() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}
