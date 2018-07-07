package Controller_MVC;

public class Animal {

    private String nomeDono;

    private String nomeAnimal;

    private String raca;

    private State estado;

    public Animal(String nomeDono, String nomeAnimal, String raca) {
        this.nomeDono = nomeDono;
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
        this.setEstado(new Aguardando(this));
    }

    public void estadoAtual() {
        System.out.println(this.estado.getDescricao());
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public State getEstado() {
        return estado;
    }

    public String dadosAnimal() {
        String temp = "Nome Dono: " + nomeDono + "\nNome Animal:" + nomeAnimal + "\nRaca:" + this.raca;
        return temp;
    }

    public void aguardar(){
        estado.setEstadoAguardando();
    }

    public void tomarBanho(){
        estado.setEstadoEmBanho();
    }

    public void consultar(){
        estado.setEstadoEmConsulta();
    }

    public void entrarHotel(){
        estado.setEstadoEmEstadia();
    }

    public void finalizar(){
        estado.setEstadoFinalizado();
    }
}
