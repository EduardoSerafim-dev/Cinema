public class Pipoca extends Lanche {


    private char tamanho;

	public Pipoca() {

        super();
        tamanho = ' ';
	}

	public Pipoca(int id, String nome, double preco, char tamanho) {

        super(id, nome, preco);
        this.tamanho = tamanho;
	}

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("Detalhes do lanche: \n");

        System.out.println("id: " + super.getId());
        System.out.println("nome: " + super.getNome());
        System.out.println("preço: " + super.getPreco());
        System.out.println("tamanho: " + tamanho);

    }

}
