/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Model_MVC.*;
import Controller_MVC.*;

/**
 *
 * @author higor
 */
public class TrabalhoPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal1;
        animal1 = new Cao("Pedro", "lilica", "vira-lata");
        /*
        animal1.estadoAtual();
        //animal1.getEstado().setEstadoAguardando();
        animal1.getEstado().setEstadoEmBanho();
        animal1.estadoAtual();
        animal1.getEstado().setEstadoEmEstadia();
        animal1.estadoAtual();
        ControllerPet  controller = new ControllerPet();
       */
       /*
       ContrataServico c = new ContrataServico();
       Servicos s = new Recibo(animal1);
       
       s = c.banho(s, animal1);
       s = c.consulta(animal1, s);
       s = c.hotel(s, animal1, 1);
       s = c.tosa(animal1, s);
       
       System.out.println(s.pagar()); 
       System.out.println(s.getDescricao());   
        */
       ControllerTelaPrincipal principal = new ControllerTelaPrincipal();
    
       
    }
    
}
