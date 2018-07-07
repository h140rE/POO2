package Controller_MVC;

public class Recibo extends Servicos {

	

    public Recibo(Animal animal) {
        super(animal);
        this.setPreco(0);
        this.descricao = "Recibo";
    }

    @Override
	public float pagar() {
		return this.getPreco();
	}

}
