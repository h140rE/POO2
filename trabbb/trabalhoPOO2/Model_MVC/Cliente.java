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
 
}
