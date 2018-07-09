package Model_MVC;

public class Veterinario extends Funcionario {

	private Consulta_Decorator consulta_Decorator;

    public Veterinario(String nome, int cpf, int telefone, int idFunc) {
        super(nome, cpf, telefone, idFunc);
    }

	public void encaminha(Animal animal) {
               
	}

	public void fazConsulta(Animal animal) {

	}

}
