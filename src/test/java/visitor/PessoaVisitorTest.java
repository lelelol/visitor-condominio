package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirMorador() {
        Morador morador = new Morador(101, "Ana", new Bloco("Bloco A"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Morador{apartamento=101, nome='Ana', bloco=Bloco A}", visitor.exibir(morador));
    }

    @Test
    void deveExibirSindico() {
        Sindico sindico = new Sindico(1, "Maria", "2025-2027");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Sindico{apartamento=1, nome='Maria', mandato='2025-2027'}", visitor.exibir(sindico));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Pedro', salario=5000.0}", visitor.exibir(funcionario));
    }

}
