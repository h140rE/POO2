package Model_MVC;

public class Produto extends Vendas_Decorator {

	private float preco;

    public Produto(Animal animal, Servicos recibo) {
        super(animal, recibo);
    }

}
