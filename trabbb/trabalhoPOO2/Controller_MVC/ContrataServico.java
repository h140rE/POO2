package Controller_MVC;

public class ContrataServico {
        Servicos recibo;
        public ContrataServico(){
            recibo = new Recibo();
        }
        
        
        public void banho(Animal animal){
            recibo = new Banho_Decorator(recibo,animal);
            
        }
        public void hotel(int diaria){
            recibo = new Hotel_Decorator(recibo,diaria);
        }
        public void consulta(){
            recibo = new Consulta_Decorator(recibo);
        }
        public void tosa(){
            recibo = new Tosa_Decorator(recibo);
        }
        
        
        public float getPreco(){
            return (float) recibo.getPreco();
        }
        public void getRecibo(){
            System.out.println(recibo.getDescricao() + "\n" + "Total = " + this.recibo.pagar());
        }
        
}
