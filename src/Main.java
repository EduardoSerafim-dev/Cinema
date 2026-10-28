import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static CadSala cadSala = new CadSala();
    public static CadFuncionario cadFuncionario = new CadFuncionario();
    public static CadSessao cadSessao = new CadSessao();
    public static CadFilme cadFilme = new CadFilme();
    public static CadIngresso cadIngresso = new CadIngresso();
    public static CadLanche cadLanche = new CadLanche();
    public static CadPedido cadPedido = new CadPedido();
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            try {


                System.out.println("\n-------Bem Vindo ao Sistema de Pizzaria-------\n");


                System.out.println("Opções como Funcionário:\n");

                System.out.println("[1] - Gerenciar funcionários");
                System.out.println("[2] - Gerenciar salas");
                System.out.println("[3] - Calcular comissão");

                System.out.println("\nOpções como Funcionário da Bilheteria:\n");

                System.out.println("[4] - Vender ingresso");
                System.out.println("[5] - Gerenciar ingressos");
                System.out.println("[6] - Gerenciar sessões");
                System.out.println("[7] - Gerenciar filmes");

                System.out.println("\nOpções como Funcionário da Lanchonete:\n");

                System.out.println("[8] - Vender lanche");
                System.out.println("[9] - Gerenciar pedidos");
                System.out.println("[10] - Gerenciar lanches");

                System.out.print("\nEscolha uma das opções acima: ");
                int escolha = teclado.nextInt();
                System.out.println();

                switch (escolha) {

                    case (1):

                        try {

                            System.out.println("          ---Gerenciar funcionários---");

                            System.out.println("[1] - Consultar funcionário");
                            System.out.println("[2] - Listar funcionários");
                            System.out.println("[3] - Excluir funcionário");
                            System.out.println("[4] - Atualizar funcionário");
                            System.out.println("[5] - Cadastrar funcionário");

                            System.out.println("\nEscolha uma das opções acima: ");
                            int opcao = teclado.nextInt();

                            switch (opcao) {

                                case (1):
                                case (2):
                                case (3):
                                case (4):
                                case (5):

                            }

                            break;


                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida, digite somente números!");
                            break;
                        }

                    case (2):

                        try {

                            System.out.println("          ---Gerenciar salas---");

                            System.out.println(" Cadastrar sala");
                            System.out.println(" Consultar sala");
                            System.out.println(" Listar salas");
                            System.out.println(" Atualizar sala");
                            System.out.println(" Excluir sala");

                            System.out.println("\nEscolha uma das opções acima: ");
                            int opcao = teclado.nextInt();

                            switch (opcao) {

                                case (1):
                                case (2):
                                case (3):
                                case (4):
                                case (5):

                            }

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida, digite somente números!");
                            break;
                        }

                    case (3):

                        try {

                            System.out.println("          ---Calcular comissão---");

                            System.out.println(" Comissão:");

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida, digite somente números!");
                            break;
                        }

                    case (4):

                        try {

                            System.out.println("          _________Funcionário da Bilheteria_________\n");

                            System.out.println("          ---Vender ingresso---\n");

//                            CadIngresso

                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida, digite somente números!");
                            break;
                        }

                    case (5):

                        try {
                            System.out.println("          _________Funcionário da Bilheteria_________\n");

                            System.out.println("          ---Gerenciar ingressos---\n");

                            System.out.println("[1] - Consultar ingresso");
                            System.out.println("[2] - Listar ingressos");
                            System.out.println("[4] - Atualizar ingresso");
                            System.out.println("[3] - Excluir ingresso");

                            System.out.print("\nEscolha uma das opções acima: ");
                            int opcao = teclado.nextInt();

                            switch (opcao) {

                                case (1):
                                case (2):
                                case (3):
                                case (4):
                                case (5):

                            }

                            break;


                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida, digite somente números!");
                            break;
                        }

                    case (6):

                        try {

                            System.out.println("          ---Gerenciar sessões---");

                            System.out.println(" Cadastrar sessão");
                            System.out.println(" Consultar sessão");
                            System.out.println(" Listar sessões");
                            System.out.println(" Atualizar sessão");
                            System.out.println(" Excluir sessão");

                            System.out.println("\nEscolha uma das opções acima: ");
                            int opcao = teclado.nextInt();

                            switch (opcao) {

                                case (1):
                                case (2):
                                case (3):
                                case (4):
                                case (5):

                            }

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida, digite somente números!");
                            break;
                        }

                    case (7):

                        try {

                            System.out.println("          ---Gerenciar filmes---");

                            System.out.println("[1] - Cadastrar filme");
                            System.out.println("[2] - Consultar filme");
                            System.out.println("[3] - Listar filmes");
                            System.out.println("[4] - Atualizar filme");
                            System.out.println("[5] - Excluir filme");

                            System.out.println("\nEscolha uma das opções acima: ");
                            int opcao = teclado.nextInt();

                            switch (opcao) {

                                case (1):
                                case (2):
                                case (3):
                                case (4):
                                case (5):
                                default:
                                    System.out.println("Opção inválida! Por favor, insira somente números disponíveis.");
                                    break;

                            }

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida, digite somente números!");
                            break;
                        }

                    case (8):

                        System.out.println("          ---Vender lanche---\n");

                        Lanche pipoca = new Pipoca(1, "pipoca", 12, 'G');
                        cadLanche.adicionarLanche(pipoca);
                        FuncionarioLanchonete funcionario1 = new FuncionarioLanchonete("54", "Eduardo", null);
                        funcionario1.vender();
                        break;


                    case (9):

                        try {

                            System.out.println("          ---Gerenciar pedidos---");

                            System.out.println(" Consultar pedido");
                            System.out.println(" Listar pedidos");
                            System.out.println(" Atualizar pedido");
                            System.out.println(" Excluir pedido");

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida, digite somente números!");
                            break;
                        }

                    case (10):

                        try {

                            System.out.println("          ---Gerenciar lanches---");

                            System.out.println(" Cadastrar lanche");
                            System.out.println(" Consultar lanche");
                            System.out.println(" Listar lanches");
                            System.out.println(" Atualizar lanche");
                            System.out.println(" Excluir lanche");

                            break;

                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida, digite somente números!");
                            break;
                        }

                    default:
                        System.out.println("Opção inválida! Por favor, insira somente números disponíveis.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Opção inválida, digite somente números!");
                teclado.nextLine();

            }
        }
    }

}
