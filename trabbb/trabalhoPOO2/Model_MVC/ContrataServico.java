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
        public Consulta_Decorator consulta(Servicos recibo){
            return new Consulta_Decorator(recibo);
        }
        public Tosa_Decorator tosa(Servicos recibo){
            return new Tosa_Decorator(recibo);
        }
       
        
}
