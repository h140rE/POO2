package Model_MVC;

public class Aguardando extends State {
        
    
        public Aguardando(Animal animal){
            super(animal);
            this.descricao = "Animal se encontra na fila, Aguardando";
        }
    
    
    


   
    public void setEstadoAguardando() {
        throw new UnsupportedOperationException("Estado corrente."); //To change body of generated methods, choose Tools | Templates.
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
        this.getAnimal().setEstado(new Finalizado(this.getAnimal()));
    }

}
