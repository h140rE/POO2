/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
<<<<<<< HEAD
import Controller_MVC.Animal;
import Controller_MVC.Cao;
import Controller_MVC.Cliente;
import Model_MVR.ControllerPet;
=======
import Model_MVC.*;
import Controller_MVC.*;

>>>>>>> cdf0c946db69eff86f03f95ce71b6cce288a1d13
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
        Cliente cliente;
        animal1 = new Cao("Pedro", "lilica", "vira-lata");
        /*
        animal1.estadoAtual();
        //animal1.getEstado().setEstadoAguardando();
        animal1.getEstado().setEstadoEmBanho();
        animal1.estadoAtual();
        animal1.getEstado().setEstadoEmEstadia();
        animal1.estadoAtual();
<<<<<<< HEAD
        cliente = new Cliente();
        cliente.animais.add(animal1);
        //cliente.contrataServicos().banho(cliente.animais.get(0));
        cliente.contrataServicos().consulta();
        cliente.contrataServicos().hotel(3);
        cliente.contrataServicos().getRecibo();
        
=======
        ControllerPet  controller = new ControllerPet();
       */
       
       ContrataServico c = new ContrataServico();
       Servicos s = new Recibo(animal1);
       
       s = c.banho(s, animal1);
       s = c.consulta(animal1, s);
       s = c.hotel(s, animal1, 1);
       s = c.tosa(animal1, s);
>>>>>>> cdf0c946db69eff86f03f95ce71b6cce288a1d13
       
       System.out.println(s.pagar()); 
       System.out.println(s.getDescricao());   
 
    }
    
}
