package Controller_MVC;

public class EmConsulta extends State {

    public EmConsulta(Animal animal) {
        super(animal);
        this.descricao = "Animal se encontra em Consulta";
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
        System.out.println("Estado Corrente");
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
