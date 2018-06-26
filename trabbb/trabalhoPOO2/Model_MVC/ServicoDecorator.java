package Model_MVC;

public abstract class ServicoDecorator extends Servicos {
        protected Servicos recibo;
        
    public ServicoDecorator(Animal animal, Servicos recibo,float preco) {
        super(animal);
        this.recibo = recibo;
        this.setPreco((float)53.50);
    }

	public abstract String getDescricao();

}
