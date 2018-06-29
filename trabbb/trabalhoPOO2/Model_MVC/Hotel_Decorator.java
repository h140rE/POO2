package Model_MVC;

public class Hotel_Decorator extends ServicoDecorator {

	private Servicos servico;

	private int nQuartos;

	private int nQuartosDisponiveis;
        
        private int diaria;

    public Hotel_Decorator(Animal animal,Servicos servico,int diaria) {
        super(animal);
        this.servico = servico;
        this.descricao = ", + Hotel";
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
