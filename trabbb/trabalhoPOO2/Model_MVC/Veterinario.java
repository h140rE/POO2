package Model_MVC;

public class Veterinario extends Funcionario {

	private Consulta_Decorator consulta_Decorator;

    public Veterinario(String nome, String cpf, String telefone, int idFunc) {
        super(nome, cpf, telefone, idFunc);
    }

	public void encaminha(Animal animal) {
               
	}

	public void fazConsulta(Animal animal) {

	}

}
