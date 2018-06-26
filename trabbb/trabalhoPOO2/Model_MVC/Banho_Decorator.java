package Model_MVC;

public class Banho_Decorator extends ServicoDecorator {

	

    public Banho_Decorator(Animal animal, Servicos recibo) {
        super(animal,recibo,(float)53.50);
        this.descricao = ",+ Banho";
        
    }

	public float pagar() {
		return (float)(this.getPreco() + recibo.pagar());
	}

	public String getDescricao() {
            return recibo.getDescricao() + this.descricao;
	}

	public void registraBanho() {

	}

}
