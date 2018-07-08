package Model_MVC;

public class Hotel_Decorator extends ServicoDecorator {

	private Servicos servico;

	private int nQuartos;

	private int nQuartosDisponiveis;
        
        private int diaria;

    public Hotel_Decorator(Servicos servico,int diaria) {
        
        this.servico = servico;
        this.descricao = "\n + Hotel";
        this.diaria = diaria;
    }
    
        @Override
	public float pagar() {
		return (float) ((diaria * 100.00) + servico.pagar());
	}

        @Override
	public String getDescricao() {
		return servico.getDescricao() + descricao;
	}

}
