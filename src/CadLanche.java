import java.util.ArrayList;

public class CadLanche {

    private ArrayList<Lanche> lanches = new ArrayList<>();

    public boolean adicionarLanche(Lanche lanche) {

        if (lanche != null) {
            lanches.add(lanche);
            return true;
        }

        return false;
    }

    public boolean atualizarLanche(Lanche lanche) {

        Lanche lancheExistente = consultarLanche(lanche.getId());

        if (lancheExistente == null) {
            return false;
        }

        lancheExistente = lanche;
        return true;
    }

    public Lanche consultarLanche(int id) {

        for (Lanche lanche : lanches) {

            if (lanche.getId() == id) {

                return lanche;
            }
        }
        return null;
    }

    public boolean excluirLanche(Lanche lanche) {

        Lanche lancheEncontrado = consultarLanche(lanche.getId());

        if (lancheEncontrado == null) {
            return false;
        }

        lanches.remove(lancheEncontrado);
        return true;

    }

    public void listarLanches() {

        if (lanches.isEmpty()) {

            System.out.println("Não existem lanches disponíveis, por favor cadastrar novo lanche.");
            return;
        }

        System.out.println("Lista de lanches: \n");

        for (Lanche lancheLista : lanches) {

            lancheLista.exibirDetalhes();
            System.out.println();
        }

    }

}
