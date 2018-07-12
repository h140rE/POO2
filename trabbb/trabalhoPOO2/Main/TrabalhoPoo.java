package Main;

import Model_MVC.*;
import Controller_MVC.*;
import View_MVC.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

public class TrabalhoPoo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        SQL testesql = new SQL(new PostgreSQL().login("postgres","121533"));
         
        // TELAS ----------------------------------------//
        JanelaPrincipal telaPrincipal = new JanelaPrincipal();
        TelaInicial telaApresentacao = new TelaInicial();
        TelaAtendente telaAtendente = new TelaAtendente();
        TelaHBT telaHotelBanhoTosa = new TelaHBT();
        TelaConsulta telaConsulta = new TelaConsulta();
        TelaVendas telaVendas = new TelaVendas();
        TelaVendasProdutos vprod = new TelaVendasProdutos();
        TelaVendaServico vserv = new TelaVendaServico();
        
        CadastraCliente  cad = new CadastraCliente();
        CadastraAnimal caa = new CadastraAnimal();
        BuscaCliente bus = new BuscaCliente();
        Pagamento mar = new Pagamento();
        
     
        /*
        CadastraCliente cadastraC = new CadastraCliente();
        CadastraAnimal cadastraA = new CadastraAnimal();
        BuscaCliente buscaCliente = new BuscaCliente();
        */
        
        // INSTANCIAS INICIAIS ------------------------//
        LinkedList<Cliente> clientes = new LinkedList<>();
        Atendente atendentePadrao = new Atendente("Joao1","123","1111",1);
        Cuidador cuidadorPadrao = new Cuidador("Joao2","132","1111",2);
        Veterinario veterinarioPadrao = new Veterinario("Joao3","213","1111",3);
        
        //CONTROLLERS ----------------------------------//
        ControllerJFrame jf = new ControllerJFrame(telaPrincipal,telaAtendente,telaConsulta ,telaHotelBanhoTosa,telaVendas);
        ControllerAtendente controllerAtendente = new ControllerAtendente(telaPrincipal,atendentePadrao,telaAtendente, cad ,bus ,caa ,mar ,clientes,testesql);
        ControllerVendas controllerVendas = new ControllerVendas(telaPrincipal,telaVendas,cuidadorPadrao, vserv, vprod,testesql);
        ControllerHBT controllerBanho;
        ControllerConsulta controllerConsulta;
       
        // INICIALIZACAO DA JANELA ----------------------//
        //telaPrincipal.setVisible(true);
        
    }
}
