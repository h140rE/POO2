package Controller_MVC;
import java.sql.*;
import javax.swing.JOptionPane;
//Nome do BD:       ZikaPET
//Nome do Schema:   zikapet
public class PostgreSQL {
    private final String url = "jdbc:postgresql://localhost:5432/ZikaPET?currentSchema=zikapet";
    private static Connection conectionSigleton;
    public PostgreSQL(){};
    
    public Connection getBanco(String user, String password) throws ClassNotFoundException{
        try{
            Class.forName("org.postgresql.Driver");
            if (conectionSigleton == null){
                Connection conectionSigleton = DriverManager.getConnection(url,user,password);
            }
            return conectionSigleton;
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
    }
    public void fechaBanco() throws SQLException{
        if (conectionSigleton != null)
            conectionSigleton.close();
    }
}