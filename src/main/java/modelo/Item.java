package modelo;

public abstract class Item {

    private String patrimonio, descricao;
    private boolean disponivel;
    private RegraMulta regraMulta;

    public Item(String patrimonio, String descricao, RegraMulta regraMulta, boolean disponivel ) {
        setPatrimonio(patrimonio);
        setDescricao(descricao);
        this.disponivel = disponivel;
        if(regraMulta == null){
            throw new IllegalArgumentException("A regra de multa não pode ser vazia");
        }
        this.regraMulta = regraMulta;

    }

    public Item(String patrimonio, String descricao, RegraMulta regraMulta) {
        this(patrimonio, descricao, regraMulta, true);
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        if(patrimonio == null || patrimonio.trim().isEmpty()){
            this.patrimonio = "Sem patrimonio";
        }
        else{
            this.patrimonio = patrimonio;
        }
    }

    public double calcularValorMulta(int diasAtraso){

        return regraMulta.calcularMulta(diasAtraso);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao == null || descricao.trim().isEmpty()){
            this.descricao = "Sem descrição";
        }
        else{
            this.descricao = descricao;
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Patrimonio:" + patrimonio + "\n" +
                "Descrição: " + descricao + "\n" +
                "Disponivel: " + ((isDisponivel()) ? "Está disponível" : "Não está disponivel");
    }

    public abstract int getPrazoDias();

}
