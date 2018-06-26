package Model_MVC;

public class Hotel_Decorator extends ServicoDecorator {

	private Servicos servico;

	private int nQuartos;

	private int nQuartosDisponiveis;

    public Hotel_Decorator(Animal animal, Servicos recibo, float preco) {
        super(animal, recibo,(float) 155.30);
        this.descricao = ", + Hotel";
    }

	public float pagar() {
		return this.getPreco() + recibo.pagar();
	}

	public String getDescricao() {
		return recibo.getDescricao() + descricao;
	}

}
