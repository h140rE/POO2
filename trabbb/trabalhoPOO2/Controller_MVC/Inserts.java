package Controller_MVC;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Inserts {
    Connection conecta = null;
    PreparedStatement pst;
    ResultSet rs;
    public void Insere(String tabela, String valor)throws ClassNotFoundException, SQLException{
        
        String sql = "INSERT INTO Animal (cpfDono, tipo, nome, raca, estado) VALUES ('03834902004', 'c', ?, ?, 'Finalizado');";

        try {
            pst = conecta.prepareStatement(sql);
            pst.setString(1, tabela);
            pst.setString(2, valor);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Artista Inserido Com Sucesso!!");
        }
        catch (SQLException ex) {
            Logger.getLogger(Inserts.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        conecta.close();
    }
}