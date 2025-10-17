/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.softprog.rrhh.dao;

import java.util.List;
import pe.edu.pucp.softprog.dao.IDAO;
import pe.edu.pucp.softprog.rrhh.model.Empleado;

/**
 *
 * @author alons
 */
public interface EmpleadoDAO extends IDAO<Empleado>{
    Empleado obtenerPorDni(String dni);
}
