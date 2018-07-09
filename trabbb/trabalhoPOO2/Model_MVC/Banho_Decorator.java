package Model_MVC;

public class Banho_Decorator extends ServicoDecorator {

    private Servicos servico;

    public Banho_Decorator(Servicos servico) {
        this.setPreco(50);
        this.servico = servico;
        this.descricao = "\n + Banho \t\t" + this.getPreco();
        

    }

    @Override
    public float pagar() {
        return (float) ((this.getPreco()) + servico.pagar());
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + this.descricao;
    }

    public void registraBanho() {

    }

}
