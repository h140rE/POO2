package Model_MVC;

public class Consulta_Decorator extends ServicoDecorator {

    private Servicos servico;

    private Veterinario veterinario;

    public Consulta_Decorator(Animal animal, Servicos servico) {
        super(animal);
        this.servico = servico;
        this.descricao = ", + Consulta";

    }

    @Override
    public float pagar() {
        return (float) (60.00 + servico.pagar());
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + descricao;
    }

    public void listaMaterialUsado() {

    }

    public void listaConsulta(Animal animal) {

    }

    public void listaRemedios() {

    }

}
