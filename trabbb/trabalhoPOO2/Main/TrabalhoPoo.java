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

       
       


       ContrataServico c = new ContrataServico();
       Servicos s = new Recibo(animal1);

       s = c.banho(s, animal1);
       s = c.consulta(animal1, s);
       s = c.hotel(s, animal1, 1);
       s = c.tosa(animal1, s);

       System.out.println(s.pagar()); 

       System.out.println(s.getDescricao());   
 


       System.out.println(s.getDescricao());
        

*/


        /*

        ContrataServico c = new ContrataServico();
        Servicos s = new Recibo();

        s = c.banho(s);
        s = c.consulta(s);
        s = c.hotel(s, 1);

        s = c.tosa(s);


        s = c.tosa(animal1, s);
        

        System.out.println(s.pagar());
        System.out.println(s.getDescricao());
        */

        //Tela_Principal a = new Tela_Principal();
        //a.setVisible(true);

        //ControllerTelaPrincipal cA = new ControllerTelaPrincipal(a);
        
        
        Cliente cli = new Cliente("Pedro", 123, 3322-1122);
        Atendente at = new Atendente("Joao", 321, 1233-1233, 1);
        ContrataServico c = new ContrataServico();
        
        cli.setRecibo(at.criaRecibo());
        
        cli.setRecibo(c.banho(cli.getRecibo()));
        cli.setRecibo(c.consulta(cli.getRecibo()));
        cli.setRecibo(c.hotel(cli.getRecibo(), 1));
        cli.setRecibo(c.tosa(cli.getRecibo()));
        cli.setRecibo(c.banho(cli.getRecibo()));
        cli.setRecibo(c.venda(cli.getRecibo(),135,"batata"));
        
        
        System.out.println(cli.imprimeRecibo());
        
        
        
        
            


    }

}
