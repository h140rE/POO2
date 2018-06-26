package Model_MVC;

public class EmConsulta extends State {

    public EmConsulta(Animal animal) {
        super(animal);
        this.descricao = "Animal se encontra em Consulta";
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

        throw new UnsupportedOperationException("Estado corrente.");
    }

    
    public void setEstadoEmEstadia() {
        this.getAnimal().setEstado(new EmEstadia(this.getAnimal()));
    }

    
    public void setEstadoFinalizado() {
        this.getAnimal().setEstado(new Finalizado(this.getAnimal()));
    }

}
