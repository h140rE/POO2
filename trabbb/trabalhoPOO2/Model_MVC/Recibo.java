package Model_MVC;

public class Recibo extends Servicos {

	

    public Recibo() {
        
        this.setPreco(0);
        this.descricao = "Recibo";
    }

    @Override
	public float pagar() {
		return this.getPreco();
	}

}
