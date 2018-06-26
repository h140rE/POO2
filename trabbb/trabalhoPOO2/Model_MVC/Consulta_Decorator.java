package Model_MVC;

public class Consulta_Decorator extends ServicoDecorator {

	

	private Veterinario veterinario;

    public Consulta_Decorator(Animal animal, Servicos recibo,float preco) {
        super(animal,recibo,(float)100.00);
        this.descricao = ", + Consulta";
        
    }

	public float pagar() {
		return (float) (this.getPreco() + recibo.pagar());
	}

	public String getDescricao() {
            return recibo.getDescricao() + descricao;
	}

	public void listaMaterialUsado() {

	}

	public void listaConsulta(Animal animal) {

	}

	public void listaRemedios() {

	}

}
