package Model_MVC;

public class Finalizado extends State {

    public Finalizado(Animal animal) {
        super(animal);
        this.descricao = "Todos os servicos realizados";
    }

    @Override
    public void setEstadoAguardando() {
        this.getAnimal().setEstado(new Aguardando(this.getAnimal()));
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
        System.out.println("Estado Corrente");
    }

}
