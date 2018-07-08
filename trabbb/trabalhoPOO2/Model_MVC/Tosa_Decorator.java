package Model_MVC;

public class Tosa_Decorator extends ServicoDecorator {

    private Servicos servico;

    public Tosa_Decorator(Animal animal, Servicos servico) {
        super(animal);
        this.servico = servico;
        this.descricao = ", + Tosa";
    }

    @Override
    public float pagar() {
        return (float) (60.00 + servico.pagar());
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + descricao;
    }

    public void registraTosa() {

    }

}
