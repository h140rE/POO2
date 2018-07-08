package Model_MVC;

public abstract class Servicos {

    protected float preco;
    
    protected String descricao;

    //---------------------------------//
    public Servicos() {
        
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return this.preco;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract float pagar();

}
