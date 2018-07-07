package Controller_MVC;

public class Aguardando extends State {

    public Aguardando(Animal animal) {
        super(animal);
        this.descricao = "Animal se encontra na fila, Aguardando";
    }

    @Override
    public void setEstadoAguardando() {
        System.out.println("Estado Corrente");
    }

    @Override
    public void setEstadoEmBanho() {
        this.getAnimal().setEstado(new EmBanho(this.getAnimal()));
    }

    @Override
    public void setEstadoEmConsulta() {
        this.getAnimal().setEstado(new EmConsulta(this.getAnimal()));
    }

    @Override
    public void setEstadoEmEstadia() {
        this.getAnimal().setEstado(new EmEstadia(this.getAnimal()));
    }

    @Override
    public void setEstadoFinalizado() {
        this.getAnimal().setEstado(new Finalizado(this.getAnimal()));
    }

}
