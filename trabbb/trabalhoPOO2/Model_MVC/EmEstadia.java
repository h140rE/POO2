package Model_MVC;

public class EmEstadia extends State {

    public EmEstadia(Animal animal) {
        super(animal);
        this.descricao = "Animal se encontra no hotel";
    }

	public void pegaEstado() {

	}

    
    public void setEstadoAguardando() {
        this.getAnimal().setEstado(new Aguardando(this.getAnimal()));
    }

   
    public void setEstadoEmBanho() {
        this.getAnimal().setEstado(new EmBanho(this.getAnimal()));    
    }

    
    public void setEstadoEmConsulta() {

        this.getAnimal().setEstado(new EmConsulta(this.getAnimal()));
    }

    
    public void setEstadoEmEstadia() {
        throw new UnsupportedOperationException("Estado corrente.");
        
    }

    
    public void setEstadoFinalizado() {
        this.getAnimal().setEstado(new Finalizado(this.getAnimal()));
    }

}
