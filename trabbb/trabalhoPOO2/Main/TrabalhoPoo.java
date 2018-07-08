/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Controller_MVC.Animal;
import Controller_MVC.Cao;
import Controller_MVC.Cliente;
import Model_MVR.ControllerPet;
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
        animal1.estadoAtual();
        //animal1.getEstado().setEstadoAguardando();
        animal1.getEstado().setEstadoEmBanho();
        animal1.estadoAtual();
        animal1.getEstado().setEstadoEmEstadia();
        animal1.estadoAtual();
        cliente = new Cliente();
        cliente.animais.add(animal1);
        //cliente.contrataServicos().banho(cliente.animais.get(0));
        cliente.contrataServicos().consulta();
        cliente.contrataServicos().hotel(3);
        cliente.contrataServicos().getRecibo();
        
       
 
    }
    
}
