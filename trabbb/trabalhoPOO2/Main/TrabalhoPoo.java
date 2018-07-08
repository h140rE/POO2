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
         */

        ContrataServico c = new ContrataServico();
        Servicos s = new Recibo();

        s = c.banho(s);
        s = c.consulta(animal1, s);
        s = c.hotel(s, 1);
        s = c.tosa(animal1, s);

        System.out.println(s.pagar());
        System.out.println(s.getDescricao());

        TelaAtendente a = new TelaAtendente();
        a.setVisible(true);
        
        Atendente a2 = new Atendente();

        ControllerAtendente cA = new ControllerAtendente(a2,a);

    }

}
