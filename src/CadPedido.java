import java.util.ArrayList;

public class CadPedido {

    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public boolean adicionarPedido(Pedido pedido) {

        if (pedido != null) {
            pedidos.add(pedido);
            return true;
        }
        return false;
    }

    public boolean atualizarPedido(Pedido pedido) {

        Pedido pedidoExistente = consultarPedido(pedido.getId());

        if (pedidoExistente == null) {
            return false;
        }

        pedidoExistente = pedido;
        return true;
    }

    public Pedido consultarPedido(int id) {

        for (Pedido pedido : pedidos) {

            if (pedido.getId() == (id)) {
                return pedido;
            }
        }
        return null;
    }

    public boolean excluirPedido(Pedido pedido) {

        Pedido pedidoEncontrado = consultarPedido(pedido.getId());

        if (pedidoEncontrado == null) {
            return false;
        }

        pedidos.remove(pedidoEncontrado);
        return true;
    }

    public void listarPedidos() {

        System.out.println("Lista de pedidos: \n");

        for (Pedido pedido : pedidos) {

            System.out.println("==============================\n");

            System.out.println("id: " + pedido.getId());

            System.out.println("Lanches: \n");

            for (Lanche lanche : pedido.getLanches()) {

                lanche.exibirDetalhes();
                System.out.println();
            }
        }
    }
}
