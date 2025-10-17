/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softprog.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import pe.edu.pucp.softprog.rrhh.mysql.AreaMySQL;
import pe.edu.pucp.softprog.rrhh.model.*;

/**
 *
 * @author alons
 */

public class Principal {
    public static void main(String[] args){
//        try{
//            //Registrar el driver de conexión
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //Realizar(Abrir) la conexión con la BD
//            Connection con = DriverManager.getConnection("jdbc:mysql://" + "db-alonsopg-mysql."
//                + "cypjaoqrely4."
//                + "us-east-1."
//                + "rds.amazonaws.com/DBMySQL", "DBAlonsoPGMySQL", "AlonsoPG.20193608");
//            
//            System.out.println("Se ha efectuado la conexion");
//            
//            Statement st = con.createStatement(); //Me permite crear una sentencia para sql
//            //String sql="INSERT INTO Area(nombre, activo) "
//            //        + "VALUES('Finanzas', 1)"; //Creamos la sentencia
//            
//            //st.executeUpdate(sql); //Ejecutamos la sentencia
//            //System.out.println("Se ha registrado el area");
//            
//            String sql = "UPDATE Area SET activo=0 WHERE id_area=2";
//            st.executeUpdate(sql);
//            System.out.println("Se ha actualizado el estado del area");
//            
//            sql="SELECT id_area, nombre, activo FROM Area";
//            
//            //Ahora lo que quiero hacer es que se imprima todos los valores de la tabla
//            //Para eso tenemos que ubicarnos al inicio de esta
//            ResultSet rs = st.executeQuery(sql);
//            while(rs.next()){ //Mientras el rs pueda avanzar de línea
//                System.out.print(rs.getInt("id_area") + "|");
//                System.out.print(rs.getString("nombre") + "|");
//                System.out.print(rs.getInt("activo") + "\n");
//            }
//            
//            con.close();
//        }catch(Exception exception){
//            System.out.println("Error al intentar conectar con la BD: " + exception.getMessage());
//        }

        Area area = new Area("Recursos Humanos");
        AreaMySQL areaImpl= new AreaMySQL();
        
        areaImpl.insertar(area);
        
    }
}
