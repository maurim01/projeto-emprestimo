package modelo;

public class Notebook extends Item{

    public Notebook(String patrimonio, String descricao, boolean disponivel) {
        super(patrimonio, descricao, new MultaFixa(), disponivel);
    }

    public Notebook(String patrimonio, String descricao) {
        this(patrimonio, descricao, true);
    }

    @Override
    public int getPrazoDias() {
        return 7;
    }

}
