package Model_MVC;

public class Hotel_Decorator extends ServicoDecorator {

	private Servicos servico;

	private int nQuartos;

	private int nQuartosDisponiveis;
        
        private int diaria;

    public Hotel_Decorator(Servicos servico,int diaria) {
        this.setPreco(100);
        this.servico = servico;
        this.diaria = diaria;
        this.descricao = "\n + Hotel \t" +diaria + "*"+"\t" +  + this.getPreco();
        
    }
    
        @Override
	public float pagar() {
		return (float) ((diaria * this.getPreco()) + servico.pagar());
	}

        @Override
	public String getDescricao() {
		return servico.getDescricao() + descricao;
	}

}
