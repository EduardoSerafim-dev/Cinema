import java.util.ArrayList;

public class CadFuncionario {

    private ArrayList<Funcionario> funcionarios;

    public boolean adicionarFuncionario(Funcionario funcionario) {

        funcionarios.add(funcionario);
        return true;
    }

    public boolean atualizarFuncionario(Funcionario funcionario) {

        Funcionario funcionarioExistente = consultarFuncionario(funcionario.getCpf());

        if (funcionarioExistente == null) {
            return false;
        }

        funcionarioExistente = funcionario;
        return true;
    }

    public Funcionario consultarFuncionario(String cpf) {

        for (Funcionario funcionario : funcionarios) {

            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }
        return null;
    }

    public boolean excluirFuncionario(Funcionario funcionario) {

        Funcionario funcionarioEncontrado = consultarFuncionario(funcionario.getCpf());

        if (funcionarioEncontrado == null) {
            return false;
        }

        funcionarios.remove(funcionarioEncontrado);
        return true;

    }

    public void listarFuncionarios() {

        System.out.println("Lista de Funcionários: \n");

        for (Funcionario funcionarioLista : funcionarios) {

            System.out.println(funcionarioLista.getNome());
            System.out.println(funcionarioLista.getCpf() + "\n");

        }

    }

}
