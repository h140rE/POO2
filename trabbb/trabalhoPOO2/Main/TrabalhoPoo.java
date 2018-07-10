package Main;

import Model_MVC.*;
import Controller_MVC.*;
import View_MVC.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class TrabalhoPoo {

    public static void main(String[] args) {

        Tela_Principal tela = new Tela_Principal();
        TelaAtendente tela2 = new TelaAtendente();
        TelaHBT tela3 = new TelaHBT();
        TelaConsulta tela4 = new TelaConsulta();
        LinkedList<Cliente> clientes = new LinkedList<>();
        Atendente atendentePadrao = new Atendente("Joao1",123,1111,1);
        Cuidador cuidadorPadrao = new Cuidador("Joao2",132,1111,2);
        Veterinario veterinarioPadrao = new Veterinario("Joao3",213,1111,3);
        ControllerTelaPrincipal controlerTelaPrincipal = new ControllerTelaPrincipal(tela,tela2,tela3,tela4);
        ControllerAtendente controlerAtendente = new ControllerAtendente(atendentePadrao,tela2,clientes);
        ControllerHBT controllerBanho;
        ControllerConsulta controllerConsulta;
        tela.setVisible(true);
        
    }

}
