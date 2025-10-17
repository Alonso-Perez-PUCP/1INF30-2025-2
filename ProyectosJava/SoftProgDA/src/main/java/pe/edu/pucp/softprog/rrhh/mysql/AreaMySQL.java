package pe.edu.pucp.softprog.rrhh.mysql;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import pe.edu.pucp.softprog.config.DBManager;
import pe.edu.pucp.softprog.rrhh.dao.AreaDAO;
import pe.edu.pucp.softprog.rrhh.model.Area;

public class AreaMySQL implements AreaDAO{

    private Connection con;
    private Statement st;
    private DBManager db;
    
    @Override
    public int insertar(Area area) {
        int resultado=0;
        try{
            db=new DBManager();
            con=db.getConnection();
            
            st = con.createStatement();
            String sql="INSERT INTO Area(nombre, activo) VALUES('" + area.getNombre()+ "', 1)";
            st.executeUpdate(sql);
            resultado=1;
        }catch(Exception ex){
            System.out.println("No se pudo ingresar el area: " + ex.getMessage());
            return 0;
        }finally{
            db.cerrarConexion();
        }
        return resultado;
    }

    @Override
    public int modificar(Area area) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar(int idArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Area buscarPorID(int idArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Area> listarTodas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
