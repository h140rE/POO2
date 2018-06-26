package Model_MVC;

public class EmBanho extends State {

    public EmBanho(Animal animal) {
        super(animal);
        this.descricao = "Animal se encontra no banho";
    }

	public void pegaEstado() {

	}

   
    public void setEstadoAguardando() {
        this.getAnimal().setEstado(new Aguardando(this.getAnimal()));
    }

   
    public void setEstadoEmBanho() {
        throw new UnsupportedOperationException("Estado corrente.");
    }

    
    public void setEstadoEmConsulta() {
        this.getAnimal().setEstado(new EmConsulta(this.getAnimal()));
    }

    
    public void setEstadoEmEstadia() {
        this.getAnimal().setEstado(new EmEstadia(this.getAnimal()));
    }

    
    public void setEstadoFinalizado() {
        this.getAnimal().setEstado(new Finalizado(this.getAnimal()));
    }

}
