/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_MVC;

import java.util.LinkedList;

/**
 *
 * @author higor
 */
public class ListaConsulta {
        private LinkedList<Animal> listaConsulta;
        
        public ListaConsulta(){
            listaConsulta = new LinkedList<Animal>();
        }
        
        public void imprimeLista(){
            if(listaConsulta.isEmpty()){
                System.out.println("Não há consultas a se fazer");
            }else{
                for(int i=0; i < listaConsulta.size(); i++){
                    System.out.println(listaConsulta.get(i).dadosAnimal());
                }
            }
        }
        
        public void adicionaLista(Animal animal){
            listaConsulta.add(animal);
        }
        
        
}
