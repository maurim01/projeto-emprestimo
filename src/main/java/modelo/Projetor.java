package modelo;

public class Projetor extends Item{

    public Projetor(String patrimonio, String descricao, boolean disponivel) {
        super(patrimonio, descricao, new MultaProgressiva(), disponivel);
    }

    public Projetor(String patrimonio, String descricao) {
        this(patrimonio, descricao, true);
    }

    @Override
    public int getPrazoDias() {
        return 2;
    }
}
