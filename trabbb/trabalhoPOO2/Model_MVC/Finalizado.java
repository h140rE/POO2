package Model_MVC;

public class Finalizado extends State {

    public Finalizado(Animal animal) {
        super(animal);
        this.descricao = "Todos os servicos realizados";
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
        
        this.getAnimal().setEstado(new EmEstadia(this.getAnimal()));
    }

    
    public void setEstadoFinalizado() {
        throw new UnsupportedOperationException("Estado corrente.");
    } 
   

}
