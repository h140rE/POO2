package Controller_MVC;

public class EmBanho extends State {

    public EmBanho(Animal animal) {
        super(animal);
        this.descricao = "Animal se encontra no banho";
    }

    @Override
    public void setEstadoAguardando() {
        this.getAnimal().setEstado(new Aguardando(this.getAnimal()));
    }

    @Override
    public void setEstadoEmBanho() {
        System.out.println("Estado Corrente");
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
