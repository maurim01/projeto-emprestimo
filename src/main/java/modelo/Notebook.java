package modelo;

public class Notebook extends Item{

    public Notebook(String patrimonio, String descricao) {
        super(patrimonio, descricao);
    }

    public Notebook(String patrimonio, String descricao, boolean disponivel) {
        super(patrimonio, descricao, disponivel);
    }

    @Override
    public int getPrazoDias() {
        return 7;
    }
}
