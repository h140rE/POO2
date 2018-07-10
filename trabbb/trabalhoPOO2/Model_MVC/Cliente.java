package Model_MVC;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Cliente extends Pessoa {

    private ArrayList<Animal> animais;

    private Servicos recibo;
    
    public Cliente(String nome, String cpf, String telefone){
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
    public void AdicionaAnimal(String nome, String raca, int tipo){
        if(tipo == 1){
            animais.add(new Cao(nome,raca));
            JOptionPane.showMessageDialog(null, "Cao Adicionado com Sucesso!");
        }
        else if(tipo == 2){
            animais.add(new Gato(nome,raca));
            JOptionPane.showMessageDialog(null, "Gato Adicionado com Sucesso!");
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
