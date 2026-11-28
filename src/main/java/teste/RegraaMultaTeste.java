package teste;

import modelo.Item;
import modelo.Notebook;
import modelo.RegraMulta;

public class RegraaMultaTeste extends Item{

    public RegraaMultaTeste(String patrimonio, String descricao, RegraMulta regraMulta) {
        super(patrimonio, descricao, null);
    }
    @Override
    public int getPrazoDias() {
        return 7;
    }

    public static void main(String[] args) {
        try {
            RegraaMultaTeste rmt = new RegraaMultaTeste("UB-0000","velho", null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
