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
    private LinkedList<Cliente> clientesAtivos;
    private Boolean cao = false;
    private Boolean gato = false; 
     BuscaCliente buscaCliente;
     CadastraAnimal cadastraA;
     CadastraCliente cadastraC;
     MarcaConsulta marcaConsulta;
    
    
    
    public ControllerAtendente(Atendente model, TelaAtendente view,LinkedList<Cliente> cliente) {
       
        this.atendente = model;
        this.view = view;
        this.clientesAtivos = cliente;
        this.cadastraC = new CadastraCliente();
        
        
        this.view.getMenuCadastraCliente().addActionListener(new CadastraClienteListener());
        
        
        
    }
    

    class CadastraClienteListener implements ActionListener {

        
        public void actionPerformed(ActionEvent e) {
            
            view.getDesktopPanel().removeAll();
            view.getDesktopPanel().repaint();      
            view.getDesktopPanel().add(cadastraC);
            
            
            cadastraC.setVisible(true);
           
            /*String Nome, CPF, Telefone, NomeAnimal, Raca;
            Nome = cadastroCliente.getjTextField1().toString();
            CPF = cadastroCliente.getjTextField2().getText();
            Telefone = cadastroCliente.getjTextField3().getText();
          
            //model.cadastrar(Nome, CPF, Telefone, NomeCachorro, Raca);
            clientesAtivos.add(atendente.atende(Nome,CPF,Telefone));*/
            
        }
    }
    
    /* class IdentificadorCadastro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            CadastroCliente = true;
            view.getDesktopPanel().add(cadastroCliente);
            cadastroCliente.setVisible(true);

        }
    }
    
    class RacaListenerCao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            cao = true;

        }
    }
    
    class RacaListenerGato implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            gato = true;

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
            
        }
    }*/

    class ConsultaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
/*
            String CPFDono,Data,Hora;
            
            CPFDono = view.getjTextPane1().getText();
            Data = view.getjTextPane2().getText();
            Hora = view.getjTextPane3().getText();
            
            model.marcaConsulta(CPFDono, Data, Hora);
            */
        }
    }

   
    
}

