package Model_MVC;

public class Tosa_Decorator extends ServicoDecorator {

	private Servicos servico;

    public Tosa_Decorator(Animal animal, Servicos recibo) {
        super(animal, recibo, (float) 60.0);
        this.descricao = ", + Tosa";
    }

	public float pagar() {
		return this.getPreco() + recibo.pagar();
	}

	public String getDescricao() {
            return recibo.getDescricao() + descricao;
	}

	public void registraTosa() {

	}

}
