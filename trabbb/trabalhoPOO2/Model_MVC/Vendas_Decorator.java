package Model_MVC;

public class Vendas_Decorator extends ServicoDecorator {

	private Servicos servico;

	private int numListaProdutos;

    public Vendas_Decorator(Animal animal, Servicos recibo) {
        super(animal, recibo, (float) 60.0);
    }

	public float pagar() {
		return this.getPreco() + recibo.getPreco();
	}

	public String getDescricao() {
		return recibo.getDescricao() + descricao;
	}

	public void vende() {

	}

}
