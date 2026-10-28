import java.util.ArrayList;

public class Pedido {

	private int id;
    private ArrayList<Lanche> lanches;

	public Pedido() {

        id = 0;
        lanches = null;
	}

	public Pedido(int id, ArrayList<Lanche> lanches) {

        this.id = id;
        this.lanches = lanches;

	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Lanche> getLanches() {
        return lanches;
    }

    public void setLanches(ArrayList<Lanche> lanches) {
        this.lanches = lanches;
    }

}
