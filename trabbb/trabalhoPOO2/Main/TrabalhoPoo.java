package Main;

import Model_MVC.*;
import Controller_MVC.*;
import View_MVC.*;

public class TrabalhoPoo {

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
<<<<<<< HEAD
       
       
=======
>>>>>>> e166670376db5b24531759e151356cff470bcf99
       ContrataServico c = new ContrataServico();
       Servicos s = new Recibo(animal1);

       s = c.banho(s, animal1);
       s = c.consulta(animal1, s);
       s = c.hotel(s, animal1, 1);
       s = c.tosa(animal1, s);

       System.out.println(s.pagar()); 
<<<<<<< HEAD
       System.out.println(s.getDescricao());   */
 
=======
       System.out.println(s.getDescricao());
        */



        ContrataServico c = new ContrataServico();
        Servicos s = new Recibo();

        s = c.banho(s);
        s = c.consulta(animal1, s);
        s = c.hotel(s, 1);
        s = c.tosa(animal1, s);

        System.out.println(s.pagar());
        System.out.println(s.getDescricao());

        Tela_Principal a = new Tela_Principal();
        a.setVisible(true);

        ControllerTelaPrincipal cA = new ControllerTelaPrincipal(a);
            

>>>>>>> e166670376db5b24531759e151356cff470bcf99
    }

}
