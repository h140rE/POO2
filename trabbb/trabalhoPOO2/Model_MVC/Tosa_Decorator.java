package Model_MVC;

public class Tosa_Decorator extends ServicoDecorator {

    private Servicos servico;

    public Tosa_Decorator(Servicos servico) {
        this.setPreco(60);
        this.servico = servico;
        this.descricao = "\n + Tosa \t\t" + this.getPreco();
    }

    @Override
    public float pagar() {
        return (float) (this.getPreco() + servico.pagar());
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + descricao;
    }

    public void registraTosa() {

    }

}
