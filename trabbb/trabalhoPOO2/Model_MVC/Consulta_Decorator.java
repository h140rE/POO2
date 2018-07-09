package Model_MVC;

public class Consulta_Decorator extends ServicoDecorator {

    private Servicos servico;

    private Veterinario veterinario;

    public Consulta_Decorator(Servicos servico) {
        this.setPreco(60);
        this.servico = servico;
        this.descricao = "\n + Consulta \t\t" + this.getPreco();

    }

    @Override
    public float pagar() {
        return (float) (this.getPreco() + servico.pagar());
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
