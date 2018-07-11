package Controller_MVC;

import Controller_MVC.ControllerAtendente.CadastraClienteListener;
import Model_MVC.*;
import View_MVC.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControllerAtendente {
    Connection conecta = null;
    PreparedStatement pst;
    ResultSet rs;
    private Atendente atendente;
    TelaAtendente view;
    JanelaPrincipal jPrincipal;
    
    private LinkedList<Cliente> clientesAtivos;
 
     BuscaCliente buscaCliente;
     CadastraAnimal cadastraA;
     CadastraCliente cadastraC;
     MarcaConsulta marcaC;

    public ControllerAtendente(JanelaPrincipal jPrincipal,Atendente model, TelaAtendente view , CadastraCliente cadastraC,
            BuscaCliente buscaCliente,CadastraAnimal cadastraA  ,MarcaConsulta marcaC ,LinkedList<Cliente> cliente){
       
       
        this.jPrincipal = jPrincipal;
        this.atendente = model;
        this.view = view;
        this.cadastraC = cadastraC;
        this.buscaCliente = buscaCliente;
        this.cadastraA = cadastraA;
        this.marcaC = marcaC;
        
        //this.clientesAtivos = cliente;
        view.getMenuCadastraCliente().addActionListener(new CadastraClienteListener());
        view.getMenuBuscaCliente().addActionListener(new IdentificadorCadastro());
        view.getMenCadastraAnimal().addActionListener(new CadastroDeAnimal());
        view.getMenuMarcaConsulta().addActionListener(new MarcaAConsulta());
      
    }
    

    class CadastraClienteListener implements ActionListener {

          @Override
        public void actionPerformed(ActionEvent e) {
            
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();
            
            view.getDesktopPanel().add(cadastraC);
            cadastraC.show();

            
            //cadastraC.show();
           
            /*String Nome, CPF, Telefone, NomeAnimal, Raca;
            Nome = cadastroCliente.getjTextField1().toString();
            CPF = cadastroCliente.getjTextField2().getText();
            Telefone = cadastroCliente.getjTextField3().getText();
          
            //model.cadastrar(Nome, CPF, Telefone, NomeCachorro, Raca);
            clientesAtivos.add(atendente.atende(Nome,CPF,Telefone));*/
            
        }
    }
    
     class IdentificadorCadastro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();
            
            view.getDesktopPanel().add(buscaCliente);
            buscaCliente.show();
            
            

        }
    }
     
     class CadastroDeAnimal implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();
            
            view.getDesktopPanel().add(cadastraA);
            cadastraA.show();
        }
     }
        
      class MarcaAConsulta implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();
            
            view.getDesktopPanel().add(marcaC);
            marcaC.show();
        }
      }
         
    
    class CancelaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
     /*
            view.getjTextField1().setText("");
            view.getjTextField2().setText("");
            view.getjTextField3().setText("");
            view.getjTextField4().setText("");
            view.getjTextField5().setText("");
            */
        }
   
    }
}
     

