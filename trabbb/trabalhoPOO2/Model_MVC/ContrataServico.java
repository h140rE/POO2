package Model_MVC;

public class ContrataServico {
 
    
    public ContrataServico(){
        }
        

        
        public Banho_Decorator banho(Servicos recibo){
            return new Banho_Decorator(recibo);
        }
        public Hotel_Decorator hotel(Servicos recibo,int diaria){
            return new Hotel_Decorator(recibo,diaria);
        }
        public Tosa_Decorator tosa(Servicos recibo){
            return new Tosa_Decorator(recibo);
        }
        public Produto venda(Servicos recibo,float preco,String descricao){
            return new Produto(recibo,preco,descricao);
        }
       
        
}
