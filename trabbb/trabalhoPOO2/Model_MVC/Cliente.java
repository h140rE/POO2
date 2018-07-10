package Model_MVC;

import java.util.ArrayList;


public class Cliente extends Pessoa {

    private ArrayList<Animal> animais;

    private Servicos recibo;
    
    public Cliente(String nome, int cpf, int telefone){
        super(nome,cpf,telefone);
        this.animais = new ArrayList<Animal>();
    }




    public void pagarDinheiro() {

    }

    public void pagarCartao() {

    }

    public void pagarCheque() {

    }
    public void setRecibo(Servicos recibo){
        this.recibo = recibo;
    }
    public Servicos getRecibo(){
        return this.recibo;
    }
    public String imprimeRecibo(){
        String auxiliar =  recibo.getDescricao() + "\n Total a pagar: R$" + this.recibo.pagar();
                return auxiliar;
    }
    public void AdicionaAnimal(String nome, String raca, String tipo){
        if(tipo == "cao"){
            animais.add(new Cao(nome,raca));
        }
        else if(tipo == "gato"){
            animais.add(new Gato(nome,raca));
        }
        else{
            System.out.println("Tipo invalido");
    }
        
    }
    
    public void listaAnimais(){
        System.out.println("Cliente:" + this.getNome());
        for(int i=0; i < animais.size(); i++){
            System.out.println(i + " - " +animais.get(i).dadosAnimal() +"\t Tipo: " + animais.get(i).tipo );
        }
    }
    public Animal getAnimal(int i){
        return this.animais.get(i);
    }
 
}
