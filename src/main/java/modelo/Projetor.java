package modelo;

public class Projetor extends Item{

    public Projetor(String patrimonio, String descricao, boolean disponivel) {
        super(patrimonio, descricao, disponivel);
    }

    public Projetor(String patrimonio, String descricao) {
        super(patrimonio, descricao);
    }

    @Override
    public int getPrazoDias() {
        return 2;
    }
}
