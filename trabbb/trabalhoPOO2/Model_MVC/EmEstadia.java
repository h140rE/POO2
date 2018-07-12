package Model_MVC;

public class EmEstadia extends State {

    public EmEstadia(Animal animal) {
        super(animal);
        this.descricao = "Animal se encontra no hotel";
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
    public void setEstadoEmEstadia() {
        System.out.println("Estado Corrente");
    }

    @Override
    public void setEstadoFinalizado() {
        this.getAnimal().setEstado(new Finalizado(this.getAnimal()));
    }

}
