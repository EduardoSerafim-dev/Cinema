public class Bebida extends Lanche {

    private int volume;

	public Bebida() {

        super();
        volume = 0;
	}

	public Bebida(int id, String nome, double preco, int volume) {

        super(id, nome, preco);
        this.volume = volume;
	}

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("Detalhes do lanche: \n");

        System.out.println("id: " + super.getId());
        System.out.println("nome: " + super.getNome());
        System.out.println("preço: " + super.getPreco());
        System.out.println("volume: " + volume);

    }

}
