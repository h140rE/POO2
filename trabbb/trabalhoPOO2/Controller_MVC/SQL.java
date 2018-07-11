package Controller_MVC;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SQL {
    Connection conecta = null;
    PreparedStatement pst;
    ResultSet rs;
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
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
    
    public void insereAnimal(String cpfDono, String tipoAnimal, String nomeAnimal, String raca)throws ClassNotFoundException, SQLException{
        String tipo;
        if(tipoAnimal=="1") tipo = "c";
        else tipo = "g";
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
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
    
    public void insereProdutos(String codBarras,String preco, String nome, String quantidade) throws ClassNotFoundException, SQLException{

        String sql = "INSERT INTO Produtos (codBarras,preco,nome,quantidade) VALUES (?,?,?,?);";
        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, codBarras);
            pst.setString(2, preco);
            pst.setString(3, nome);
            pst.setString(4, quantidade);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto " + nome  +" inserido com sucesso!!");
        }
        catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
    public void deleteCliente(String nome, String cpf, String telefone)throws ClassNotFoundException, SQLException{
        
        String sql = "DELETE FROM cliente WHERE cpf=?;";

        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!!");
        }
        catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
    
    public void deleteAnimal(String cpfDono, String nomeAnimal)throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM Animal WHERE cpfDono=? AND nome=?);";
        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, cpfDono);
            pst.setString(2, nomeAnimal);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Animal removido com sucesso!!");
        }
        catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
    
    public void deleteProduto(String codBarras) throws ClassNotFoundException, SQLException{

        String sql = "DELETE FROM Produtos WHERE codBarras=?;";
        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, codBarras);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto removido com sucesso!!");
        }
        catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
    
    public void updateCliente(String cpf, String nome, String telefone)throws ClassNotFoundException, SQLException{
        
        String sql = "UPDATE cliente SET nome=?,telefone=?  WHERE cpf=?;";

        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, telefone);
            pst.setString(3, cpf);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente "+ nome +" atualizado com sucesso!!");
        }
        catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
    
    public void updateAnimal(String cpfDono, String tipoAnimal, String nomeAnimal, String raca)throws ClassNotFoundException, SQLException{
        String tipo;
        if(tipoAnimal=="1") tipo = "c";
        else tipo = "g";
        String sql = "UPDATE animal SET raca=?,tipo=?  WHERE cpfDono=? AND nomeAnimal=?;";
        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, raca);
            pst.setString(2, tipo);
            pst.setString(3, cpfDono);
            pst.setString(4, nomeAnimal);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Animal atualizado com sucesso!!");
        }
        catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
    
    public void updateProduto(String codBarras,String preco, String nome, String quantidade) throws ClassNotFoundException, SQLException{

        String sql = "UPDATE animal SET preco=?,nome=?,quantidade=?  WHERE codBarras=?;";
        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, preco);
            pst.setString(2, nome);
            pst.setString(3, quantidade);
            pst.setString(4, codBarras);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto " + nome  +" inserido com sucesso!!");
        }
        catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public void buscaAnimal(String cpf){
            String sql = "SELECT * FROM  Animal c WHERE c.cpfdono = ?;";

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
}