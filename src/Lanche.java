public abstract class Lanche {


    private int id;
    private String nome;
    private double preco;

	public Lanche() {

        id = 0;
        nome = "";
        preco = 0;
	}

	public Lanche(int id, String nome, double preco) {

        this.id = id;
        this.nome = nome;
        this.preco = preco;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

	public void exibirDetalhes() {

        System.out.println("Detalhes do lanche: \n");

        System.out.println("id: " + id);
        System.out.println("nome: " + nome);
        System.out.println("preco: " + preco);

	}

}
