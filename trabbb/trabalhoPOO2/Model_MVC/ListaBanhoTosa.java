
package Model_MVC;

import java.util.LinkedList;


public class ListaBanhoTosa {
     private LinkedList<Animal> listaConsulta;
        
        public ListaBanhoTosa(){
            listaConsulta = new LinkedList<Animal>();
        }
        
        public void imprimeLista(){
            if(listaConsulta.isEmpty()){
                System.out.println("Não há banhos/tosas a se fazer");
            }else{
                for(int i=0; i < listaConsulta.size(); i++){
                    System.out.println((i+1) +" - "+ listaConsulta.get(i).dadosAnimal());
                }
            }
        }
        
        public void adicionaLista(Animal animal){
            listaConsulta.add(animal);
        }
        public void retiraLista(int i){
            if(i > listaConsulta.size()){
                System.out.println("animal indisponível");
            }else{
            listaConsulta.remove(i-1);
            }
        }
    
    
    
    
}
