package pe.edu.pucp.softprog.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager {
    
    private Connection con;
    private final String url = "jdbc:mysql://db-alonsopg-mysql.cypjaoqrely4.us-east-1.rds.amazonaws.com/DBMySQL";
    private final String username = "DBAlonsoPGMySQL";
    private final String password = "AlonsoPG.20193608";
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        }catch(Exception ex){
            System.out.println("Error al intentar conectar con la BD: " + ex.getMessage());
        }
        return con;
    }
    
    public void cerrarConexion(){
        try{
            con.close();
        }catch(Exception ex){
            System.out.println("No se logro cerrar la conexion a la base de datos" + ex.getMessage());
        }
    }
}
