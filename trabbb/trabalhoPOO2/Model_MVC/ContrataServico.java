package Model_MVC;

public class ContrataServico {

    public ContrataServico(){
        }
        
        
        public Banho_Decorator banho(Servicos recibo,Animal animal){
            return new Banho_Decorator(animal,recibo);
            
        }
        public Hotel_Decorator hotel(Servicos recibo,Animal animal, int diaria){
            return new Hotel_Decorator(animal,recibo,diaria);
        }
        public Consulta_Decorator consulta(Animal animal,Servicos recibo){
            return new Consulta_Decorator(animal,recibo);
        }
        public Tosa_Decorator tosa(Animal animal,Servicos recibo){
            return new Tosa_Decorator(animal,recibo);
        }
       
        
}
