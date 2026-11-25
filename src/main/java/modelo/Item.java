package modelo;

public abstract class Item {

    private String patrimonio;
    private String descricao;
    private boolean disponivel;

    public Item(String patrimonio, String descricao, boolean disponivel) {
        setPatrimonio(patrimonio);
        setDescricao(descricao);
        this.disponivel = disponivel;
    }

    public Item(String patrimonio, String descricao) {
        this(patrimonio, descricao, true);
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
                "Diponivel: " + ((isDisponivel()) ? "Está disponível" : "Não está disponivel");
    }

    public abstract int getPrazoDias();

}
