package Model_MVC;

public class Animal {

    private String nomeAnimal;
    private char tipo;
    private String raca;
    String cpfDono;
    private State estado;
       

    public Animal(String cpfDono, char tipo, String nomeAnimal, String raca) {
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
        this.tipo = tipo;
        this.cpfDono = cpfDono;
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
        String temp = "Animal: " + nomeAnimal + "\t" + "Raca: " + this.raca;
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
    
    public char getTipo(){
        return this.tipo;
    }
    
    public void entrarHotel(){
        estado.setEstadoEmEstadia();
    }

    public void finalizar(){
        estado.setEstadoFinalizado();
    }
}
