package Model_MVC;

public class Produto extends Vendas_Decorator {
    
    private Servicos servico;
        
    private float preco;
    
    public Produto(Servicos servico,float preco,String descricao) {
        
        this.servico = servico;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
	public String getDescricao() {
		return servico.getDescricao() + " + Produto: " + descricao;
	}

    @Override
    public float pagar() {
        return (float) (getPreco() + servico.pagar());
    }

}
