import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionarioLanchonete extends Funcionario implements Vendedor {


    private ArrayList<Pedido> pedidosAtendidos = new ArrayList<>();

    public FuncionarioLanchonete() {

        super();
        pedidosAtendidos = null;
    }

    public FuncionarioLanchonete(String cpf, String nome, ArrayList<Pedido> pedidosAtendidos) {

        super(cpf, nome);
        this.pedidosAtendidos = pedidosAtendidos;

    }

    public ArrayList<Pedido> getPedidosAtendidos() {
        return pedidosAtendidos;
    }

    public void setPedidosAtendidos(ArrayList<Pedido> pedidosAtendidos) {
        this.pedidosAtendidos = pedidosAtendidos;
    }

    public double calcularComissao() {

        return pedidosAtendidos.size() * 0.75;
    }

    public void vender() {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Lanche> listaLanchesEscolhidos = new ArrayList<>();

        while (true) {

            try {

                Main.cadLanche.listarLanches();

                System.out.print("Escolha um lanche (digite o id): ");
                Lanche lancheEscolhido = Main.cadLanche.consultarLanche(teclado.nextInt());

                if (lancheEscolhido == null) {
                    System.out.println("Lanche não encontrado.");
                    return;
                }

                listaLanchesEscolhidos.add(lancheEscolhido);
                System.out.println("\nLanche escolhido com sucesso!\n");

                boolean sair = false;

                while (true) {

                    try {

                        System.out.print("Deseja adicionar outro (1 - Sim) (2 - Não) ? ");
                        int escolha = teclado.nextInt();

                        if (escolha == 1) {
                            break;

                        } else if (escolha == 2) {
                            sair = true;
                            break;

                        } else {
                            System.out.println("\nOpção inválida, por favor tente novamente.");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("\nOpção inválida, digite somente números!");
                        teclado.nextLine();
                    }
                }

                if (sair) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Opção inválida, digite somente números!");
                return;
            }
        }

        System.out.print("\nInsira um ID para o pedido: ");
        int id = teclado.nextInt();

        Pedido novoPedido = new Pedido(id, listaLanchesEscolhidos);
        Main.cadPedido.adicionarPedido(novoPedido);
        pedidosAtendidos.add(novoPedido);

        System.out.println("\nPedido realizado com sucesso!");

    }
}
