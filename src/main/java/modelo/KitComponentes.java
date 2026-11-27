package modelo;

public class KitComponentes extends Item {

    public KitComponentes(String patrimonio, String descricao, boolean disponivel) {
        super(patrimonio, descricao, new SemMulta(), disponivel);
    }

    public KitComponentes(String patrimonio, String descricao) {
        this(patrimonio, descricao, true);
    }

    @Override
    public int getPrazoDias() {
        return 15;
    }
}