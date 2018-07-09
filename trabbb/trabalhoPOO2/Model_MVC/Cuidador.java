package Model_MVC;

public class Cuidador extends Funcionario {

    public Cuidador(String nome, int cpf, int telefone, int idFunc) {
        super(nome, cpf, telefone, idFunc);
    }

	public String exibeInfoAnimal(Animal animal) {
		return null;
	}

	public boolean buscaAnimal(Animal animal) {
		return false;
	}

	public boolean verificarVagaHotel() {
		return false;
	}

	public void registraEstadia(Hotel_Decorator hotel, Animal animal) {

	}

	public void r_EntradaHotel(Hotel_Decorator hotel, Animal animal) {

	}

	public void r_SaidaHotel(Hotel_Decorator hotel, Animal animal) {

	}

	public void registraBanho(Banho_Decorator banho, Animal animal) {

	}
        public void r_EntradaBanho(Banho_Decorator banho, Animal animal){
            
        }
        public void r_SaidaBanho(Banho_Decorator banho, Animal animal){
            
        }
	public void registraTosa(Tosa_Decorator tosa, Animal animal) {

	}
        public void r_EntradaTosa(Tosa_Decorator tosa, Animal animal){
            
        }
        public void r_SaidaTosa(Tosa_Decorator tosa, Animal animal){
            
        }
        

}
