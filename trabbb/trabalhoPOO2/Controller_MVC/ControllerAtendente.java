package Controller_MVC;

import Model_MVC.Atendente;
import Model_MVC.Cliente;
import View_MVC.TelaAtendente;
import View_MVC.TelaVendas;
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
    private Atendente model;
    private TelaAtendente view;
    private TelaVendas viewVendas;
    private LinkedList<Cliente> clientesAtivos;
    private Boolean cao = false;
    private Boolean gato = false;

    public ControllerAtendente(Atendente model, TelaAtendente view, LinkedList<Cliente> cliente, TelaVendas viewVendas) {
        this.model = model;
        this.view = view;
        this.clientesAtivos = cliente;
        this.viewVendas = viewVendas;
 

    }
    
    public void insereCliente(String nome, String cpf, String telefone)throws ClassNotFoundException, SQLException{
        
        String sql = "INSERT INTO cliente (nome,cpf,telefone) VALUES (?,?,?);";

        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, cpf);
            pst.setString(3, telefone);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!!");
        }
        catch (SQLException ex) {
            Logger.getLogger(Inserts.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
    
    public void insereAnimal(String cpfDono, String tipo, String nomeAnimal, String raca, String estado)throws ClassNotFoundException, SQLException{

        String sql = "INSERT INTO Animal (cpfDono, tipo, nome, raca) VALUES (?,?,?,?);";
        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, cpfDono);
            pst.setString(2, tipo);
            pst.setString(3, nomeAnimal);
            pst.setString(4, raca);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Animal inserido com sucesso!!");
        }
        catch (SQLException ex) {
            Logger.getLogger(Inserts.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
    /*              Pesquisar como consultar o cliente no github*/
    public void buscaCliente(String cpf){
            String sql = "SELECT * FROM  Cliente c WHERE c.cpf = ?;";

            try {
                pst = conecta.prepareStatement(sql);
                pst.setString(1, cpf);
                rs = pst.executeQuery();
                //PEGAR GET DA TABELA
                //TabelaBanda.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                Logger.getLogger(ControllerAtendente.class.getName()).log(Level.SEVERE, null, ex);
            }

    }

    class CadastraListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String Nome, CPF, Telefone, NomeAnimal, Raca;

            Nome = view.getjTextField1().getText();
            CPF = view.getjTextField2().getText();
            Telefone = view.getjTextField3().getText();
            NomeAnimal = view.getjTextField4().getText();
            Raca = view.getjTextField5().getText();

            //model.cadastrar(Nome, CPF, Telefone, NomeCachorro, Raca);
            clientesAtivos.add(model.atende(Nome,CPF,Telefone));
            if(cao){
                clientesAtivos.getLast().AdicionaAnimal(NomeAnimal, Raca, 1);
                cao = false;
               // view.getButtonGroup1().clearSelection();
                
            }else if(gato){
                clientesAtivos.getLast().AdicionaAnimal(NomeAnimal, Raca, 2);
                gato = false;
                //view.getButtonGroup1().clearSelection();
                
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um tipo de Animal");
            }
            
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
        }*/
    }

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

    class AbreVendaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

           
           viewVendas.setVisible(true);
           
            
        }
    }
   
    
}
}
