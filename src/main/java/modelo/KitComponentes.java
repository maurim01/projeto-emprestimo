package modelo;

public class KitComponentes extends Item{

    public KitComponentes(String patrimonio, String descricao, boolean disponivel) {
        super(patrimonio, descricao, disponivel);
    }

    public KitComponentes(String patrimonio, String descricao) {
        super(patrimonio, descricao);
    }

    @Override
    public int getPrazoDias() {
        return 15;
    }
}
