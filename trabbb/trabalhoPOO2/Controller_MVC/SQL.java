package Controller_MVC;

import Model_MVC.Animal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model_MVC.Cliente;
public class SQL {
    Connection conecta;
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    PostgreSQL p = new PostgreSQL();
    /*
    Com inicializar:
    
        SQL testesql = new SQL(new PostgreSQL().login("postgres","121533"));
        
        após isso, pode ser usadas as funções de SQL
    
    */
    
    public SQL (Connection c)throws ClassNotFoundException,SQLException{
        conecta =c;
    }
    
    
    //INSERTS FUNCIONAM
    public void insereCliente(String nome, String cpf, String telefone)throws ClassNotFoundException, SQLException{
        
        sql = "INSERT INTO cliente (nome,cpf,telefone) VALUES (?,?,?);";
         if (conecta==null)JOptionPane.showMessageDialog(null, "TÁ NULO BURRO!!");
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
    }
    
    public void insereAnimal(String cpfDono, String tipoAnimal, String nomeAnimal, String raca)throws ClassNotFoundException, SQLException{
        String tipo;
        if(tipoAnimal=="1") tipo = "c";
        else tipo = "g";
        sql = "INSERT INTO Animal (cpfDono, tipo, nome, raca) VALUES (?,?,?,?);";
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
    }
    
    public void insereProdutos(String codBarras,String preco, String nome, String quantidade) throws ClassNotFoundException, SQLException{

        sql = "INSERT INTO Produtos (codBarras,preco,nome,quantidade) VALUES (?,?,?,?);";
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
    }
    
    
    //DELETES FUNCIONAM
    public void deleteCliente(String nome, String cpf, String telefone)throws ClassNotFoundException, SQLException{
        
        sql = "DELETE FROM cliente WHERE cpf=?;";

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

    }
    
    public void deleteAnimal(String cpfDono, String nomeAnimal)throws ClassNotFoundException, SQLException{
        sql = "DELETE FROM Animal WHERE cpfDono=? AND nome=?);";
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
    }
    
    public void deleteProduto(String codBarras) throws ClassNotFoundException, SQLException{

        sql = "DELETE FROM Produtos WHERE codBarras=?;";
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
    }
    
    //UPDATES FUNCIONAM
    
    public void updateCliente(String cpf, String nome, String telefone)throws ClassNotFoundException, SQLException{
        
        sql = "UPDATE cliente SET nome=?,telefone=?  WHERE cpf=?;";

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
    }
    
    public void updateAnimal(String cpfDono, String tipoAnimal, String nomeAnimal, String raca)throws ClassNotFoundException, SQLException{
        String tipo;
        if(tipoAnimal=="1") tipo = "c";
        else tipo = "g";
        sql = "UPDATE animal SET raca=?,tipo=?  WHERE cpfDono=? AND nome=?;";
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

    }
    
    public void updateProduto(String codBarras,String preco, String nome, String quantidade) throws ClassNotFoundException, SQLException{

        sql = "UPDATE animal SET preco=?,nome=?,quantidade=?  WHERE codBarras=?;";
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

    }
    
    
    
    public Cliente getClienteBanco (String cpf) throws ClassNotFoundException, SQLException{
        sql = "SELECT * FROM  Cliente c WHERE c.cpf = ?;";
        Cliente c = null;
        int i;
        String cnome,ccpf,ctelefone;
        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            if(rs.next()){
                cnome = rs.getString(1);
                ccpf = rs.getString(2);
                ctelefone = rs.getString(3);
                c = new Cliente(cnome, ccpf, ctelefone);
            }else return null;
            
        }
        catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        return c;
    }
    //tem que colocar o dono do animal poha
    public Animal getAnimalBanco (String cpfDono, String nomeAnimal) throws ClassNotFoundException, SQLException{
        sql = "SELECT * FROM  animal WHERE cpfDono = ? AND nome = ?;";
        Animal c = null;
        int i;
        String cpf, tipo,nome,raca;
        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, cpfDono);
            pst.setString(2, nomeAnimal);
            rs = pst.executeQuery();
            if(rs.next()){
                cpf = rs.getString(1);
                nome = rs.getString(2);
                tipo = rs.getString(3);
                raca = rs.getString(4);
                c = new Animal(nomeAnimal,cpfDono);
            }else return null;
            
        }
        catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        return c;
    }
    
    /*              Pesquisar como consultar o cliente no github*/
    public void buscaCliente(String cpf){
            sql = "SELECT * FROM  Cliente WHERE cpf = ?;";

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
            sql = "SELECT * FROM  Animal c WHERE c.cpfdono = ?;";

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