package Controller_MVC;

public abstract class ServicoDecorator extends Servicos {

    public ServicoDecorator(Animal animal){
        super(animal);
    }
    
    @Override
    public abstract String getDescricao();

}
