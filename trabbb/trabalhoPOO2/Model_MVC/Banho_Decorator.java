package Model_MVC;

public class Banho_Decorator extends ServicoDecorator {

    private Servicos servico;

    public Banho_Decorator(Servicos servico) {
        
        this.servico = servico;
        this.descricao = "\n + Banho";

    }

    @Override
    public float pagar() {
        return (float) (50.00 + servico.pagar());
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + this.descricao;
    }

    public void registraBanho() {

    }

}
