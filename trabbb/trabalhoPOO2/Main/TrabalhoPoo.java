package Main;

import Model_MVC.*;
import Controller_MVC.*;
import View_MVC.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class TrabalhoPoo {

    public static void main(String[] args) {
        
        
         
        // TELAS ----------------------------------------//
        TelaInicial tela0 = new TelaInicial();
        JanelaPrincipal tela1 = new JanelaPrincipal();
        TelaAtendente tela2 = new TelaAtendente();
        TelaHBT tela3 = new TelaHBT();
        TelaConsulta tela4 = new TelaConsulta();
        TelaVendas tela5 = new TelaVendas();
        
        
        // INSTANCIAS INICIAIS ------------------------//
        LinkedList<Cliente> clientes = new LinkedList<>();
        Atendente atendentePadrao = new Atendente("Joao1","123","1111",1);
        Cuidador cuidadorPadrao = new Cuidador("Joao2","132","1111",2);
        Veterinario veterinarioPadrao = new Veterinario("Joao3","213","1111",3);
        
        //CONTROLLERS ----------------------------------//
        ControllerJFrame jf = new ControllerJFrame(tela1,tela2,tela4,tela3,tela5);
        ControllerAtendente controlerAtendente = new ControllerAtendente(atendentePadrao,tela2,clientes);
        ControllerVendas controllerVendas = new ControllerVendas(tela5);
        ControllerHBT controllerBanho;
        ControllerConsulta controllerConsulta;
        
        
        // INICIALIZACAO DA JANELA ----------------------//
        tela1.setVisible(true);
        
    }

}
